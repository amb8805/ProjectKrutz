#!/bin/bash

	## Description: Take the unzipped malware from contagio, unzip it and then get it prepped for SA.

clear;


	date1=$(date +"%s") ## Start date of the script
	logLocation=logs/contagio_create.log
	rm -f $logLocation
	touch $logLocation


	### Description: Unzip & prep all contagio files

	dbname=MalwareInfo.sqlite
	tempOutput=tempOutput
	fullOutput=fullOutput # Mimic downloads/full
	apkInputDir=milainput
	
	password=infected666
	mkdir -p $tempOutput
	mkdir -p $fullOutput



	#echo "Contagio Date Add  Start:" `date` >> $logLocation

	#date1=$(date +"%s")

	#### clear specific database table
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
		clearTable SigningInfo
	}

	### Extract all of the zip files from their source
	extractFiles() {

		### Loop through all the zip files and unzip them
		FILES=$(find $apkInputDir  -type f -name '*.zip')
		for f in $FILES
		do

			#echo $f
			appName=$(basename $f)

			### Build the password to extract
			### Get last charachter of file for the password

			lastChar=appName=${appName//.zip/""}
			lastChar="${lastChar:(-1)}"
			#echo $lastChar
			temppassword=$password$lastChar

			#7za x -pinfected666h input/mila_short2EED7318CA564A909E75AD616CAD5CDF-airpush.zip
			7za x -p$temppassword $f -o$tempOutput/*


		done
	}

	## Check to see if the extracted files are apk files
	checkForAPK() { 
	# Now loop through all the output files and see if they are apk files


		FILES=$(find $tempOutput -type f)
		for f in $FILES
		do
			#echo $f
			if [[ ${f: -4} != ".apk" ]]; then
			
				#### Check to see if it is another extension

				if [[ "$f" == *.* ]]; then
					## Leave it alone and report it
					echo "Unknowkn Extension: "$f
					### ENTER LOG INFO HERE
					echo "...Unknowkn Extension: "$f >> $logLocation

				else
					## Make it an apk file
					mv $f $f.apk
					echo "-->" $f "->" $f".apk"
					echo "...Create APK" $f >> $logLocation

				fi							
			fi
		done

	}


	### Get files ready for Static analysis
	prepForStaticAnalysis(){
		echo "prep for SA"

		# loop through all of the output files
		FILES=$(find $tempOutput  -type f -name '*.apk')
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

			#modDate='3/1/2011'
			modDate=`stat --printf "%y\n" $f`


			sqlite3 $dbname "Insert into apkinformation (Name, SourceID, apkID, Developer, DatePublished, FileCreated, ParentFolder) values (\"$appName\",1, \"$appName\", \"$counter\", \"$counter\", \"$modDate\", \"$dirName\");"	
			
			counter=$((counter+1))

			## copy the apk file into the analysis directory

			echo "-->Copy: " $f
			cp $f $fullOutput	

		done

	}


	clearDatabase ### Clear the database if necessary 
	extractFiles ## Extract all zip files from their source
	checkForAPK ## Check to see if the output files are apk
	prepForStaticAnalysis ## Get ready for static analysis


	rm -rf $tempOutput


	date2=$(date +"%s")
	diff=$(($date2-$date1))
	echo "Contagio Date Add Total Running Time $(($diff / 60)) minutes and $(($diff % 60)) seconds."  >> $logLocation
	echo "Contagio Date Add  End:" `date` >> $logLocation

