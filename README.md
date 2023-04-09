# cs542-fall-22-assign3

## Name: SHRUTI IYENGAR [B00974747]

(Number of slack days used in this assignment: 0)

-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in myCampusTour/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile myCampusTour/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile myCampusTour/src/build.xml all
eg:
/Desktop/DPNew/cs542-fall-22-assign3-siyenga1$ ant -buildfile myCampusTour/src/build.xml all



Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile myCampusTour/src/build.xml run -Darg0=<campusTourError.txt> -Darg1=<DEBUG_VALUE> 


## you can run it in the following manner:

ant -buildfile myCampusTour/src/build.xml run -Darg0="campusTourError.txt" -Darg1=2

Note: Arguments accept the absolute path of the files.

-----------------------------------------------------------------------
## Description:
The abstract class implementation FallTour has tourActivity() methods and methods used to populate result with a list of activities. From this class different activities are called and accessed using the enum choices. Each activity package has an interface which has a respective implementation which checks the user choice and performs the activity. All activity interfaces  extend the parent ActivityI. ActivityI interface extends CostI, DurationI, EffortI and CarbonFootPrintI. An arrayList is used to to iterate over different activities and get cost, effort, etc. for each activity. The workshop builds the tour by using a construct method(called by the Driver class).

Modified build.xml to implement jdoc using ant.

-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.""

Date: 11/16/2022



# cs542-fall-22-assign3-siyenga1-main
