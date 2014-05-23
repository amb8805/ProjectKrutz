#!/bin/bash

# Unless otherwise noted by pushd or cd, you should always be in the overall Project Krutz directory
# This is the same for runstowaway, 


clear

echo "The script starts now"
echo

rm -f logs/*.log
rm -rf logs/AndroRiskOutput

date1=$(date +"%s") ## Start date of the script
logLocation=logs/toolsScript.log
touch $logLocation
echo "toolsScript Start:" `date` >> $logLocation


if [ $(date +%u) -eq 1 ]
then
        echo "today is Monday"
elif [ $(date +%u) -eq 2 ]
then
        echo "today is Tuesday"
elif [ $(date +%u) -eq 3 ]
then
        echo "today is Wednesday"
elif [ $(date +%u) -eq 4 ]
then
        echo "today is Thursday"
elif [ $(date +%u) -eq 5 ]
then
        echo "today is Friday"
fi

# Check to make sure that an argument is actually passed in
APK_Input_Path="scraper/downloads/full/"
EXPECTED_ARGS=1
if [ $# -eq $EXPECTED_ARGS ]
then
	APK_Input_Path=$1
fi

### Leave this disabled for now
#./runstowaway.sh $APK_Input_Path


./androguard.sh $APK_Input_Path


echo "Start java Analysis:" `date` >> $logLocation
./tools/java_Analysis/RunAll.sh $APK_Input_Path

## Run the script to modify the apkInformation 
#./modifyAPKInformationDB.sh



### Gather apk information
echo "Start Java APK Parser:" `date` >> $logLocation
cd tools/CustomJava/src/
		#javac dk/*.java; java -classpath ".:sqlite-jdbc-3.7.2.jar" dk/apkparserMain /home/darwin/ProjectKrutz/scraper/downloads/full/

	javac dk/*.java; java -classpath ".:sqlite-jdbc-3.7.2.jar" dk/apkparserMain ../../../scraper/downloads/full/
cd ../../../
echo "End Java APK Parser:" `date` >> $logLocation

echo "Start Checking into GitHub:" `date` >> $logLocation
./checkAllIntoGitHub.sh

#### Log the conclusion time
date2=$(date +"%s")
diff=$(($date2-$date1))
echo "toolsScript Total Running Time $(($diff / 60)) minutes and $(($diff % 60)) seconds."  >> $logLocation
echo "toolsScript End:" `date` >> $logLocation



echo "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"

