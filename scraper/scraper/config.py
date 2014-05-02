#separator used by search.py, categories.py, ...
SEPARATOR = ';'

LANG            = 'en_US' # can be en_US, fr_FR, ...
ANDROID_ID      = '32cdc659b96fe732'
GOOGLE_LOGIN    = 'projectkrutz@gmail.com'
GOOGLE_PASSWORD = 'ProjectKrutz1'
AUTH_TOKEN      = None

# force the user to edit this file
if any([each == None for each in [ANDROID_ID, GOOGLE_LOGIN, GOOGLE_PASSWORD]]):
    raise Exception('config.py not updated')

