# Problem Statement

Write a java program to accept a variable x. x can be any number from 1 to 230-1.
Generate a file with x number of lines and each line consist of a string that is unique with 100
characters long

Limitation: This java program needs to run with only 10M of ram.

Requirement:
* You’re working in a team.
* Give us the program in GitHub public repo.
* The code has "separation of concern"
* The code is testable with Junit test
* The test coverage just need to be "enough"
* Please send me over your Github repo with the assignment

# Solution
The code has been broken into three packages:

### text
This package is responsible for text operations. As per the problem statement, we need
unique strings. We could approach this in various ways. We simply generated sequential
strings based on input length using only lower character alphabets a to z.

### file
This package is responsible for file operations. As per the problem statement, we need
to write line by line so we exposed the functionality as line writer.

### app
This package is simply driver/application. It parses input *x* provided and verifies it.
The various values defined in the problem statement are also configured here because the
rest of the client libraries are configurable to support other values if needed.

## Running the code
The code can be run by importing it as a maven project in preferred IDE. Once import is
successful, simply run App.java. You would need to update your run config so that *x* is
provided as command line arg.

Alternatively, directly run the maven target: `mvn clean compile assembly:single`
This would compile the code into jar. Now run the jar by providing suitable command line
arg