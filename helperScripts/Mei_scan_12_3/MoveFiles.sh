#!/bin/bash


cat group1.lst | while read FILENAME; \
do find /scratch/alreadyscanned/ -wholename "$FILENAME" -type f -print -exec cp '{}' group1_out \; ; done;
