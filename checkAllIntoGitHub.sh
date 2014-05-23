#!/bin/bash 

	### LogsDirectory
	logsDir=logs
	logLocation=$logsDir/GitHubCheckin.log
	
	date1=$(date +"%s") ## Start date of the script
	echo "GitHub Checkin Start:" `date` >> $logLocation
	
	### Find all sqlDB files and check them in
	###		This is done just in case the filename is changed and it needs to be updated
	FILES=$(find . -mindepth 1 -maxdepth 1 -type f -name '*.sqlite')
	for f in $FILES
	do
		echo $f
		echo "Checking in database:" $f `date` >> $logLocation
	done

	### Now we do all the commiting ##
	echo "Commit Logs and Database to Github"
	##if this is the VM then run this
	##put the password into it
	
	echo "Committing to GitHub:" `date` >> $logLocation
#	git commit logs/* -m "Committing the logs for the night"
#	git commit EvolutionOfAndroidApplications.sqlite -m "Committing the database for the night"
#	git push origin master


	git add $logsDir/*
	git add EvolutionOfAndroidApplications.sqlite
	git commit -m "Automatic checkin"
	git push https://EvolutionOfAndroid:ProjectKrutz1@github.com/cklimkowsky/ProjectKrutz.git master

	echo "Done Commiting Logs"