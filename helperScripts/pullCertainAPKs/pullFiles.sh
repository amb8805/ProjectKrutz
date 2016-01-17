#!/bin/bash

	## Description: Pulls files as defined in an input list to a seperate output folder
	##		The intention is that these files would be scanned later on.

	### Todo:
	##		Clear the contents of the log file
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
	### Todo


	### -- Debugging only
	## Clear out the output dir and log files
	rm -rf $outputdir/*

	### -- End Debugging only

	### Now loop through the input file
	while read p; do
  		#echo $p
  		### Find each item in the list, and copy it to the output dir
  		fileFound=false ### Mark the file as not being found by default

  		echo "Looking for: " $p

  		FILES=$(find $inputDir -type f -name $p'.apk')
		for f in $FILES
		do

			## Once the file is found, copy it over
			#echo $f
			echo "copy " $f
			# Actually copy the file
			cp $f $outputdir

			## Write it to the log
			echo "copy " $f `date` >> $logLocation

			
			fileFound=true ## Log the file as being found
			echo $f >> $foundLog 

		done

		## Check to log that the file was not found
		if [ $fileFound == "false" ]; then
			echo $p >> $NotfoundLog	 ### Write the file to the log as not being found
		#else
		#	echo $p "true"
		fi

	done <$inputlist

	### Clean up the output of the log files
	echo " ----------------- Done ----------- " $f `date` >> $logLocation
	echo " ----------------- Done ----------- " `date` >> $NotfoundLog
	echo " ----------------- Done ----------- " `date` >> $foundLog



