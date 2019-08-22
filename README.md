
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

2.) From command prompt cd to "testing-master\testing-master\testingframework" directory. 

3.) After moving to the "testingframework" directory as mentioned in step 2, execute the following maven command which will invoke the TestRunner.

"mvn clean test"

B.) Steps to run the project from "IntelliJ IDEA" :
###################################################

1.) Download or clone the project into local from the "https://github.com/arijitdeb1502/testing.git" reposiory. If downloaded extract it.

2.) From the "Downloads" folder go to the "testing-master\testing-master\" directory using windows explorer.

3.) Click on the "Maven" tab on the right hand side of intellij and select "LifeCycle".

4.) Click on the "clean" command and execute it using the run button.

5.) Click on the "test" command and execute it using the run button.


C.) Test Run Report Details:
############################

1.) Once the test runner is completed the test reports can be found inside the following directories :

    Default surefire-reports: "testingframework\target\surefire-reports"
    Cucumber pretty-reports: "site\cucumber-pretty"
	


################################################
Framework Used
################################################
Cucumber , BDD with TestNg assertions have been used to build this framework which follows "Page Object Model" design pattern.
