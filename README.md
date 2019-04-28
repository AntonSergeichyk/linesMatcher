**Lines Matcher**

**About**

The Lines Matcher is an application that compares all lines in the input file with all lines in the pattern file and runs one of three modes:
-output all lines from the input file that fully match with a particular line from the pattern file;
-output all lines from the input file that contain a match from the pattern file somewhere in the line;
-output all lines from the input file that contain a match with edit distance <= 1 pattern file;

**Tools/libraries**

This application determines an edit distance using technology Levenshtein. This defines the minimum number of operations required to insert one character, delete one character, and replace one character with another to convert one string to another. The task solved using recursion method. 

**Installation guideline (for windows)**

-to install the Lines Matcher, you need to download it from a remote repository via the link using a third-party application (Git Bash...) or download a ZIP-archive, in the second case you need to unpack the archive after downloading; 
-you should install apache-maven (link: https://maven.apache.org/);
-to download the Lines Matcher, go to the root directory of the project from the command line (.../linesMatcher) and type the command (mvn clean package exec:java);
-you can also run the application in any development environment.

**email**

SergeichykAnton@gmail.com