#!/bin/bash 

	# Description: This script copies all unique files and folders into the destination directory

	## Top directory to be searched
	targetDir=source

	## Main directory to copy all files to 
	destinationDir=destination

	logFile=logs/copyLog.log

	# Create the log directory

	mkdir -p logs
	touch $logFile


	date1=$(date +"%s") # Start Run Time
	#### Add Starting message into Logs
	echo "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^" >> $logFile
	echo "Copy Start:" `date` >> $logFile



	### Copy the files to the target directory

	#cp -R $targetDir $destinationDir

	### Loop through all files in all sub directories with .apk extension
	COUNTER=0

	FILES=$(find $targetDir -type f -name '*.apk')
		for f in $FILES
		do
			fileName=$(basename $f)
			let COUNTER+=1

			cp $f $destinationDir
			echo "**** $COUNTER)Copy File: $f" `date` >> $logFile
			
	done
	echo "Total Files Copied: $COUNTER" >> $logFile


	date1=$(date +"%s") # Start Run Time
	#### Add Starting message into Logs
	echo "Copy End:" `date` >> $logFile

	echo "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^" >> $logFile




