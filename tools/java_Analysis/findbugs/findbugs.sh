#!/bin/bash 
### Find Clones


### Todo
# Put all of this into a log

echo "Find Bugs: " 

### Location of the findbugs functionality
bugDetectorLocation=findbugs/findbugs-2.0.3

### Location of the class files to be analyzed
inputLocation=../../testinputclass/


cd $bugDetectorLocation

# Basic command to implement findbugs
# java -jar lib/findbugs.jar -textui $inputLocation/location1/


touch test.txt

### Loop through all of the main files in the input location
### Findbugs will be executed on each of them
for i in $(find $inputLocation -mindepth 1 -type d ) # mindepth ignore the top layer
do
 #   echo $i
 	### Find way to output this to the appropriate storage location
	# temp=$(java -jar lib/findbugs.jar -textui -output test.txt -xml -sourcepath -min $i)
temp="`java -jar lib/findbugs.jar -textui -output test.txt -xml -sourcepath -min $i 2>&1`"
	echo start $temp end
#	echo dan $temp
done

