#!/bin/bash


	inputDir=$1
	outputDir=output/

	### Check to see if the contents of the file exist in the permission table. If not, then add them
	function CheckAndAddOverAndUnderPrivs { 
		### First check to make sure that the file exists
		if [ -f $2/$1 ];
		then
			### The file exists, so now loop through it and make sure the privs exist in the database
			#echo "File exists"

			cat $2/$1
			#while read $2/$1
			#do
    		#	name=$line
    		#	echo "Text read from file - $name"
			#done < $1

			### IF there is a space, then ignore it.


		fi

	} 


	### Check to see if the file exists in the DB, if not then add it
#	function addIfNotExistsDB {


#	}





	FILES=$(find $inputDir -type f -name '*.apk')
	for f in $FILES
	do
		#echo $f

		## Run Stowaway
		APKFile=$(basename $f)
		APKFile=${APKFile//.apk/""} ### Remove the apk exension from the apkID


		cd tools/stowaway/
		mkdir -p $outputDir/$APKFile


#		./stowaway.sh ../../$f $outputDir/$APKFile
		
		### Refactor this more

		CheckFor=Underprivilege
		### Check to see if Underprivilege exists
		
   			#echo "File exists"
   		CheckAndAddOverAndUnderPrivs $CheckFor $outputDir$APKFile
		




		cd ../../

		### Clean up the output files
#		rm -rf $outputDir/$APKFile

	done