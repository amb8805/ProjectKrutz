#!/bin/bash 

input=javaOutput


#	files=$(find $input -type f -name '*.class') | wc -l

classCount=`find $input -type f -name '*.class' | wc -l`

	echo $files