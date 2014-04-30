BOT_NAME = 'scraper'

SPIDER_MODULES = ['scraper.spiders']
NEWSPIDER_MODULE = 'scraper.spiders'

ITEM_PIPELINES = {
	'scraper.pipelines.UniqueIdentifierPipeline' : 100,
	'scraper.pipelines.SQLiteStorePipeline' : 300,
	'scraper.pipelines.APKFilesPipeline' : 800,
}

DOWNLOADER_MIDDLEWARES = {
	'scraper.middlewares.RandomUserAgentMiddleware' : 200,
	'scraper.middlewares.ProxyMiddleware' : 400,
	'scrapy.contrib.downloadermiddleware.useragent.UserAgentMiddleware' : None,
}

FILES_STORE = './downloads'

DOWNLOAD_DELAY = 0.25

COOKIES_ENABLED = False

# Need to be proxies from the USA to gather data in English
PROXY_LIST = [
	'https://209.239.112.104:3128',
	'https://192.3.25.99:8089',
	'http://107.6.182.49:3128',
	'https://208.108.209.198:3128',
	'https://192.3.25.99:7808',
	'http://209.239.112.104:3128',
	'http://72.167.205.120:80',
	'http://96.56.105.66:7004',
	'https://209.239.113.15:3128'
]

USER_AGENT_LIST = [
	'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/537.13+ (KHTML, like Gecko) Version/5.1.7 Safari/534.57.2',
	'Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:1.4b) Gecko/20030516 Mozilla Firebird/0.6',
	'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/36.0.1944.0 Safari/537.36',
	'Mozilla/5.0 (compatible; MSIE 10.0; Windows NT 6.1; WOW64; Trident/6.0)',
	'Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0',
	'Mozilla/5.0 (X11; Linux x86_64; rv:28.0) Gecko/20100101 Firefox/28.0'
]

# Crawl responsibly by identifying yourself (and your website) on the user-agent
# USER_AGENT = 'APK File Scraper (+https://github.com/amb8805/ProjectKrutz)'
