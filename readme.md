## Welcome to Selenium Cucumber Test Suite

This repo include one demo step and related github actions to take test image and push it docker hub. 

Test application repo can be found [here](https://github.com/selcuktemizsoy/demo-react-app)

### Tool stack
* Java 8+
* Maven
* JUnit
* Selenium
* Cucumber
* Github actions
* Docker

### Run
* To install maven dependencies

`mvn install`

* Run test 

First adjust .env.local file based on your needs. Or use any other .env file

Run this command 

`env $(cat .env.local) mvn test`

### TODO
* Thread driver/additional driver
* Reporting
* Screenshot support
* Notifications 
* Better readme :)
