#!/bin/bash 

### Description: 
#	Converts all APK files to java class files
#	Analyzes the 


#### Check to make sure that java is installed
#### Probably change this to check for open jdk ?

if type -p java; then
    echo "Java Found"
else
    echo "Java not found"
	exit
fi




#### Input location for all apk files
## This will need to be changed based on the final configuration
inputLocation=../testAndroidApps
logDir=logs
logFile=runAll.log

#ls $inputLocation

## Make sure that the logs directory exists
mkdir -p $logDir 

### Delete the log file if it exists
rm -f $logDir/*.log


touch $logDir/$logFile


date1=$(date +"%s") # Start Run Time
#### Add Starting message into Logs
echo "RunAll Start:" `date` >> $logDir/$logFile




#### Add message about starting Java conversion to logs

### Perform java conversion of APK files to java
echo "Java Conversion:" `date` >> $logDir/$logFile
./APK_to_JAVA/convert_APK_Java.sh $inputLocation


### Perform Findbugs
### This is git commented out because it takes too long to run
#./findbugs/findbugs.sh

### This code is being left in 
#### dan=`./findbugs/findbugs.sh` 
##### echo test
###### echo Values: $dan
###### echo done




### Find the clones in the system
echo "Clones:" `date` >> $logDir/$logFile
./CloneDetection/runclones.sh




#### CheckStyle
echo "CheckStyle:" `date` >> $logDir/$logFile
./checkstyle/CheckStyle.sh



date2=$(date +"%s")
diff=$(($date2-$date1))
echo "RunAll End:" `date` >> $logDir/$logFile
echo "Total Time $(($diff / 60)) minutes and $(($diff % 60)) seconds."  >> $logDir/$logFile




#### Todo: 
# Add Logging
# Place results into database
# Check logs into git
# Remove java and .class files at the end

