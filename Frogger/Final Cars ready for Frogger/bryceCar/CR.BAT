@echo off
echo Compiling...
javac --release 10 *.java
echo Compile Complete
java -cp .; starter
pause

