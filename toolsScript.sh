#!/bin/bash

clear

echo "The script starts now"
echo

rm -f logs/*.log
rm -rf logs/AndroRiskOutput

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

pushd ./tools/stowaway/Stowaway-1.2.4

cd ../
rm -rf apkOutput
mkdir apkOutput
cd Stowaway-1.2.4

PATH='../../../scraper/downloads/full/'
FILES=../../../scraper/downloads/full/*
for f in $FILES
do
        APK="../apkOutput/"
        OUTPUT="_output"
        O_F=$APK${f#$PATH}
        OUTPUT_FOLDER=${O_F%.apk}$OUTPUT

        echo **********Stowaway***********
        echo ${f#$PATH}

        mkdir $OUTPUT_FOLDER

        bash ./stowaway.sh $f $OUTPUT_FOLDER &>>../../../logs/stowAwayoutput.log

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

popd

echo
echo "Starting Androguard"

pushd ./tools/androguard

mkdir ../../logs/AndroRiskOutput
PATH='../../scraper/downloads/full/'
FILES=../../scraper/downloads/full/*
for f in $FILES
do
        echo "***********AndroRisk for ${f#$PATH} ***********"
        
	OUTPUT_FILE=../../logs/AndroRiskOutput/${f#$PATH}_AndroRisk.log
	./androrisk.py -m -i $f &>> $OUTPUT_FILE 
	
	while read line;
	do
		if [[ $line == *VALUE* ]]
		then
			echo FUZZY RISK VALUE ${line#VALUE}
			cd ../../
			#select from apk information the row id where apkid = filename
			rowid=`sqlite3 Evolution\ of\ Android\ Applications.sqlite  "SELECT rowid FROM ApkInformation WHERE ApkId='${f#$PATH}';"`
			num=${line#VALUE}   #I am truncating the fuzzy risk number and making it an int
  			float=${num/.*}
  			int=$((float))
  			#instead insert into database...I don't know if this is right...
			{ 
				sqlite3 Evolution\ of\ Android\ Applications.sqlite  "INSERT INTO ToolResults (ApkId,FuzzyRiskValue) VALUES ($rowid,$int);"
			} || {
				sqlite3 Evolution\ of\ Android\ Applications.sqlite  "UPDATE ToolResults SET FuzzyRiskValue=$int WHERE ApkId=$rowid;"
			}
			cd ./tools/androguard
		elif [[ $line == ERROR* ]]
		then
			echo FUZZY RISK $line
		fi
	done < $OUTPUT_FILE
	
        #echo "********AndroAPKInfo for ${f#$PATH} ***********"
        #./androapkinfo.py -i $f &>> $OUTPUT_FILE 
	echo
done

popd

pushd ./tools/java_Analysis

bash RunAll.sh

popd


## Now we do all the commiting ##
# what is the fake user info?
git add .
git commit -m "Committing the logs and database for the night"
git push origin master


echo "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!DONE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"

exit