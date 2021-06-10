# SeleniumCucumberHybridFramework

Simple framework that combines a Cucumber Page Object framework with a Cucumber behavior driven framework. The framework has two scenarios - One which tests searching for
various words on google and the other which tests the google store by device/model. 

TODO / IMPORTANT - The chromedriver needs to be moved outside of the features so that it's part of the testrunner class rather than the step definitions. Right now if 
a step fails it will result in the chromedriver.exit not occuring IE memory leak. Will get to it ASAP. 
