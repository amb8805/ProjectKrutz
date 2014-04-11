#!/bin/bash 
### Will create the manifest file to be referenced as the files NOT to be deleted

echo "Create Manifest"
echo $1

#find . -print | sed 's/[]\[/.()&]/\\&/g' | sed 's;.*;/^&$/d;' > manifest.sed

echo "File Manifest Created"