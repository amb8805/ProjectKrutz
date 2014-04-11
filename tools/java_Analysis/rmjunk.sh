#!/bin/bash 
### Remove all files not in the manifest file

echo "Remove Junk"


### File count not working
#startFileCount=`find . -type f -printf "%T@ %p\n" | sort -nr | cut -d\  -f2-`;

### Check to make sure the manifest file exists. This eliminates the possibility of deleting all files
if [ -f manifest.sed ]; then
	#echo "File exists" 
	### Delete all of the created files
	rm -rf `find . -print | sed -f manifest.sed`
else 
	echo "Manifest File Not Found"
	exit
fi

#endFileCount=`find . -type f -printf "%T@ %p\n" | sort -nr | cut -d\  -f2-`;
#echo "Files Removed:" `expr $startFileCount - $endFileCount`