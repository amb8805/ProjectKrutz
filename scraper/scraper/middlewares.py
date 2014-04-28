import random

class ProxyMiddleware(object):
	def __init__(self, settings):
		self.proxy_list = settings.get('PROXY_LIST')

	@classmethod
	def from_crawler(cls, crawler):
		return cls(crawler.settings)

	def process_request(self, request, spider):
		proxy = random.choice(self.proxy_list)

		log.msg('Downloading using <%s>' % proxy, level=log.INFO)

		request.meta['proxy'] = '%s://%s:%s' % (proxy['type'], proxy['ip'], proxy['port'])

	def process_exception(self, request, exception, spider):
		proxy = request.meta['proxy']
		log.msg('Failed proxy <%s>' % (proxy, len(self.proxy_list)), level=log.WARNING)