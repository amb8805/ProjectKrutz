import re
import sqlite3
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
        try:
            self.conn.execute('SELECT MAX(ApkUniqueID) FROM ApkInformation')
            result = self.conn.fetchone()

            # Create the next unique identifier. If the first item
            # is being inserted into the database, its id is 1.
            if result is not None:
                item['id'] = result[0] + 1
            else:
                item['id'] = 1
            return item
        except Exception as e:
            raise DropItem('An error occurred: %s' % e.message)

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
            self.conn.execute('INSERT INTO ApkInformation (Name, Version, Rating, DatePublished, FileSize, NumberOfDownloads, URL, Genre, OSSupported, Developer, SourceID) VALUES(?,?,?,?,?,?,?,?,?,?,?)', (item['name'], item['software_version'],item['score'], item['date_published'], item['file_size'], item['num_downloads'], item['url'], item['genre'], item['operating_systems'], item['developer'], item['source_id']))
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

# Names the downloaded file with its unique identifier
class APKFilesPipeline(FilesPipeline):
    def file_path(self, request, response=None, info=None):
        media_ext = path.splitext(request.url)[1]

        # For Google Play spider, which yields something along the lines of ".apk?h=syrPj2oViqBMGpbX5XEB7g&t=1396043020"
        if len(media_ext) > 4 and media_ext.startswith('.apk'):
            media_ext = media_ext[:4]

        # Ignore any files that are not APK files
        elif media_ext != '.apk':
            raise DropItem('File is not an APK file: %s' % request.url)

        return 'full/%s%s' % (item['id'], media_ext)
