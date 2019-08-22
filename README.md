################################################
Before Running the test:
################################################
The Chrome Driver location might have to be changed based on the computer it is to be run . Please Open the "testingframework\src\main\resources\AutomationConfiguration.properties"
file and change the following variable name accordngly:

chromeDriverLocation=D:\\driver\\chromedriver.exe <Give the driver location accordingly>

The current framework works for only chrome browser , but with minor code changes it can be easily configured for other browsers as well. However this is not tested with other
browsers. 


A.) Steps to run the project from command prompt:
#################################################

1.) Download or clone the project into local from the "https://github.com/arijitdeb1502/testing.git" reposiory. If downloaded extract it.

2.) From command prompt cd to "testingframework" directory. 

3.) After moving to the "testingframework" directory as mentioned in step 2 execute the following maven command which will invoke the TestRunner.

"mvn clean test"

B.) Steps to run the project from "IntelliJ IDEA" :
###################################################

1.) Download or clone the project into local from the "https://github.com/arijitdeb1502/testing.git" reposiory. If downloaded extract it.

2.) From the "Downloads" folder go to the "testing-master\testing-master\" directory using windows explorer.

3.) Right click on the "testingframework" folder and click on the "Open Folder as IntelliJ IDEA Project". 

4.) Inside "IntelliJ IDEA" go to "src\test\java\runner\" package, right click on the TestRunner java file  and  "Run 'TestRunner'" .



C.) Test Run Report Details:
############################

1.) Once the test runner is completed the test reports can be found inside the following directory :
    "testingframework\target\surefire-reports"
	
2.) Consolidated test report can be found in the following index.html file (for STEP A) :

    "testingframework\target\surefire-reports\index.html" 

3.) Detailed Cucumber pretty formatted report with each and every scenario details can be found in the following folder (for STEP B):

    "testingframework\target\site\cucumber-pretty\index.html"

