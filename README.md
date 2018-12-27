# properties-example
properties-example

env properties is detected in following manner
1. passed from command line as -Denv
2. from testng xml
3. default value from the test file

For e.g. 
1. if -Denv=prod and testng.xml=qa and default value in test is dev. Then prod.properties will be loaded
2. if -Denv is not passed then qa from testng xml will used and qa.properties will be loaded
3. if both testng.xml and -Denv are not passed then dev.properties will be loaded

Reference - http://www.testautomationguru.com/selenium-webdriver-how-to-execute-tests-in-multiple-environments/
