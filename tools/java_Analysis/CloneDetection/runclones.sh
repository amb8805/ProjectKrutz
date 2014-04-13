#!/bin/bash 
### Find Clones

echo "Run Clones: " 

### Location of Clone Detection Functionality
cloneDetectionLocation=CloneDetection

### Location of the clones to be analyzed
inputLocation=testinput
inputLocation=../../$inputLocation

### Loop through all of the folders in the input directory
### Todo: Does this need to be changed to account for all subdirectories as well?
###		Based on the java decompilation for now, it does not appear so.		

cd $cloneDetectionLocation
cd Nicad-3.5
for i in $(find $inputLocation -mindepth 1 -type d ) # mindepth ignore the top layer
do
    #echo $i
    ### Run the clone detection tool on each
	temp=`./nicad3 blocks java $i blindrename`

	### Do something with this to place it into the database
	echo "Total Clones Found: " $(basename $i) "-" $temp
done


