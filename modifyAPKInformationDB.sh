#!/bin/bash

### Description: This will modify or add informtion to the SQLite APKInformation Table
###			This will ultimately be refactored and placed into 

#### Directory of APK files to be analyzed
#apkInputDir


#### Loop through all of the apk files in the directory
#FILES=$(find $inputDir -type f -name '*.apk')
#	for f in $FILES
#	do

	### Modify the minimum operating system
	# If the minimum OS is 1.3 and up, the column "ModifiedOS" should read 1.3


	### Get the size of the apk file & Update the "GeneratedFileSize column" 
	## Analyze the examined apk file and get its file size. This file size should then be recorded and put into the DB.
	#  du -sk <fileName>   should work


	#### Generate the modified PublicationDate
	# Right now the DatePublishedDate is April 5, 2014
	# This should be saved in the "ModifiedDatePublished" column as 4/5/2014

#done

	
	
echo hello


#### Put everything into logs
# 

