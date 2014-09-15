#!/bin/bash 

	### Description: 
	###		Runs the apkParser Java script.


	EXPECTED_ARGS=1
	E_BADARGS=65
	if [ $# -ne $EXPECTED_ARGS ]
	then
	  echo "Usage: `basename $0` {arg}"
	  echo "No Expected Input Parameter found"
	#  exit $E_BADARGS
		exit
	fi

	inputLocation=$1 ### The passed in input location of the .apk files which are to be analyzed


	logDir=logs
	logFile=runGetSigningKey.log

	## Make sure that the logs directory exists
	mkdir -p $logDir 

	### Delete the log file if it exists
	rm -f $logDir/*.log  

	touch $logDir/$logFile

	date1=$(date +"%s") # Start Run Time
	#### Add Starting message into Logs
	echo "APKParser Start:" `date` >> $logDir/$logFile

	### Create the temp toutput directory for storing the unzipped apk files
	tempUnzipDir=tools/signingkey/tempoutput/
	mkdir -p $tempUnzipDir


	### Add the singing key to the tools table
	### Function



	### Loop through all files in the apk directory and pass them to the APK parser script
	###		This is done on an individual apk file basis to limit the impact of problems
	FILES=$(find $inputLocation -maxdepth 1 -type f  -name '*.apk')
	for f in $FILES
	do
		## Create a log for each file being analyzed
		echo "--->GetSigningkey:" `date` " : File: `echo $f`" >> $logDir/$logFile
		

		echo $f


		### Unzip the apk file
		echo "unzip file"
#		unzip $f -d $tempUnzipDir


		### Get the key
		### notroot@ubuntu:~/shared/ProjectKrutz/tempanalyze/Gmail$ keytool -printcert -v -file META-INF/CERT.RSA 
		keytool -printcert -v -file $tempUnzipDir/META-INF/CERT.RSA  

		### Parse the results


		### Put the results into the database table






		### Delete the temp file
#		rm -rf $tempUnzipDir
		
		### Get the signing key information and add it to the database.
		

	done


