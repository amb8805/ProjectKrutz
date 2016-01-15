#!/bin/bash

	## Description: Pulls files as defined in an input list to a seperate output folder
	##		The intention is that these files would be scanned later on.

	### Todo:
	##		Log what was pulled	
	##		


	outputdir=output
	mkdir -p $outputdir
	mkdir -p logs
	
	logLocation=logs/pullFiles.log
	touch $logLocation

	inputDir=testtarget

	inputlist=pullList.txt

	### -- Debugging only
	## Clear out the output dir and log files
		rm -rf $outputdir/*

	### -- End Debugging only




	### Find the file in the input dir. Will need to scan many subdirectories





	### Now loop through the input file
	while read p; do
  		#echo $p
  		### Find each item in the list, and copy it to the output dir

  		FILES=$(find $inputDir -type f -name $p'.apk')
		for f in $FILES
		do

			## Once the file is found, copy it over
			#echo $f
			echo "copy " $f
			cp $f $outputdir

			## Write it to the log
			echo "copy " $f `date` >> $logLocation

			#fileName=$(basename $f)
			#let COUNTER+=1

			#cp $f $destinationDir
			#echo "**** $COUNTER)Copy File: $f" `date` >> $logFile
			
	done




	done <$inputlist

	### Put a seperator into the log
	echo " ----------------- Done ----------- " $f `date` >> $logLocation
	### Doesnt work echo " " >> $logLocation ## blank space



