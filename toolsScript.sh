#!/bin/bash

clear

echo "The script starts now"
echo

rm -f logs/*.log
rm -rf logs/AndroRiskOutput

date1=$(date +"%s") ## Start date of the script
logLocation=logs/toolsScript.log
touch $logLocation
echo "toolsScript Start:" `date` >> $logLocation


if [ $(date +%u) -eq 1 ]
then
        echo "today is Monday"
elif [ $(date +%u) -eq 2 ]
then
        echo "today is Tuesday"
elif [ $(date +%u) -eq 3 ]
then
        echo "today is Wednesday"
elif [ $(date +%u) -eq 4 ]
then
        echo "today is Thursday"
elif [ $(date +%u) -eq 5 ]
then
        echo "today is Friday"
fi


#Using the input variables to assign values to the paths
#for the source of the apk files
#if [ $# -eq 0 ]
 # then
    #PATH='../../../scraper/downloads/full/'
	#FILES=../../../scraper/downloads/full/*
	#PATH_TWO='../../scraper/downloads/full/'
	#FILES_TWO=../../scraper/downloads/full/*
	#	echo Files: $FILES
	#	echo Files2: $FILES_TWO
	
#	APK_Input_Path=scraper/downloads/full/
	#FILES=../../../scraper/downloads/full/*
#	echo Default: $APK_Input_Path
	
#	echo "No arguments supplied, using defaults"
 # else
  	#This isn't quite right yet, because I don't know how to
  	#make one a string and one a directory with star on the end...
  #	PATH=$1
  #	FILES=$1
  #	PATH_TWO=${1#../}
  #	FILES_TWO=${1#../}
#fi

APK_Input_Path=scraper/downloads/full/


### All of these directory changes are a nasty hack
#pushd ./tools/stowaway/Stowaway-1.2.4
#cd ../
#rm -rf apkOutput
#mkdir apkOutput
#cd Stowaway-1.2.4
#cd ../../../

### THIS ALL NEEDS TO BE FIXED
### THE PATHS AND DIRECTORIES ARE ALL MESSED UP

#for f in $FILES
	
	### Only analyze .apk files
#	FILES=$(find $APK_Input_Path -type f -name '*.apk')
#	for f in $FILES
#	do


#        APK="tools/stowaway/apkOutput/"
#        OUTPUT="_output"
#        O_F=$APK${f#$PATH}
#        OUTPUT_FOLDER=${O_F%.apk}$OUTPUT
#        echo **********Stowaway***********
#        echo ${f#$PATH}

#        mkdir $OUTPUT_FOLDER
#        bash ./stowaway.sh $f $OUTPUT_FOLDER &>>../../../logs/stowAwayoutput.log


#        echo "################################################################" &>>../../../logs/stowAwayoutput.log
	
#	------------------------------------------------------------------------------------------------------------------------------

#cd $OUTPUT_FOLDER

#	cd ../../../../
	# get the ID from ApkInfo based on the filename (includes .apk)
#	appRowid=`sqlite3 Evolution\ of\ Android\ Applications.sqlite  "SELECT rowid FROM ApkInformation WHERE ApkId='${f#$PATH}';"`
#	cd ./tools/stowaway/${OUTPUT_FOLDER#../}	

	#Here is where we are getting the version number of the app from the manifest
#	line=$(head -n 1 AndroidManifest.xml)
#	nofront=${line#<?xml version='}
#	noback=${nofront#' encoding='utf-8'?>}
#	echo "version number = " $((noback))

#	for line in $(cat Overprivilege)
#	do
#		echo $line
		# instead of echoing put this into the database 
#		cd ../../../../
		# make sure the permission is in the permissions table and get the ID number
#		permRowid=`sqlite3 Evolution\ of\ Android\ Applications.sqlite  "SELECT rowid FROM Permissions WHERE Name='${line#android.permission.}';"`
#		if $permRowid != ''
#		then
#			sqlite3 Evolution\ of\ Android\ Applications.sqlite  "INSERT INTO Permissions (Name) VALUES (${line#android.permission.});"
#			permRowid=`sqlite3 Evolution\ of\ Android\ Applications.sqlite  "SELECT rowid FROM Permissions WHERE Name='${line#android.permission.}';"`
#		fi
		# put into the Overprivilege table an entry for apkid and perm id
#		sqlite3 Evolution\ of\ Android\ Applications.sqlite  "INSERT INTO Overprivileged (PermissionId,ApkId) VALUES ($permRowid,$appRowid);"
#		cd ./tools/stowaway/${OUTPUT_FOLDER#../}
#	done 

	#add another for loop here for underprivileged
#	for line in $(cat Underprivilege)
#	do
#		echo $line
		# instead of echoing put this into the database 
#		cd ../../../../
		# make sure the permission is in the permissions table and get the ID number
#		permRowid=`sqlite3 Evolution\ of\ Android\ Applications.sqlite  "SELECT rowid FROM Permissions WHERE Name='${line#android.permission.}';"`
#		if $permRowid != ''
#		then
#			sqlite3 Evolution\ of\ Android\ Applications.sqlite  "INSERT INTO Permissions (Name) VALUES (${line#android.permission.});"
#			permRowid=`sqlite3 Evolution\ of\ Android\ Applications.sqlite  "SELECT rowid FROM Permissions WHERE Name='${line#android.permission.}';"`
#		fi
		# put into the Underprivilege table an entry for apkid and perm id
#		sqlite3 Evolution\ of\ Android\ Applications.sqlite  "INSERT INTO Underprivileged (PermissionId,ApkId) VALUES ($permRowid,$appRowid);"
#		cd ./tools/stowaway/${OUTPUT_FOLDER#../}
#	done 

#	cd ../../Stowaway-1.2.4
#done


./runstowaway.sh $APK_Input_Path

exit
./androguard.sh $APK_Input_Path





cd ../../

echo "Start java Analysis:" `date` >> $logLocation
#./tools/java_Analysis/RunAll.sh $APK_Input_Path


#### Log the conclusion time
date2=$(date +"%s")
diff=$(($date2-$date1))
echo "toolsScript Total Running Time $(($diff / 60)) minutes and $(($diff % 60)) seconds."  >> $logLocation
echo "toolsScript End:" `date` >> $logLocation


### Now we do all the commiting ##
### 	make sure its only the logs and the db
echo "FIX              Commit Logs and Database to Github"
##if this is the VM then run this
##put the password into it
#git commit logs/* -m "Committing the logs for the night"
#git commit Evolution\ of\ Android\ Applications.sqlite -m "Committing the database for the night"
#git push origin master


echo "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"

