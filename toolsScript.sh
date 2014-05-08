#!/bin/bash

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
EXPECTED_ARGS=1
if [ $# -ne $EXPECTED_ARGS ] then
	APK_Input_Path=scraper/downloads/full/
else 
	APK_Input_Path=$1
fi

./runstowaway.sh $APK_Input_Path

./androguard.sh $APK_Input_Path



cd ../../

echo "Start java Analysis:" `date` >> $logLocation
#./tools/java_Analysis/RunAll.sh $APK_Input_Path


#### Log the conclusion time
date2=$(date +"%s")
diff=$(($date2-$date1))
echo "toolsScript Total Running Time $(($diff / 60)) minutes and $(($diff % 60)) seconds."  >> $logLocation
echo "toolsScript End:" `date` >> $logLocation


### Now we do all the commiting ##
echo "FIX              Commit Logs and Database to Github"
##if this is the VM then run this
##put the password into it
#git commit logs/* -m "Committing the logs for the night"
#git commit Evolution\ of\ Android\ Applications.sqlite -m "Committing the database for the night"
#git push origin master


echo "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"

