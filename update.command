cd Desktop/T21
git fetch origin master
git reset --hard FETCH_HEAD
find . -name "*.command" -exec chmod +x {} \;
read -rsp $'Your textbook is now up to date. Press enter to continue...\n'
