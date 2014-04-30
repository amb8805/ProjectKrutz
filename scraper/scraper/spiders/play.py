import re
import requests
from scrapy import log
from scrapy.selector import Selector
from scraper.items import ApkItem
from key import api_key

# Parse the information for an individual APK from the Google Play store
def parse_app(response):
    sel = Selector(response)
    item = ApkItem()

    # Special logic for GooglePlaySpider
    if response.meta['come_from'] == 'googleplay':

        item['source_id'] = 2

        price = sel.xpath('//meta[@itemprop="price"]/@content').extract()[0]

        # We are only downloading free apps
        if price != '0':
            log.msg('Not a free app, skipping item: %s' % response.url, level=log.INFO)
            return

        package_name = response.url[response.url.find('id=') + 3:]

        ### USING API KEY: ###
        # data = {
        #     'packagename': package_name,
        #     'fetch': 'false',
        #     'api_key': api_key
        # }
        ######################

        download_page = requests.get('http://apps.evozi.com/apk-downloader/')

        ### NOT USING API KEY: ###
        var_key = re.search("data:\s+{packagename:\s+packagename,\s+([-\w]*):\s+[-\w]*,", download_page.text, re.MULTILINE).group(1)
        var_name, var_value = re.search("var\s+fetched_desc = '';\r*\n*\s+var\s+(\w*)\s+=\s+\"([-\w]*)\";", download_page.text, re.MULTILINE).groups()
        timestamp = re.search(", t: (\w*)", download_page.text, re.MULTILINE).group(1)

        data = {
            'packagename': package_name,
            var_key: var_value,
            't': timestamp,
            'fetch': 'false'
        }
        ##########################

        evozi_response = requests.post('http://api.evozi.com/apk-downloader/download', data=data)
        post_data = evozi_response.json()

        if evozi_response.status_code != 200:
            log.msg('A %d error occurred <%s>' % (evozi_response.status_code, response.url))
            if post_data['status']:
                print post_data['status']
            return
        if post_data['status'] == 'error':
            log.msg('%s <%s>' % (post_data['data'], response.url), level=log.ERROR)
            return

        item['url'] = response.url
        item['file_urls'] = [post_data['url']]

    # Logic for all other Spider objects
    else:
        item['url'] = response.meta['url']
        item['file_urls'] = response.meta['file_urls']

        if response.meta['come_from'] == 'apktop':
            item['source_id'] = 3
        elif response.meta['come_from'] == 'teamapk':
            item['source_id'] = 4
        elif response.meta['come_from'] == 'fdroid':
            item['source_id'] = 5
        else:
            item['source_id'] = 1

    info_container = sel.xpath('//div[@class="info-container"]')
    item['name'] = info_container.xpath('//div[@class="document-title"]/div/text()').extract()[0]
    item['developer'] = info_container.xpath('//div[@itemprop="author"]/a/span[@itemprop="name"]/text()').extract()[0]
    item['genre'] = info_container.xpath('//span[@itemprop="genre"]/text()').extract()[0]

    score_container = sel.xpath('//div[@class="score-container"]')
    item['score'] = score_container.xpath('//div[@class="score"]/text()').extract()[0]

    additional_information = sel.xpath('//div[@class="details-section metadata"]')
    item['date_published'] = additional_information.xpath('//div[@itemprop="datePublished"]/text()').extract()[0]
    item['file_size'] = additional_information.xpath('//div[@itemprop="fileSize"]/text()').extract()[0].strip()
    item['num_downloads'] = additional_information.xpath('//div[@itemprop="numDownloads"]/text()').extract()[0].strip()
    item['software_version'] = additional_information.xpath('//div[@itemprop="softwareVersion"]/text()').extract()[0].strip()
    item['operating_systems'] = additional_information.xpath('//div[@itemprop="operatingSystems"]/text()').extract()[0].strip()

    yield item
