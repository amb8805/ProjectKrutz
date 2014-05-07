#!/bin/bash 
### Run Jlint on all files
### Will return a listing of defects & suggestions in the application.
###		sudo apt-get install lib32z1-dev   --> This likely needs to be installed

logLocation=../../logs/jlint.log

### Remove the log if it is there
rm -f $logLocation

## Create the log
touch $logLocation

echo "Jlint Start:" `date` >> $logLocation

date1=$(date +"%s")

### Location of all files to be analyzed
inputDirectory=javaOutput

### Loop through all of the javaOutput folders
### Loop through all of the folders in the input directory
for i in $(find $inputDirectory -mindepth 1 -maxdepth 1 -type d ) 
									### mindepth ignore the top layer
									### Only examine the top layer
do

	echo "Begin Jlint Analyzing:" `echo $i` `date` >> $logLocation

	loopCount=0
	jlintCount=0 # Reset the count after each iteration
	### Loop through each of these folders and analyze each .class file
	### This is messy, but I am not sure how else to analyze only class files - dk
	FILES=$(find $i -type f -name '*.class')
	for f in $FILES
	do
		loopCount=$((loopCount+1)) ### Right now this is used for debugging purposes
		tempoutput=`./jlint/jlint $f`
	
		### Check to make sure that tempoutput contains "Verifcation Completed"
		### if not, then skip it
		if [[ $tempoutput =~ "Verification completed"* ]]
		then
			tempResults=`echo $tempoutput | sed -e "s/.*Verification completed: //;s/ reported messages.*//";` #echo $tempoutput
			#echo $tempResults
		fi
		jlintCount=$((jlintCount+tempResults))

	done
	
	### Add output to log file
	echo "JLint Count:" $jlintCount in $i `echo $i` `date` >> $logLocation	
	
	#### ADD THIS INFORMATION TO THE DATABASE
	#### JLint Value: $jlintCount 
	#### APK File: $i
	
	echo JLint Value: $jlintCount APK File: $i
	
done

	echo "End Jlint Analyzing:" `echo $i` `date` >> $logLocation

date2=$(date +"%s")
diff=$(($date2-$date1))


echo "JLint Total Running Time $(($diff / 60)) minutes and $(($diff % 60)) seconds."  >> $logLocation
echo "Jlint End:" `date` >> $logLocation
