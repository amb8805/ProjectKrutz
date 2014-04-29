import random
from scrapy import log

class ProxyMiddleware(object):
	def __init__(self, settings):
		self.proxy_list = settings.get('PROXY_LIST')

	@classmethod
	def from_crawler(cls, crawler):
		return cls(crawler.settings)

	def process_request(self, request, spider):
		proxy = random.choice(self.proxy_list)
		request.meta['proxy'] = '%s://%s:%s' % (proxy['type'], proxy['ip'], proxy['port'])