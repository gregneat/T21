#!/bin/bash

gnome-terminal -x bash -c "
cd /home/user/Desktop/T21/ &&
git fetch origin master && 
git reset --hard FETCH_HEAD && 
find . -name '*.command' -exec chmod +x {} \; &&
echo Your textbook is now up to date!; exec bash";

IFS=$'\n'; set -f;

for f in $(find ./ -type f -and -name "*.command"); do
	BASE=${f##*/};
	filepath="${f%$BASE}";
 	filename=$(basename -- "$f")
	extension="${filename##*.}"
	filename="${filename%.*}"
	
	if [[ "$filename" != "update" ]]; then	
	
		cd $filepath;

		echo $filename;

		echo '#!/bin/bash
gnome-terminal -e "bash -c \"./'$filename'.command; read; exit; exec bash\""' > "$filename.sh";

		chmod +x "$filename.sh";

		cd ~/Desktop/T21/;
 	
 	fi
done;


unset IFS; set +f;
