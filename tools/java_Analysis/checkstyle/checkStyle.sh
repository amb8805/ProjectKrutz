#!/bin/bash 
### Find Clones


### Todo
# Put all of this into a log




### Helpful date website http://stackoverflow.com/questions/8903239/how-to-calculate-time-difference-in-bash-script
### Date/Time when the script begins to run
date1=$(date +"%s")





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
