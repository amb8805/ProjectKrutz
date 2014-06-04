#!/bin/bash 



	echo Run Simcad
	inputLocation=$1


	### Make the temp output location
	tempOutputLocation=tools/java_Analysis/CloneDetection/simcad/output/
	rm -rf $tempOutputLocation
	mkdir -p $tempOutputLocation

echo hi fred2

exit
	for i in $(find $inputLocation -mindepth 1 -maxdepth 1 -type d ) 
	do
	  

		APKFile=$(basename $i)
		APKFile=${APKFile//%apk/""} ### Remove the apk exension from the apkID
		mkdir -p $tempOutputLocation/$APKFile # Create the temp output location
		
		### Examine each by simcad
		cd tools/java_Analysis/CloneDetection/simcad/ ### Messy, but I think it works
		./simcad2 -s $f -l java -o $tempOutputLocation/$APKFile
		cd ../../../../


	  
		### Print out message for what each one is doing
		### Log the amount of time that each action took


		## Remove the temporary output
		rm -rf $tempOutputLocation/$APKFile 

	done

	### Make sure all output files have been removed
	rm -rf $tempOutputLocation

	### Loop through all folders in Java Analysis


	### Run the application on each folder




	###Todo
	# Logs
	# Test on VM
