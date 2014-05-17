#!/bin/bash

### Description: This will modify or add informtion to the SQLite APKInformation Table
###			This will ultimately be refactored and placed into 


#### Convert the date format to one which we can sort
convert_date () {

	day=${2//,/""}
    local months=( January February March April May June July August September October November December )
    local i
    for (( i=0; i<11; i++ )); do
        [[ $1 = ${months[$i]} ]] && break
    done
    #printf "%4d%02d%02d\n" $3 $(( i+1 )) $2
    printf "%4d%02d%02d\n" $3 $(( i+1 )) $day
}


#### Directory of APK files to be analyzed
apkInputDir=scraper/downloads/full

dbname=EvolutionOfAndroidApplications.sqlite


date1=$(date +"%s") ## Start date of the script
logLocation=logs/modifyAPKInfo.log
touch $logLocation
echo "ModifyAPKInfo Start:" `date` >> $logLocation


#### Loop through all of the records in the database
#### Done like this since not all of the files are actual APK Files




	sqlite3 $dbname  "UPDATE ApkInformation SET GeneratedFileSize=$fileSize WHERE rowid=$rowid;"	



exit




#### Loop through all of the apk files in the directory
FILES=$(find $apkInputDir -type f -name '*.apk')
	for f in $FILES
	do

	fileName=$(basename $f)
	apkID=${fileName//.apk/""} ### Remove the apk exension from the apkID
	#echo $apkID
	rowid=`sqlite3 $dbname "SELECT rowid FROM ApkInformation WHERE ApkId='$apkID';"`

	### Modify the minimum operating system
	# If the minimum OS is 1.3 and up, the column "ModifiedOS" should read 1.3
	minos=`sqlite3 $dbname "SELECT OperatingSystems FROM ApkInformation WHERE rowid='$rowid';"`
	minos=${minos//and up/""} ### Remove the and up	
	sqlite3 $dbname  "UPDATE ApkInformation SET ModifiedOS=\"$minos\" WHERE rowid=$rowid;"	

	### Get the size of the apk file & Update the "GeneratedFileSize column" 
	## Analyze the examined apk file and get its file size. This file size should then be recorded and put into the DB.

	### Get the size of the apk file. The extra command has to be used to remove the filename
	#set -- $(du $f) ## Old version, only reported ~1/2 the size of the file
	set -- $(du -sb $f)
	fileSize=$1
	sqlite3 $dbname  "UPDATE ApkInformation SET GeneratedFileSize=$fileSize WHERE rowid=$rowid;"	

	#### Generate the modified PublicationDate
	# Right now the DatePublishedDate is April 5, 2014
	# This should be saved in the "ModifiedDatePublished" column as 4/5/2014
	DatePublished=`sqlite3 $dbname "SELECT DatePublished FROM ApkInformation WHERE rowid='$rowid';"`
	
	### Convert to modified date published
	d=$( convert_date $DatePublished )
	#d=$( convert_date "March 17, 2014" )
	
	sqlite3 $dbname  "UPDATE ApkInformation SET modifiedDatePublished=$d WHERE rowid=$rowid;"

done

date2=$(date +"%s")
diff=$(($date2-$date1))
echo "End:" `date` >> $logLocation
echo "Total Time $(($diff / 60)) minutes and $(($diff % 60)) seconds."  >> $logLocation

#### Put everything into logs
# 

