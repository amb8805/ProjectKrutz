#!/bin/bash 
### Find Clones


### Todo
# Put all of this into a log




### Helpful date website http://stackoverflow.com/questions/8903239/how-to-calculate-time-difference-in-bash-script
### Date/Time when the script begins to run
date1=$(date +"%s")

### Location of all files to be analyzed
inputDirectory=../testinput/


cd checkstyle/


### Loop through all files in the input directory
for i in $(find $inputDirectory -mindepth 1 -type d ) # mindepth ignore the top layer
do
	
	### Begin running checkstyle on each
	rm -f temp.txt
	touch temp.txt
	
	### messy, but I don't see a way around this
	
	#pwd
	#cd checkstyle
	#ls $inputDirectory/$i   	
	#temp="`java -jar checkstyle-5.7-all.jar -c all-checkstyle-checks.xml $target 2>&1 > temp.txt`"
	### Written to temp file since a variable is too long to parse afterwards
	#java -jar checkstyle-5.7-all.jar -c all-checkstyle-checks.xml $inputDirectory/$i/* 2>&1 > temp.txt
	#`java -jar checkstyle-5.7-all.jar -c all-checkstyle-checks.xml $target 2>&1 > temp.txt`
	
	
	#echo Application: $(basename $i)
	
	temp="`java -jar checkstyle-5.7-all.jar -c all-checkstyle-checks.xml $inputDirectory/$i/* 2>&1 > temp.txt`"

	fileTarget=temp.txt
#	cat $fileTarget

	defectCount=`grep -o '.java' $fileTarget | wc -l`

	date2=$(date +"%s")
	diff=$(($date2-$date1))

	touch temp.txt
	echo "$(($diff / 60)) minutes and $(($diff % 60)) seconds elapsed." 

	rm -f temp.txt


	echo FileName: $(basename $i)
	echo DefectCount: $defectCount



	
done


$(basename $i)

echo "$(($diff / 60)) minutes and $(($diff % 60)) seconds elapsed. - Total Time" 


exit






target=/home/notroot/shared/allfiles/ProjectKrutz/tools/java_Analysis/large_test/Netflix_v_3%1%1_build__1112%apk/*
#target=/home/notroot/shared/allfiles/ProjectKrutz/tools/java_Analysis/testinput/folder1

rm -f temp.txt
touch temp.txt

#ls -l $target
cd checkstyle
# java -jar checkstyle-5.7-all.jar -c all-checkstyle-checks.xml $target
temp="`java -jar checkstyle-5.7-all.jar -c all-checkstyle-checks.xml $target 2>&1 > temp.txt`"

fileTarget=temp.txt

#echo $temp > temp.txt
defectCount=`grep -o '.java' $fileTarget | wc -l`

date2=$(date +"%s")
diff=$(($date2-$date1))

touch temp.txt
echo "$(($diff / 60)) minutes and $(($diff % 60)) seconds elapsed." 

rm -f temp.txt


echo FileName:
echo DefectCount: $defectCount
