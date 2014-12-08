#!/bin/sh

for file in $(cat group2.lst);
do
echo Finding $file ...
	find /scratch/alreadyscanned -name $file -exec cp '{}' group2_out/ \;
#	find /scratch/alreadyscanned/tempAPK/downloads/ -name $file -print

#	cp $file group1_out
done

