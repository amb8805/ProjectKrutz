#!/bin/bash


#### Pull data from repo
### Not sure if this is needed
#echo "Pull data"




echo "Update Permissions"
chmod -R a+x tools/java_Analysis/APK_to_JAVA/convert_APK_Java.sh
chmod -R a+x tools/java_Analysis/APK_to_JAVA/dex2jar-0.0.9.15/dex2jar.sh
chmod -R a+x tools/java_Analysis/CloneDetection/runclones.sh
chmod -R a+x tools/java_Analysis/checkstyle/checkStyle.sh

chmod -R a+x tools/java_Analysis/CloneDetection/nicad3
chmod -R a+x tools/androguard/androrisk.py



