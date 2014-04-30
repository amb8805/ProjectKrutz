import re
import uuid
import sqlite3
import requests
from os import path
from scrapy import log
from scrapy import signals
from scrapy.exceptions import DropItem
from scrapy.xlib.pydispatch import dispatcher
from scrapy.contrib.pipeline.files import FilesPipeline
from scrapy.http import Request
from scraper.items import ApkItem

# Creates a unique identifier for the APK
class UniqueIdentifierPipeline(object):
    def process_item(self, item, spider):
        item['id'] = str(uuid.uuid4())
        return item

# Stores the APK information in the database
class SQLiteStorePipeline(object):
    filename = '../Evolution of Android Applications.sqlite'
    
    def __init__(self):
        self.conn = None
        dispatcher.connect(self.initialize, signals.engine_started)
        dispatcher.connect(self.finalize, signals.engine_stopped)

    # Tries to insert the APK file's information into the database.
    # If an error occurs or the APK file is a duplicate, the APK file 
    # is not downloaded and the APK file's information is not inserted 
    # into the database.
    def process_item(self, item, spider):
        try:
            self.conn.execute('INSERT INTO ApkInformation (Name, Version, Developer, Genre, UserRating, DatePublished, FileSize, NumberOfDownloads, OperatingSystems, URL, SourceId, ApkId) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)', (item['name'], item['software_version'], item['developer'], item['genre'], item['score'], item['date_published'], item['file_size'], item['num_downloads'], item['operating_systems'], item['url'], item['source_id'], item['id']))
            return item
        except Exception as e:
            raise DropItem('%s <%s>' % (e.message, item['url']))

    def initialize(self):
        if path.exists(self.filename):
            self.conn = sqlite3.connect(self.filename)
        else:
            log.msg('File does not exist: %s' % self.filename, level=log.ERROR)
 
    def finalize(self):
        if self.conn is not None:
            self.conn.commit()
            self.conn.close()
            self.conn = None

# Sends a POST request to Evozi to get download link for Google Play apps
class EvoziPipeline(object):
    def process_item(self, item, spider):
        if item['source_id'] == 2:
            package_name = item['url'][item['url'].find('id=') + 3:]
            download_page = requests.get('http://apps.evozi.com/apk-downloader/')

            var_key = re.search("data:\s+{packagename:\s+packagename,\s+([-\w]*):\s+[-\w]*,", download_page.text, re.MULTILINE).group(1)
            var_name, var_value = re.search("var\s+fetched_desc = '';\r*\n*\s+var\s+(\w*)\s+=\s+\"([-\w]*)\";", download_page.text, re.MULTILINE).groups()
            timestamp = re.search(", t: (\w*)", download_page.text, re.MULTILINE).group(1)

            data = {
                'packagename': package_name,
                var_key: var_value,
                't': timestamp,
                'fetch': 'false'
            }

            post_data = requests.post('http://api.evozi.com/apk-downloader/download', data=data).json()

            if post_data['status'] == 'error':
                raise DropItem('%s <%s>' % (post_data['data'], item['url']))
            else:
                item['file_urls'] = [post_data['url']]
                return item
        else:
            return item

# Names the downloaded file with its unique identifier
class APKFilesPipeline(FilesPipeline):
    def get_media_requests(self, item, info):
        return [Request(x, meta={'apk_id': item['id']}) for x in item.get(self.FILES_URLS_FIELD, [])]

    def file_path(self, request, response=None, info=None):
        media_ext = path.splitext(request.url)[1]

        # For Google Play spider, which yields something along the lines of ".apk?h=syrPj2oViqBMGpbX5XEB7g&t=1396043020"
        if len(media_ext) > 4 and media_ext.startswith('.apk'):
            media_ext = media_ext[:4]
        # Ignore any files that are not APK files
        elif media_ext != '.apk':
            raise DropItem('File is not an APK file: %s' % request.url)

        return 'full/%s%s' % (request.meta['apk_id'], media_ext)
