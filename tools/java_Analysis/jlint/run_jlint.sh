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




#### Function to get jlint count from the application output






### Helpful date website http://stackoverflow.com/questions/8903239/how-to-calculate-time-difference-in-bash-script
### Date/Time when the script begins to run
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


	jlineCount=0 # Reset the count after each iteration
	### Loop through each of these folders and analyze each .class file
	### This is messy, but I am not sure how else to analyze only class files - dk
	FILES=$(find $i -type f -name '*.class')
	for f in $FILES
	do
		#echo $f
		
		
		
		tempoutput=`./jlint/jlint $f`
		echo hi $tempoutput
		
		
		### Record the output amount in the log
		
		### Record the output amount in the database
		
		
		### Print out the output amount
		
	done
echo "End Jlint Analyzing:" `echo $i` `date` >> $logLocation
	
done



#./jlint/jlint -java $inputDirectory/Gmail%apk 





date2=$(date +"%s")
diff=$(($date2-$date1))


echo "JLint Total Running Time $(($diff / 60)) minutes and $(($diff % 60)) seconds."  >> $logLocation
echo "Jlint End:" `date` >> $logLocation


