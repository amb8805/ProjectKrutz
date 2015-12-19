#!/bin/bash

	inputDirectory=../group2_out/
	DBName=EvolutionOfAndroidApplications.sqlite
	AndroRiskLoc=androguard

	mkdir -p logs

	logLocation=logs/androguard.log
	rm $logLocation
	date1=$(date +"%s")
	echo "AndroGuard Start:" `date` >> $logLocation

	touch $logLocation
#	echo "Starting Androguard"



	### Remove unneeded chars from the parsed output
	###	Kind of messy, but it works
	function removeChars {
		val=${1//:/""}
		val=${val//:/""}
		val=${val//,/""}
		val=${val//\'/""}
		val=${val// /""}
		echo $val
	}


	### Loop through all files in input directory
	for i in $(find $inputDirectory -type f) 
	do
		
		### Initially set the variables to be -1. This means the values were never updated
		DEX_NATIVE=-1
		DEX_DYNAMIC=-1
		DEX_CRYPTO=-1
		DEX_REFLECTION=-1
		APK_DEX=-1
		APK_EXECUTABLE=-1
		APK_ZIP=-1
		APK_SHELL_SCRIPT=-1
		APK_APK=-1
		APK_SHARED_LIBRARIES=-1
		PERM_PRIVACY=-1
		PERM_NORMAL=-1
		PERM_MONEY=-1
		PERM_INTERNET=-1
		PERM_SMS=-1
		PERM_DANGEROUS=-1
		PERM_SIGNATUREORSYSTEM=-1
		PERM_CALL=-1
		PERM_SIGNATURE=-1
		PERM_GPS=-1
		FuzzyRisk=-1


		#echo $i

		### Run AndroRisk on the files
		echo Scanning $i
		echo "Scanning" $i `date` >> $logLocation

		AndroRiskOutput=`./$AndroRiskLoc/androrisk.py -m -i $i`

		#	echo $AndroRiskOutput >temp.txt
		# AndroRiskOutput=`cat temp.txt`


		APKFile=$(basename $i)
		APKFile=${APKFile//.apk/""} ### Remove the apk exension from the apkID
	

		rowID=`sqlite3 $DBName "SELECT rowid FROM ApkInformation WHERE ApkId='"$APKFile"';"`
		
		AndroRiskInfoCount=`sqlite3 $DBName  "SELECT count(*) FROM AndroRiskInfo WHERE rowid='$rowID';"`
  		if [[ $AndroRiskInfoCount -eq 0 ]]; then
			sqlite3 $DBName "INSERT INTO AndroRiskInfo (rowID) VALUES ($rowID);"
       	fi


       	### Now begin parsing the information and inserting it into the database


		# Break output up into different groups
		DEX_GROUP=`echo $AndroRiskOutput | grep -o -P '(?<=DEX).*(?=} APK)'`
		APK_GROUP=`echo $AndroRiskOutput | grep -o -P '(?<=APK).*(?=} PERM)'`
		PERM_GROUP=`echo $AndroRiskOutput | grep -o -P '(?<=PERM).*(?=} FuzzyRisk)'`


		#echo $DEX_GROUP
		#echo $APK_GROUP
		#echo $PERM_GROUP


		DEX_NATIVE=`echo $DEX_GROUP | grep -o -P '(?<=NATIVE).*(?=DYNAMIC)'`
		DEX_NATIVE=`removeChars "$DEX_NATIVE"`

		DEX_DYNAMIC=`echo $DEX_GROUP | grep -o -P '(?<=DYNAMIC).*(?=CRYPTO)'`
		DEX_DYNAMIC=`removeChars "$DEX_DYNAMIC"`

		DEX_CRYPTO=`echo $DEX_GROUP | grep -o -P '(?<=CRYPTO).*(?=REFLECTION)'`
		DEX_CRYPTO=`removeChars "$DEX_CRYPTO"`

		DEX_REFLECTION=`echo $DEX_GROUP | grep -o -P '(?<=REFLECTION).*(?=)'`
		DEX_REFLECTION=`removeChars "$DEX_REFLECTION"`
		
		APK_DEX=`echo $APK_GROUP | grep -o -P '(?<=DEX).*(?=EXECUTABLE)'`
		APK_DEX=`removeChars "$APK_DEX"`

		APK_EXECUTABLE=`echo $APK_GROUP | grep -o -P '(?<=EXECUTABLE).*(?=ZIP)'`
		APK_EXECUTABLE=`removeChars "$APK_EXECUTABLE"`

		APK_ZIP=`echo $APK_GROUP | grep -o -P '(?<=ZIP).*(?=SHELL_SCRIPT)'`
		APK_ZIP=`removeChars "$APK_ZIP"`

		APK_SHELL_SCRIPT=`echo $APK_GROUP | grep -o -P '(?<=SHELL_SCRIPT).*(?=APK)'`
		APK_SHELL_SCRIPT=`removeChars "$APK_SHELL_SCRIPT"`

		APK_APK=`echo $APK_GROUP | grep -o -P '(?<=APK).*(?=SHARED)'`
		APK_APK=`removeChars "$APK_APK"`

		APK_SHARED_LIBRARIES=`echo $APK_GROUP | grep -o -P '(?<=LIBRARIES).*(?=)'`
		APK_SHARED_LIBRARIES=`removeChars "$APK_SHARED_LIBRARIES"`


		PERM_PRIVACY=`echo $PERM_GROUP | grep -o -P '(?<=PRIVACY).*(?=NORMAL)'`
		PERM_PRIVACY=`removeChars "$PERM_PRIVACY"`

		PERM_NORMAL=`echo $PERM_GROUP | grep -o -P '(?<=NORMAL).*(?=MONEY)'`
		PERM_NORMAL=`removeChars "$PERM_NORMAL"`

		PERM_MONEY=`echo $PERM_GROUP | grep -o -P '(?<=MONEY).*(?=INTERNET)'`
		PERM_MONEY=`removeChars "$PERM_MONEY"`

		PERM_INTERNET=`echo $PERM_GROUP | grep -o -P '(?<=INTERNET).*(?=SMS)'`
		PERM_INTERNET=`removeChars "$PERM_INTERNET"`

		PERM_SMS=`echo $PERM_GROUP | grep -o -P '(?<=SMS).*(?=DANGEROUS)'`
		PERM_SMS=`removeChars "$PERM_SMS"`

		PERM_DANGEROUS=`echo $PERM_GROUP | grep -o -P '(?<=DANGEROUS).*(?=SIGNATUREORSYSTEM)'`
		PERM_DANGEROUS=`removeChars "$PERM_DANGEROUS"`

		PERM_SIGNATUREORSYSTEM=`echo $PERM_GROUP | grep -o -P '(?<=SIGNATUREORSYSTEM).*(?=CALL)'`
		PERM_SIGNATUREORSYSTEM=`removeChars "$PERM_SIGNATUREORSYSTEM"`

		PERM_CALL=`echo $PERM_GROUP | grep -o -P '(?<=CALL).*(?=SIGNATURE)'`
		PERM_CALL=`removeChars "$PERM_CALL"`

		### Do special stripping here since siganture is in the output twice
		PERM_SIGNATURE=`echo $PERM_GROUP | grep -o -P '(?<=SIGNATURE).*(?=GPS)'`
		PERM_SIGNATURE=`echo $PERM_SIGNATURE | grep -o -P '(?<=SIGNATURE).*(?=)'`
		PERM_SIGNATURE=`removeChars "$PERM_SIGNATURE"`



		PERM_GPS=`echo $PERM_GROUP | grep -o -P '(?<=GPS).*(?=)'`
		PERM_GPS=`removeChars "$PERM_GPS"`


		FuzzyRisk=`echo $AndroRiskOutput | grep -o -P '(?<=VALUE).*(?=)'`

#		echo $DEX_NATIVE
#		echo $DEX_DYNAMIC
#		echo $DEX_CRYPTO
#		echo $DEX_REFLECTION
		
#		echo $APK_DEX
#		echo $APK_EXECUTABLE
#		echo $APK_ZIP
#		echo $APK_SHELL_SCRIPT
#		echo $APK_APK
#		echo $APK_SHARED_LIBRARIES
	
#		echo $PERM_PRIVACY
#		echo $PERM_NORMAL
#		echo $PERM_MONEY
#		echo $PERM_INTERNET
#		echo $PERM_SMS
#		echo $PERM_DANGEROUS
#		echo $PERM_SIGNATUREORSYSTEM
#		echo $PERM_CALL
#		echo $PERM_SIGNATURE
#		echo $PERM_GPS
#		echo $FuzzyRisk


       	#######  	Update the information into the database table
       	sqlite3 $DBName  "UPDATE ANDRORISKINFO SET DEX_NATIVE=$DEX_NATIVE, DEX_DYNAMIC=$DEX_DYNAMIC, DEX_CRYPTO=$DEX_CRYPTO, DEX_REFLECTION=$DEX_REFLECTION, APK_DEX=$APK_DEX, APK_EXECUTABLE=$APK_EXECUTABLE, APK_ZIP=$APK_ZIP, APK_SHELL_SCRIPT=$APK_SHELL_SCRIPT, APK_APK=$APK_APK, APK_SHARED_LIBRARIES=$APK_SHARED_LIBRARIES, PERM_PRIVACY=$PERM_PRIVACY, PERM_NORMAL=$PERM_NORMAL, PERM_MONEY=$PERM_MONEY, PERM_INTERNET=$PERM_INTERNET, PERM_SMS=$PERM_SMS, PERM_DANGEROUS=$PERM_DANGEROUS, PERM_SIGNATUREORSYSTEM=$PERM_SIGNATUREORSYSTEM, PERM_CALL=$PERM_CALL, PERM_SIGNATURE=$PERM_SIGNATURE, PERM_GPS=$PERM_GPS, FuzzyRisk=$FuzzyRisk WHERE rowiD=$rowID;"

		echo SQLUpdate $i
		echo "SQLUpdate" $i >> $logLocation
		echo "--------- $i" >> $logLocation

	done





date2=$(date +"%s")
diff=$(($date2-$date1))
echo "AndroGuard Total Running Time $(($diff / 60)) minutes and $(($diff % 60)) seconds."  >> $logLocation
echo "AndoGuard End:" `date` >> $logLocation






### Todo
# Put into GH
# When APK file is not found
