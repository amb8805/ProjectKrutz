#!/bin/bash 
### Run checkstyle on all files


### Todo
# Put all of this into a log

### Helpful date website http://stackoverflow.com/questions/8903239/how-to-calculate-time-difference-in-bash-script
### Date/Time when the script begins to run
date1=$(date +"%s")

### Location of all files to be analyzed
inputDirectory=../large_test/
#inputDirectory=../testinput/

cd checkstyle/

### Loop through all files in the input directory
for i in $(find $inputDirectory -mindepth 1 -type d ) # mindepth ignore the top layer
do
	### This could be written cleaner
	appName=${i//apk/""}
	appName=${appName//%/""}
	appName=$(basename $appName)
		
	### Begin running checkstyle on each
	rm -f temp.txt
	touch temp.txt
	
	### Written to temp file since a variable is too long to parse afterwards
	temp="`java -jar checkstyle-5.7-all.jar -c all-checkstyle-checks.xml $inputDirectory/$i/* 2>&1 > temp.txt`"
	fileTarget=temp.txt
	defectCount=`grep -o '.java' $fileTarget | wc -l`

	date2=$(date +"%s")
	diff=$(($date2-$date1))

	touch temp.txt
	echo "$(($diff / 60)) minutes and $(($diff % 60)) seconds elapsed." 

	rm -f temp.txt

	echo FileName: $appName
	echo DefectCount: $defectCount

done

### Put this into a log
echo "$(($diff / 60)) minutes and $(($diff % 60)) seconds elapsed. - Total Time" 




