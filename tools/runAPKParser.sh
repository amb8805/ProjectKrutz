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
	logFile=runAPKParser.log

	## Make sure that the logs directory exists
	mkdir -p $logDir 

	### Delete the log file if it exists
	rm -f $logDir/*.log  

	touch $logDir/$logFile

	date1=$(date +"%s") # Start Run Time
	#### Add Starting message into Logs
	echo "APKParser Start:" `date` >> $logDir/$logFile



	### Loop through all files in the apk directory and pass them to the APK parser script
	###		This is done on an individual apk file basis to limit the impact of problems
	FILES=$(find $inputLocation -maxdepth 1 -type f  -name '*.apk')
	for f in $FILES
	do
		## Create a log for each file being analyzed
		echo "--->APKParser:" `date` " : File: `echo $f`" >> $logDir/$logFile
		

		#echo $f
	
		### Call the java application to do the analyzing
		cd tools/CustomJava/src/
		echo "---->Analyzing" $f
		javac dk/*.java; java -classpath ".:sqlite-jdbc-3.7.2.jar" dk/apkparserMain ../../../$f
		cd ../../../


	done
