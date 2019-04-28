Lines Matcher

What is it?

The Lines Matcher is a application that has the ability to match all lines of the input file with all lines of the pattern file 
and run one of three modes:
-output all the lines from input file that match exactly any lines from pattern file;
-output all the lines from input file that contain a match from patterns file somewhere in the line;
-output all the lines from input file that contain a match with edit distance <= 1 pattern file;

Tools/libraries

This application is for determining the edit distance uses technology Levenshtein. This defines the minimum number of operations
required to insert one character, delete one character, and replace one character with another to convert one string to another.
Is measured for the two lines, is solved using recursion.

instructions to build and run Web Search Application (for windows)

-to install the Lines Matcher, you need to download this application from a remote repository via the link provided using a 
-third-party application (Git Bash...) or download a ZIP-archive, in the second case after you need to unpack it;
-for the application you must have apache-maven (link: https://maven.apache.org/);
-to download the Lines Matcher, go to the root directory of the project from the command line (.../linesMatcher) and the command (mvn clean package exec:java);
-you can also run the application in any development environment.

email

SergeichykAnton@gmail.com