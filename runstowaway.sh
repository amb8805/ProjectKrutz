#!/bin/bash

date1=$(date +"%s")
logLocation=logs/stowaway.log

### Remove the log if it is there
rm -f $logLocation

## Create the log
touch $logLocation

echo "Stowaway Start:" `date` >> $logLocation

echo "Begin Stowaway"


stowawayOutput=tools/stowaway/apkOutput

### Clean out the APK Output
rm -rf $stowawayOutput/
mkdir -p $stowawayOutput/ 

FILES=$(find $1 -type f -name '*.apk')
for f in $FILES
do

### Just pull in the name of the file, do not pay any attention to the path

	APKFile=$(basename $f)
	APKFile=${APKFile//.apk/""} ### Remove the apk exension from the apkID
#	echo 35: $APKFile



    APK="tools/stowaway/apkOutput/"
    OUTPUT="_output"
    O_F=$APK${f#$PATH}
    OUTPUT_FOLDER=$stowawayPath${APKFile}$OUTPUT

	
#	echo outputFolder: $OUTPUT_FOLDER
#	exit
    echo **********Stowaway***********
    echo ${f#$PATH}

#	echo 30: $OUTPUT_FOLDER
	mkdir -p $OUTPUT_FOLDER
#cd $stowawayPath
#pwd
	
#	exit
	
	pwd
#    bash ./stowaway.sh $f $OUTPUT_FOLDER &>>../../../logs/stowAwayoutput.log
 #   bash ./tools/stowaway/Stowaway-1.2.4/stowaway.sh $f $OUTPUT_FOLDER

exit

        echo "################################################################" &>>../../../logs/stowAwayoutput.log
	
	cd $OUTPUT_FOLDER

	cd ../../../../
	# get the ID from ApkInfo based on the filename (includes .apk)
	appRowid=`sqlite3 Evolution\ of\ Android\ Applications.sqlite  "SELECT rowid FROM ApkInformation WHERE ApkId='${f#$PATH}';"`
	cd ./tools/stowaway/${OUTPUT_FOLDER#../}	

	#Here is where we are getting the version number of the app from the manifest
	line=$(head -n 1 AndroidManifest.xml)
	nofront=${line#<?xml version='}
	noback=${nofront#' encoding='utf-8'?>}
	echo "version number = " $((noback))

	for line in $(cat Overprivilege)
	do
		echo $line
		# instead of echoing put this into the database 
		cd ../../../../
		# make sure the permission is in the permissions table and get the ID number
		permRowid=`sqlite3 Evolution\ of\ Android\ Applications.sqlite  "SELECT rowid FROM Permissions WHERE Name='${line#android.permission.}';"`
		if $permRowid != ''
		then
			sqlite3 Evolution\ of\ Android\ Applications.sqlite  "INSERT INTO Permissions (Name) VALUES (${line#android.permission.});"
			permRowid=`sqlite3 Evolution\ of\ Android\ Applications.sqlite  "SELECT rowid FROM Permissions WHERE Name='${line#android.permission.}';"`
		fi
		# put into the Overprivilege table an entry for apkid and perm id
		sqlite3 Evolution\ of\ Android\ Applications.sqlite  "INSERT INTO Overprivileged (PermissionId,ApkId) VALUES ($permRowid,$appRowid);"
		cd ./tools/stowaway/${OUTPUT_FOLDER#../}
	done 

	#add another for loop here for underprivileged
	for line in $(cat Underprivilege)
	do
		echo $line
		# instead of echoing put this into the database 
		cd ../../../../
		# make sure the permission is in the permissions table and get the ID number
		permRowid=`sqlite3 Evolution\ of\ Android\ Applications.sqlite  "SELECT rowid FROM Permissions WHERE Name='${line#android.permission.}';"`
		if $permRowid != ''
		then
			sqlite3 Evolution\ of\ Android\ Applications.sqlite  "INSERT INTO Permissions (Name) VALUES (${line#android.permission.});"
			permRowid=`sqlite3 Evolution\ of\ Android\ Applications.sqlite  "SELECT rowid FROM Permissions WHERE Name='${line#android.permission.}';"`
		fi
		# put into the Underprivilege table an entry for apkid and perm id
		sqlite3 Evolution\ of\ Android\ Applications.sqlite  "INSERT INTO Underprivileged (PermissionId,ApkId) VALUES ($permRowid,$appRowid);"
		cd ./tools/stowaway/${OUTPUT_FOLDER#../}
	done 

	cd ../../Stowaway-1.2.4
done









exit
date2=$(date +"%s")
diff=$(($date2-$date1))
echo "Stowaway Total Running Time $(($diff / 60)) minutes and $(($diff % 60)) seconds."  >> ../$logLocation
echo "Stowaway End:" `date` >> ../$logLocation
