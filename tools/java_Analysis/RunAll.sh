#!/bin/bash 

#### Description: Invokes the creation of all

## Make sure that the logs directory exists
mkdir -p logs 

## Create manifest file inside of APK-> Java Conversion
### No needed for now
#./mkmanifest.sh APK_to_JAVA

#
### Perform java conversion of APK files to java

	#./APK_to_JAVA/convert_APK_Java.sh



### Perform Findbugs
#./findbugs/findbugs.sh 


### Find the clones in the system
./CloneDetection/runclones.sh

### Remove un-needed files
### No needed for now
#./rmjunk.sh APK_to_JAVA



### Check the logs into git




#### Todo: 
# Add Logging
# Place results into database