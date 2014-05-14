array=()
echo "Begin cleaning up the database"
while read id; do
	file="$id.apk"
	if [ ! -f "scraper/downloads/full/$file" ]; then
		echo "File $file does not exist"
		array[${#array[*]}]=$id
	fi
done < <(sqlite3 Evolution\ of\ Android\ Applications.sqlite "SELECT ApkId FROM ApkInformation")

for apk in ${array[@]}; do
	echo "Removing record $apk from database"
	sqlite3 Evolution\ of\ Android\ Applications.sqlite "DELETE FROM ApkInformation WHERE ApkId = '$apk'"
done
echo "Database cleanup complete"
