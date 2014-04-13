#!/bin/bash 
### Find Clones

echo "Find Bugs: " 

### Location of the findbugs functionality
bugDetectorLocation=findbugs/findbugs-2.0.3

### Location of the class files to be analyzed
inputLocation=../../testinputclass/


cd $bugDetectorLocation

# Basic command to implement findbugs
# java -jar lib/findbugs.jar -textui $inputLocation/location1/

### Loop through all of the main files in the input location
### Findbugs will be executed on each of them
for i in $(find $inputLocation -mindepth 1 -type d ) # mindepth ignore the top layer
do
 #   echo $i
 	### Find way to output this to the appropriate storage location
	java -jar lib/findbugs.jar -textui $i
done

