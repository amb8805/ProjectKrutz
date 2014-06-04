#!/bin/bash 



	echo Run Simcad
	#inputLocation=$1
	inputLocation=../../javaOutput

	### Make the temp output location
	#tempOutputLocation=tools/java_Analysis/CloneDetection/Simcad-2.2/output/
	tempOutputLocation=output/
	rm -rf $tempOutputLocation
	mkdir -p $tempOutputLocation


	### Default placeholder values
	### -1 in case of error
	sourceFragmentCount=-1
	cloneFragmentCount=-1
	cloneGroupCount=-1


	cd tools/java_Analysis/CloneDetection/Simcad-2.2/ ### Messy, but I think it works


	for i in $(find $inputLocation -mindepth 1 -maxdepth 1 -type d ) 
	do
	  
		APKFile=$(basename $i)
		APKFile=${APKFile//%apk/""} ### Remove the apk exension from the apkID
		mkdir -p $tempOutputLocation/$APKFile # Create the temp output location
		
		### Examine each by simcad
#		temp=`./simcad2 -s $i -l java -o $tempOutputLocation/$APKFile`
	

		### If an exception is thrown, then skip the rest
		if [[ $temp == *"Exception in thread"* ]]
		then
			echo Exception Thrown
		else
			echo blah
			### Parse the expected output
#			sourceFragmentCount=`sed 's/^.*Total source fragment ://; s/Total clone fragment.*$//' <<< $temp`
#			cloneFragmentCount=`sed 's/^.*Total clone fragment ://; s/Total clone group.*$//' <<< $temp`
#			cloneGroupCount=`sed 's/^.*Total clone group\\/pair ://; s/Pre-Processing time :.*$//' <<< $temp`
		fi
	

		echo "APKInformation: " $APKFile
		echo Source Fragment: $sourceFragmentCount
		echo Clone Fragment: $cloneFragmentCount
		echo Clone Group: $cloneGroupCount

	
		### Get the row ID
		rowid=`sqlite3 ../../../../EvolutionOfAndroidApplications.sqlite  "SELECT rowid FROM ApkInformation WHERE ApkId='$APKFile';"`
		echo $rowid


		### Inser the information into the database

	
		### Check to make sure the rowID exist in the toolresults table?




		### Print out message for what each one is doing
		### Log the amount of time that each action took


		## Remove the temporary output
		rm -rf $tempOutputLocation/$APKFile 

	done

	cd ../../../../


	### Make sure all output files have been removed
	rm -rf $tempOutputLocation

	### Loop through all folders in Java Analysis


	### Run the application on each folder




	###Todo
	# Logs
	# Test on VM
	# Fix the input javaOutput location to be dynamic
