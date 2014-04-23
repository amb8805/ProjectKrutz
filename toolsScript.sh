#!/bin/bash

clear

echo "The script starts now"
echo

rm output.txt

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

FILES=../../testAndroidApps/*
for f in $FILES
do
        APK="../apkOutput/"
        OUTPUT="_output"
        O_F=$APK${f#../../testAndroidApps/}
        OUTPUT_FOLDER=${O_F%.apk}$OUTPUT

        echo **********Stowaway***********
        echo ${f#../../testAndroidApps/}

        mkdir $OUTPUT_FOLDER

        bash ./stowaway.sh $f $OUTPUT_FOLDER &>../../../output.txt
	
	cd $OUTPUT_FOLDER
		
	for line in $(cat Overprivilege)
	do
		echo $line
		# instead of echoing put this into the database 
		cd ../../../../
		sqlite3 Evolution\ of\ Android\ Applications.sqlite  "INSERT INTO PERMISSIONS (ApkName,ApkVersion,${line#android.permission.}) VALUES ('howsitgoing','1.0',1);"
		cd ./tools/stowaway/${OUTPUT_FOLDER#../}
	done 

	cd ../../Stowaway-1.2.4
done

popd

echo
echo "Starting Androguard"

pushd ./tools/androguard

mkdir ../../AndroRiskOutput

FILES=../testAndroidApps/*
for f in $FILES
do
        echo "***********AndroRisk for ${f#../testAndroidApps/} ***********"
        
	OUTPUT_FILE=../../AndroRiskOutput/${f#../testAndroidApps/}_AndroRisk.txt
	./androrisk.py -m -i $f &> $OUTPUT_FILE 
	
	while read line;
	do
		if [[ $line == *VALUE* ]]
		then
			echo FUZZY RISK $line
			cd ../../
			num=${line#VALUE}   #I am truncating the fuzzy risk number and making it an int
			float=${num/.*}
			int=$((float))
			sqlite3 Evolution\ of\ Android\ Applications.sqlite  "INSERT INTO ApkStats (ApkName,ApkVersion,FuzzyRiskValue) VALUES ('howsitgoing','1.0',$int);"
			#instead insert into database
			cd ./tools/androguard
		elif [[ $line == ERROR* ]]
		then
			echo FUZZY RISK $line
		fi
	done < $OUTPUT_FILE
	
        #echo "********AndroAPKInfo for ${f#../testAndroidApps/} ***********"
        #./androapkinfo.py -i $f
	echo
done

popd

echo "all done with the script!"

exit