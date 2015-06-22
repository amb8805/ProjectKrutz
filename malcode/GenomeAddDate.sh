#!/bin/bash

clear;

	### Description: Adds the date created field to the GenomeFile
	###		This was not added to the main script since it had already ran

	dbname=GenomeGroupRep.sqlite
	tempOutput=tempOutput

	apkInputDir=tempInput
	logLocation=logs/addDate.log
	mkdir -p $logLocation
	
	### Remove the log if it is there
	rm -rf $logLocation

	## Create the log
	touch $logLocation

	echo "Genome Date Add  Start:" `date` >> $logLocation

	date1=$(date +"%s")



	#### clear specific database table
	clearDateValues () {
		echo "Clear Values" 
#		sqlite3 $dbname "delete from $1;"
		sqlite3 $dbname "update apkInformation set FileCreated = null" 
	}	

	clearDateValues ### Clear the database if necessary 

	
	FILES=$(find $apkInputDir  -type f -name '*.apk')
	for f in $FILES
	do

		echo $f

		### Find the value in the sqlite table

		##		Get FileName:
		appName=${f//.apk/""}
		appName=${appName//%/""}
		appName=$(basename $appName)


		##		Get ParentFolder: 
		dirName=$(dirname $f)
		dirName=${dirName/$apkInputDir//""}
		dirName=${dirName////""}
		echo $appName
		echo $dirName


		## Get the rowID to update
		### Check to see if the value exists in the DB
		count=`sqlite3 $dbname "SELECT count (name) as AppCount FROM apkInformation WHERE Name='$appName' and ParentFolder='$dirName';"`
		if [ $count -eq 0 ]
		then
			echo File does not exist
			echo "-----File does not exist: " $f `date` >> $logLocation
			## The value does not exist, so add it to the table.
#			sqlite3 ../../EvolutionOfAndroidApplications.sqlite  "INSERT INTO Permissions (Name) VALUES ('$1');"
			#echo Add $1 to Permissions
		else
			### File exists, so update the date created information

			#echo File Exists
			### Get the rowID

			rowID=`sqlite3 $dbname "SELECT rowID FROM apkInformation WHERE Name='$appName' and ParentFolder='$dirName';"`
			modDate=`stat --printf "%z\n" $f`
			sqlite3 $dbname "update ApkInformation set FileCreated='$modDate' WHERE rowID=$rowID;"


		fi


	done




	date2=$(date +"%s")
	diff=$(($date2-$date1))
	echo "Genome Date Add Total Running Time $(($diff / 60)) minutes and $(($diff % 60)) seconds."  >> $logLocation
	echo "Genome Date Add  End:" `date` >> $logLocation

