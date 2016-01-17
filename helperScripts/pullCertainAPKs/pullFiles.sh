#!/bin/bash

	## Description: Pulls files as defined in an input list to a seperate output folder
	##		The intention is that these files would be scanned later on.

	### Todo:
	##		Log what was pulled	
	##		

	clear;

	outputdir=output
	mkdir -p $outputdir
	mkdir -p logs
	
	logLocation=logs/pullFiles.log
	touch $logLocation

	foundLog=logs/found.log
	touch $foundLog

	NotfoundLog=logs/Notfound.log
	touch $NotfoundLog

	#inputDir=testtarget
	inputDir=/scratch/alreadyscanned


#	inputlist=pullList.txt
	inputlist=combined.lst


	# Clear the contents of the log files



	### -- Debugging only
	## Clear out the output dir and log files
	rm -rf $outputdir/*

	### -- End Debugging only

	### Find the file in the input dir. Will need to scan many subdirectories


	### Now loop through the input file
	while read p; do
  		#echo $p
  		### Find each item in the list, and copy it to the output dir
  		fileFound=false


  		echo "Looking for: " $p


  		FILES=$(find $inputDir -type f -name $p'.apk')
		for f in $FILES
		do

			## Once the file is found, copy it over
			#echo $f
			echo "copy " $f
# Lets wait on copying the file
#			cp $f $outputdir

			## Write it to the log
			echo "copy " $f `date` >> $logLocation

			#fileName=$(basename $f)
			#let COUNTER+=1

			#cp $f $destinationDir
			#echo "**** $COUNTER)Copy File: $f" `date` >> $logFile

			## Log the file as being found
			fileFound=true
			echo $f >> $foundLog


		done

		## Check to log that the file was not found
		#if [[ $fileFound eq false ]]; then
		if [ $fileFound == "false" ]; then
			echo $p >> $NotfoundLog	
		#else
		#	echo $p "true"
		fi

	done <$inputlist

	### Put a seperator into the log
	echo " ----------------- Done ----------- " $f `date` >> $logLocation
	echo " ----------------- Done ----------- " `date` >> $NotfoundLog
	echo " ----------------- Done ----------- " `date` >> $foundLog
	### Doesnt work echo " " >> $logLocation ## blank space



