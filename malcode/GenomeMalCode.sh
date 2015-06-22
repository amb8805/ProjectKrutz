#!/bin/bash

	### Description: Examines the raw Genome Malware files and performs full static analysis on them

	dbname=GenomeGroupRep.sqlite
	tempOutput=tempOutput

	mkdir -p $tempOutput

	#### Directory of APK files to be analyzed
	#apkInputDir=scraper/downloads/full
	apkInputDir=testGenome


	#### clear specific database table
	clearTable () {
		echo "Clear Table: " $1
		sqlite3 $dbname "delete from $1;"
	}	

	#### Function to clear out the database from uneeded data
	clearDatabase () {
		echo "Delete Database Info"
		clearTable toolresults
		clearTable ApkInformation
		clearTable Overprivilege
		clearTable Permissions
		clearTable ToolResults
		clearTable Underprivilege
		clearTable apkParser_intents
		clearTable apkParser_intents_join
		clearTable apkParser_privs
		clearTable apkParser_privs_join
	}

	clearDatabase ### Clear the database if necessary 

	### Remove all spaces in files
	### Not doing this may create problems with copying files over
	find $apkInputDir -depth -name "* *" -execdir rename 's/ /_/g' "{}" \;


	FILES=$(find $apkInputDir  -type f -name '*.apk')
	for f in $FILES
	do

		## Get the parent folder of the file
		dirName=$(dirname $f)
		dirName=${dirName/$apkInputDir//""}
		dirName=${dirName////""}
		#echo $dirName

		appName=${f//.apk/""}
		appName=${appName//%/""}
		appName=$(basename $appName)
		
		sqlite3 $dbname "Insert into apkinformation (Name, SourceID, apkID, Developer, DatePublished, ParentFolder) values (\"$appName\",1, \"$appName\", \"$counter\", \"$counter\", \"$dirName\");"	
		
		counter=$((counter+1))

		## copy the apk file into the analysis directory

		echo "-->Copy: " $f
		cp $f $tempOutput		

	done



