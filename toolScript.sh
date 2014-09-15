#!/bin/bash

	### Description: 
	##	Invokes all analysis scripts on apk files

	clear

	date1=$(date +"%s") ## Start date of the script
	logLocation=logs/toolsScript.log
	touch $logLocation

	# Check to make sure that an argument is actually passed in
	APK_Input_Path="scraper/downloads/full/"
	EXPECTED_ARGS=1
	if [ $# -eq $EXPECTED_ARGS ]
	then
		APK_Input_Path=$1
	fi

	### Make sure the Androrisk files are gone
	### These can cause problems
	rm -rf logs/AndroRiskOutput/

	echo "Start Stowaway Analysis:" `date` >> $logLocation
#	./tools/stowaway/run_stowaway.sh $APK_Input_Path

	echo "Start Androguard:" `date` >> $logLocation
#	./androguard.sh $APK_Input_Path

	echo "Start java Analysis:" `date` >> $logLocation
#	./tools/java_Analysis/RunAll.sh $APK_Input_Path

	## Run the script to modify the apkInformation 
	echo "Start ModifyAPKInformation:" `date` >> $logLocation
#	./modifyAPKInformationDB.sh $APK_Input_Path


	### Run script to get information from the manifest.xml file
	echo "Start APKParser:" `date` >> $logLocation
#	./tools/runAPKParser.sh $APK_Input_Path

	### Get the Key used to sign the apk
	echo "Start Getting Signing Key:" `date` >> $logLocation
	./tools/signingkey/runGetSigningKey.sh $APK_Input_Path



	#### Log the conclusion time
	date2=$(date +"%s") 
	diff=$(($date2-$date1))
	echo "toolsScript Total Running Time $(($diff / 60)) minutes and $(($diff % 60)) seconds."  >> $logLocation
	echo "toolsScript End:" `date` >> $logLocation

	echo "!!!!!!!!!!!!!!!!!DONE!!!!!!!!!!!!!!!!!!!!!!!!!"
