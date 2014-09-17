#!/bin/bash 

	### Description: 
	###		Get the signing key information for each apk.


	EXPECTED_ARGS=1
	E_BADARGS=65
	if [ $# -ne $EXPECTED_ARGS ]
	then
	  echo "Usage: `basename $0` {arg}"
	  echo "No Expected Input Parameter found"
	#  exit $E_BADARGS
		exit
	fi

	inputLocation=$1 ### The passed in input location of the .apk files which are to be analyzed

	logDir=logs
	logFile=runGetSigningKey.log

	## Make sure that the logs directory exists
	mkdir -p $logDir 

	### Delete the log file if it exists
	rm -f $logDir/*.log  

	touch $logDir/$logFile

	date1=$(date +"%s") # Start Run Time
	#### Add Starting message into Logs
	echo "APKParser Start:" `date` >> $logDir/$logFile

	### Create the temp toutput directory for storing the unzipped apk files
	tempUnzipDir=tools/signingkey/tempoutput/
	mkdir -p $tempUnzipDir


	### Loop through all files in the apk directory and pass them to the APK parser script
	###		This is done on an individual apk file basis to limit the impact of problems
	FILES=$(find $inputLocation -maxdepth 1 -type f  -name '*.apk')
	for f in $FILES
	do
		## Create a log for each file being analyzed
		echo "--->GetSigningkey:" `date` " : File: `echo $f`" >> $logDir/$logFile
		
		#echo $f

		### Unzip the apk file
		#echo "unzip file"
		unzip -o $f -d $tempUnzipDir

		### Get the key
		### notroot@ubuntu:~/shared/ProjectKrutz/tempanalyze/Gmail$ keytool -printcert -v -file META-INF/CERT.RSA 
		keytooloutput=`keytool -printcert -v -file $tempUnzipDir/META-INF/CERT.RSA`
		#echo $keytooloutput >>temp.txt
		#keytooloutput=`cat temp.txt`

		### Break the output into groups
		### OwnerInfo
		OwnerInfo=`sed 's/^.*Owner: //; s/Issuer:.*$//' <<< $keytooloutput`

		### Issuer Info
		IssuerInfo=`sed 's/^.*Issuer: //; s/Serial number:.*$//' <<< $keytooloutput`

		#echo $OwnerInfo



		### 		cloneCount=`sed 's/^.*ResultStart //; s/ResultEnd.*$//' <<< $cloneResults`
		### Get the owner information


		### These if statements are in here since problems may arise if the attribute being searched for is not contained
		###			if the string. It is not the most efficient way to do things, but it seems to work.

		## ? WHY CN= for all at the end of the statement?

		if [[ $OwnerInfo == *CN=* ]]
		then
			Owner_CN=`sed 's/^.*Owner: //; s/,.*$//' <<< $OwnerInfo | sed 's/CN=//'`
		else
			Owner_CN="" # Make empty since string item does not exist
		fi


		if [[ $OwnerInfo == *OU=* ]]
		then
			Owner_OU=`sed 's/^.*OU=//; s/,.*$//' <<< $OwnerInfo | sed 's/CN=//'`
		else
			Owner_OU="" # Make empty since string item does not exist
		fi


		if [[ $OwnerInfo == *O=* ]]
		then
			Owner_O=`sed 's/^.*O=//; s/,.*$//' <<< $OwnerInfo | sed 's/CN=//'`
		else
			Owner_O="" # Make empty since string item does not exist
		fi




		if [[ $OwnerInfo == *L=* ]]
		then
			Owner_L=`sed 's/^.*, L=//; s/,.*$//' <<< $OwnerInfo | sed 's/CN=//'`
		else
			Owner_L="" # Make empty since string item does not exist
		fi


		if [[ $OwnerInfo == *ST=* ]]
		then
			Owner_ST=`sed 's/^.*, ST=//; s/,.*$//' <<< $OwnerInfo | sed 's/CN=//'`
		else
			Owner_ST="" # Make empty since string item does not exist
		fi




		if [[ $OwnerInfo == *C=* ]]
		then
			Owner_C=`sed 's/^.*, C=//; s/,.*$//' <<< $OwnerInfo | sed 's/CN=//'`
		else
			Owner_C="" # Make empty since string item does not exist
		fi






		# Get the issuer information


		if [[ $IssuerInfo == *CN=* ]]
		then
			# -- Initial version Issuer_CN=`sed 's/^.*Serial number: //; s/Valid from:.*$//' <<< $IssuerInfo | sed 's/CN=//'`
			Issuer_CN=`sed 's/^.*Issuer: //; s/,.*$//' <<< $IssuerInfo | sed 's/CN=//'`
		else
			Issuer_CN="" # Make empty since string item does not exist
		fi





		if [[ $IssuerInfo == *OU=* ]]
		then
			Issuer_OU=`sed 's/^.*OU=//; s/,.*$//' <<< $IssuerInfo | sed 's/CN=//'`
		else
			Issuer_OU="" # Make empty since string item does not exist
		fi





		if [[ $IssuerInfo == *O=* ]]
		then
			Issuer_O=`sed 's/^.*O=//; s/,.*$//' <<< $IssuerInfo | sed 's/CN=//'`
		else
			Issuer_O="" # Make empty since string item does not exist
		fi





		if [[ $IssuerInfo == *L=* ]]
		then
			Issuer_L=`sed 's/^.*, L=//; s/,.*$//' <<< $IssuerInfo | sed 's/CN=//'`

		else
			Issuer_L="" # Make empty since string item does not exist
		fi




		if [[ $IssuerInfo == *ST=* ]]
		then
			Issuer_ST=`sed 's/^.*, ST=//; s/,.*$//' <<< $IssuerInfo | sed 's/CN=//'`
		else
			Issuer_ST="" # Make empty since string item does not exist
		fi





		if [[ $IssuerInfo == *C=* ]]
		then
			Issuer_C=`sed 's/^.*, C=//; s/,.*$//' <<< $IssuerInfo | sed 's/CN=//'`
		else
			Issuer_C="" # Make empty since string item does not exist
		fi



		tempString="Serial number:" ### Do this so the space will be allowed.
		if [[ $keytooloutput == *$tempString* ]]
		then
			SerialNumber=`sed 's/^.*Serial number: //; s/Valid from.*$//' <<< $keytooloutput`
		else
			SerialNumber="" # Make empty since string item does not exist
		fi


		if [[ $keytooloutput == *MD5:* ]]
		then
			MD5=`sed 's/^.*MD5: //; s/SHA1:.*$//' <<< $keytooloutput`
		fi


		if [[ $keytooloutput == *SHA1:* ]]
		then
			SHA1=`sed 's/^.*SHA1: //; s/SHA256:.*$//' <<< $keytooloutput`
		fi


		if [[ $keytooloutput == *SHA256:* ]]
		then
			SHA256=`sed 's/^.*SHA256: //; s/Signature algorithm name:.*$//' <<< $keytooloutput`
		fi


		tempString="Signature algorithm name:" ### Do this so the space will be allowed.
		if [[ $keytooloutput == *$tempString* ]]
		then
			SigAlgorithmName=`sed 's/^.*Signature algorithm name: //; s/Version:.*$//' <<< $keytooloutput`
		fi


		if [[ $keytooloutput == *Version:* ]]
		then
			Version=`sed 's/^.*Version: //; s/xxxxx.*$//' <<< $keytooloutput`
		fi

			echo "Owner_CN:"$Owner_CN
			echo "Owner_OU:"$Owner_OU
			echo "Owner_O:"$Owner_O
			echo "Owner_L:"$Owner_L
			echo "Owner_ST:"$Owner_ST
			echo "Owner_C:"$Owner_C

			echo "Issuer_CN:"$Issuer_CN
			echo "Issuer_OU:"$Issuer_OU
			echo "Issuer_O:"$Issuer_O
			echo "Issuer_L:"$Issuer_L
			echo "Issuer_ST:"$Issuer_ST
			echo "Issuer_C:"$Issuer_C

			echo "SerialNumber:"$SerialNumber
			echo "MD5:"$MD5
			echo "SHA1:"$SHA1
			echo "SHA256:"$SHA256
			echo "SigAlgorithmName:"$SigAlgorithmName
			echo "Version:"$Version
		

		apkID=${f//.apk/""} ### Remove the apk exension from the apkID
		apkID=$(basename $apkID)
		#echo $apkID
		rowid=`sqlite3 EvolutionOfAndroidApplications.sqlite  "SELECT rowid FROM ApkInformation WHERE ApkId='$apkID';"`
	
		## Make rowID an int
		rowid=$((rowid+0))

		### If the rowID is not found, then insert the value into the database. This should never happen, but this is a failsafe.
		permRowCount=0
		permRowCount=`sqlite3 EvolutionOfAndroidApplications.sqlite  "SELECT count(*) FROM signingInfo WHERE rowid='$rowid';"`

		if [ $permRowCount -eq 0 ]
		then
			if [ $rowid -gt 0 ]
			then
				sqlite3 EvolutionOfAndroidApplications.sqlite  "insert into SigningInfo (rowID, Owner_CN, Owner_OU, Owner_O, Owner_L, Owner_ST, Owner_C,Issuer_CN, Issuer_OU, Issuer_O, Issuer_L, Issuer_ST, Issuer_C,SerialNumber, MD5, SHA1, SHA256, SigAlgorithmName, Version) values ($rowid, '$Owner_CN', '$Owner_OU', '$Owner_O', '$Owner_L', '$Owner_ST', '$Owner_C','$Issuer_CN', '$Issuer_OU', '$Issuer_O', '$Issuer_L', '$Issuer_ST', '$Issuer_C','$SerialNumber', '$MD5', '$SHA1', '$SHA256', '$SigAlgorithmName', '$Version');"
		else
			echo "ERROR: No RowID Found:"$rowid  
		fi

		else
			sqlite3 EvolutionOfAndroidApplications.sqlite "update SigningInfo set Owner_CN = '$Owner_CN',Owner_OU='$Owner_OU',Owner_O='$Owner_O',Owner_L='$Owner_L',Owner_ST='$Owner_ST',Owner_C='$Owner_C',Issuer_CN = '$Issuer_CN',Issuer_OU='$Issuer_OU',Issuer_O='$Issuer_O',Issuer_L='$Issuer_L',Issuer_ST='$Issuer_ST',Issuer_C='$Issuer_C',SerialNumber='$SerialNumber',MD5='$MD5', SHA1='$SHA1', SHA256='$SHA256',SigAlgorithmName='$SigAlgorithmName',Version='$Version' where rowid =$rowid"

		fi

		### Delete the temp information from each analyzed apk
		rm -rf $tempUnzipDir/*
		
		### Get the signing key information and add it to the database.
		

	done

