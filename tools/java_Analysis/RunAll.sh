#!/bin/bash 

### Description: 
#	Converts all APK files to java class files
#	Analyzes the 


#### Input location for all apk files
## This will need to be changed based on the final configuration
inputLocation=../APKInputfiles



#ls $inputLocation

## Make sure that the logs directory exists
mkdir -p logs 

## Create manifest file inside of APK-> Java Conversion
### No needed for now
#./mkmanifest.sh APK_to_JAVA

#
### Perform java conversion of APK files to java
#./APK_to_JAVA/convert_APK_Java.sh $inputLocation


### Perform Findbugs
./findbugs/findbugs.sh

#dan=`./findbugs/findbugs.sh` 
#echo test
#echo Values: $dan
#echo done

### Find the clones in the system
#./CloneDetection/runclones.sh

### Remove un-needed files
### No needed for now
#./rmjunk.sh APK_to_JAVA



### Check the logs into git




#### Todo: 
# Add Logging
# Place results into database