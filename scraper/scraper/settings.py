BOT_NAME = 'scraper'

SPIDER_MODULES = ['scraper.spiders']
NEWSPIDER_MODULE = 'scraper.spiders'

ITEM_PIPELINES = {
	# 'scraper.pipelines.UniqueIdentifierPipeline' : 100,
	# 'scraper.pipelines.SQLiteStorePipeline' : 300,
	# 'scraper.pipelines.APKFilesPipeline' : 800,
}

DOWNLOADER_MIDDLEWARES = {
	# 'scraper.middlewares.ProxyMiddleware' : 100,
}

FILES_STORE = './downloads'

DOWNLOAD_DELAY = 0.25

COOKIES_ENABLED = False

PROXY_LIST = [
	{
		'type'	: 'https',
		'ip'	: '119.31.123.207',
		'port'	: '8000'
	},
	{
		'type'	: 'https',
		'ip'	: '203.172.248.70',
		'port'	: '3128'
	},
	{
		'type'	: 'https',
		'ip'	: '88.255.147.83',
		'port'	: '8080'
	},
	{
		'type'	: 'http',
		'ip'	: '220.248.180.149',
		'port'	: '3128'
	},
	{
		'type'	: 'https',
		'ip'	: '202.107.231.153',
		'port'	: '8088'
	},
	{
		'type'	: 'http',
		'ip'	: '189.208.57.239',
		'port'	: '8080'
	},
	{
		'type'	: 'http',
		'ip'	: '195.103.219.108',
		'port'	: '8080'
	},
	{
		'type'	: 'http',
		'ip'	: '218.28.96.39',
		'port'	: '3128'
	},
	{
		'type'	: 'https',
		'ip'	: '222.124.149.178',
		'port'	: '3128'
	}
]

# Crawl responsibly by identifying yourself (and your website) on the user-agent
# USER_AGENT = 'APK File Scraper (+https://github.com/amb8805/ProjectKrutz)'

USER_AGENT = 'Mozilla/5.0 (Windows; U; Windows NT 5.0; en-US; rv:1.4b) Gecko/20030516 Mozilla Firebird/0.6'