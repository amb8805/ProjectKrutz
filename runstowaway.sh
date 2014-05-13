#!/bin/bash

date1=$(date +"%s")
logLocation=logs/stowawayoutput.log

### Remove the log if it is there
rm -f $logLocation

## Create the log
touch $logLocation

echo "Stowaway Start:" `date` >> $logLocation

echo "Begin Stowaway"

### Clean out the APK Output
stowawayOutput=tools/stowaway/apkOutput
rm -rf $stowawayOutput/
mkdir -p $stowawayOutput/ 


# Check to make sure that an argument is actually passed in
EXPECTED_ARGS=1

if [ $# -ne $EXPECTED_ARGS ] 
then
	echo "Stowaway requires 1 argument, the path to the location of the apk files"
fi

#The $1 is the given argument which is the path to the files
FILES=$(find $1 -type f -name '*.apk')
for f in $FILES
do

### Just pull in the name of the file, do not pay any attention to the path

	APKFile=$(basename $f)
	APKFile=${APKFile//.apk/""} ### Remove the apk exension from the apkID
	echo $APKFile

	#Building an output folder for each app inside of the apkOutput folder in stowaway
    APK="./tools/stowaway/apkOutput/"
    OUTPUT="_output"
    OUTPUT_FOLDER=$APK$APKFile$OUTPUT
	echo outputFolder: $OUTPUT_FOLDER
	mkdir -p $OUTPUT_FOLDER    #what does the -p do here?

	# OK so here is the major directory problem.  You need to run stowaway from inside of
	# the stowaway directory.  This is because there are many paths inside of stowaway.sh 
	# that are dependent on being in the same directory as the script. So even though it 
	# may seem to make more sense to do something like this:
	#	 bash ./tools/stowaway/Stowaway-1.2.4/stowaway.sh $f $OUTPUT_FOLDER
	# that doesn't work.  What you need to do instead is this:
	#    bash ./stowaway.sh ../../../$f $OUTPUT_FOLDER &>>../../../logs/stowawayoutput.log

	pushd ./tools/stowaway/Stowaway-1.2.4
	bash ./stowaway.sh ../../../$f ../apkOutput/$APKFile$OUTPUT &>>../../../$logLocation
	popd #getting out of the directory 

    echo "################################################################" &>>$logLocation

	# get the ID from ApkInfo based on the filename (does not include .apk)
	appRowid=`sqlite3 Evolution\ of\ Android\ Applications.sqlite  "SELECT rowid FROM ApkInformation WHERE ApkId='$APKFile';"`

	#Here is where we are getting the version number of the app from the manifest
	pushd $OUTPUT_FOLDER
	firstline=$(head -n 1 AndroidManifest.xml)
	nofront=${firstline#<?xml version=}
	versionNumber=`echo $nofront| cut -d'"' -f 2`
	echo "version number = " $versionNumber
	popd

	#Reading the Over and Under privileged files
	over="/Overprivilege"
	under="/Underprivilege"

	while read line
	do
    	var=${line#android.permission.}
		echo $var
    	# make sure the permission is in the permissions table and get the ID number
    	permRowCount=0
		permRowCount=`sqlite3 Evolution\ of\ Android\ Applications.sqlite  "SELECT count(*) FROM Permissions WHERE Name='$var';"`
		if [ $permRowCount -eq 0 ]
		then
			sqlite3 Evolution\ of\ Android\ Applications.sqlite  "INSERT INTO Permissions (Name) VALUES ('$var');"
		fi
		permRowid=`sqlite3 Evolution\ of\ Android\ Applications.sqlite  "SELECT rowid FROM Permissions WHERE Name='$var';"`
		# put into the Overprivilege table an entry for apkid and perm id
		sqlite3 Evolution\ of\ Android\ Applications.sqlite  "INSERT INTO Overprivileged (PermissionId,ApkId) VALUES ($permRowid,$appRowid);"
	done < $OUTPUT_FOLDER$over


	#add another for loop here for underprivileged
	#there may not be an underprivileged file, in which case this will just not run, which is fine
	while read line
	do
		var=${line#android.permission.}
		echo $var
		# make sure the permission is in the permissions table and get the ID number
		permRowCount=0
		permRowCount=`sqlite3 Evolution\ of\ Android\ Applications.sqlite  "SELECT count(*) FROM Permissions WHERE Name='$var';"`
		if [ $permRowCount -eq 0 ]
		then
			sqlite3 Evolution\ of\ Android\ Applications.sqlite  "INSERT INTO Permissions (Name) VALUES ('$var');"
		fi
		permRowid=`sqlite3 Evolution\ of\ Android\ Applications.sqlite  "SELECT rowid FROM Permissions WHERE Name='$var';"`
		# put into the Underprivilege table an entry for apkid and perm id
		sqlite3 Evolution\ of\ Android\ Applications.sqlite  "INSERT INTO Underprivileged (PermissionId,ApkId) VALUES ($permRowid,$appRowid);"
	done < $OUTPUT_FOLDER$under
done

date2=$(date +"%s")
diff=$(($date2-$date1))
echo "Stowaway Total Running Time $(($diff / 60)) minutes and $(($diff % 60)) seconds."  >> $logLocation
echo "Stowaway End:" `date` >> $logLocation
exit
