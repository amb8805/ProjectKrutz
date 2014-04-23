#!/bin/bash 

##Usage
## ./convert_APK_Java

## Description: Converts all apk files in a given directory to .java x
### Make sure that open-jdk is installed 
### 	sudo apt-get install openjdk-7-jdk


## Location of directory holding all java conversion functionality
apk_Conv_dir=APK_to_JAVA

###Input location with all of the 
APKInputDir=$1 

logLocation=logs/convert_apk.log

### Remove the log if it is there
rm -f $logLocation
## Create the log
touch $logLocation

date1=$(date +"%s") # Start Run Time

### convert individual file
### Refactor this out to a different file
convertAPK (){

	echo "Begin Analyzing:" `date` " " $1 >> $logLocation
	inputFileName=$(basename $1 .apk)

	### Application Name without .apk
	appName=${1//.apk/""}

	## Replace all the periods in the apk to allow the better creation of the output foldername
	## Replace . with %
	## 		This should probably be fixed to just strip out the apk entirely.
	##		May need to be refactored 
	outputFolderName=${1//[.]/%}

	### Main directory all of the java output will be going to
	mkdir -p javaOutput

	JavaOutputDir=javaOutput/$outputFolderName
	dirAndAppName=$JavaOutputDir/$1

	mkdir -p $JavaOutputDir

	cp $APKInputDir/$1 $JavaOutputDir

	## Start analyzing the apk files
	java -jar $apk_Conv_dir/apktool1.5.2/apktool.jar d -f $dirAndAppName

	
	### Not sure why it creates an output file here, but delete it
	### This is a messy fix
	rm -rf $inputFileName

	## Create the dex file
	jar xvf $JavaOutputDir/$1 classes.dex

	mv classes.dex $JavaOutputDir/

	./$apk_Conv_dir/dex2jar-0.0.9.15/dex2jar.sh $JavaOutputDir/classes.dex 

	## Switching locatins was the only way to have everything output in the appropriate location.
	cd $JavaOutputDir
	jar xvf classes_dex2jar.jar 
	cd ../../ 


	

	## Now convert all of the .class files to .java
	FILES=$(find $JavaOutputDir -type f -name '*.class')
	for f in $FILES
	do
		string=$f

		if [[ $string != *'$'*  ]]
		then
			temp=$(basename $f)
			echo "Converted " $(basename $f) " to " ${temp//.class/".java"}
		
			### A faster decompiler should be used
			java -jar $apk_Conv_dir/jd-cmd/jd-cli/target/jd-cli.jar $f > ${f//.class/".java"}
			#java -jar $apk_Conv_dir/cfr_0_78.jar $f > ${f//.class/".java"}
		fi
	done
	#echo `date` ## Keep this for measuring conversion times

	### Remove all of the files that are not java files
	### Remove from now since we need the .class files for findbugs
	### This is commented out because these files are needed by other analyzation tools
 	#rm -fr `find $JavaOutputDir -type f -print | sed '/\.java$/d'`

 	## Log the results
 	classFileCount=`find $JavaOutputDir -type f -name '*.class' | wc -l`
 	javaFileCount=`find $JavaOutputDir -type f -name '*.class' | wc -l`

	echo "	*****Output Dir: " `echo $JavaOutputDir` "Classfiles " `echo $classFileCount` >> $logLocation
	echo "	" `echo $appName` " Class Files Created: " $classFileCount

	##### INSERT THE NUMBER OF CLASS FILES CREATED INTO THE SQLITE DATABASE
	#####  # Of class files: $classFileCount
	#####  File name: $JavaOutputDir

	## Output the results to the user
#	echo "	*****Output Dir: " `echo $JavaOutputDir` >> logs/convert_apk.log
#	echo "	" `echo $appName` " Files Created: " `find $JavaOutputDir -type f -name '*.java' | wc -l` 

}

## Remove spaces in the filenames. This will cause probems for the rest of the application.
find $APKInputDir -name '* *' | while read file;
do
	target=`echo "$file" | sed 's/ /_/g'`;
	echo "Renaming '$file' to '$target'";
	mv "$file" "$target";
done;


echo "Start Date:" `date` >> logs/convert_apk.log

## Loop through all the contents of the main APK directory
FILES=$(find $APKInputDir -type f -name '*.apk')
for f in $FILES
do
	#echo $f
	convertAPK $(basename $f)
done

### Log end date/time

date2=$(date +"%s")
diff=$(($date2-$date1))
echo "convert_APK End:" `date` >> $logLocation
echo "Total Time $(($diff / 60)) minutes and $(($diff % 60)) seconds."  >> $logLocation





### Todo: 
# Check logs into GIT
# Check with many different .apk files
# Find a faster decompilation method
# Put a counter x/x, on the decompilation process 

## To log: ./convert_APK_Java >file.log 2>%1
