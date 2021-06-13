# SeleniumCucumberHybridFramework

**What is it?**
This is an automation framework that demonstrates the use of Java with Cucumber, Selenium WebDriver w/ Page Object Model, JUnit and Okhttp.

**How do I run it?**
To run this framework you should **always** start the test with the "RunTests" class. This class contains the before/after class methods that will build
the Selenium Driver and properly close it. Running the example file directly will not work because the Driver will not be created. 

**What are the test cases?**
In the example file there are three test cases:
<ul>
<li>TC001: This test case demonstrates navigating to Google using Selenium and searching for given Strings. Validation that the result is www.google.com</li>
<li>TC002: This test case demonstrates navigating to Google and uses multiple input to navigate through the devices shop</li>
<li>TC003: This test case demonstrates REST by a GET request against a public API for US data and validates that the expected population matches the given year</li>
</ul>

**Negative Cases**
There are two negative cases, one for TC002 and one for TC003. These simply provide values that will automatically fail the case to demonstrate what a failure looks like. 

**Viewing Report** 
You can view the report at target/cucumber-reports/index.html after running to see the results in report format. 

**Upcoming Enhancements**
Next enhancements will involve DB validations (once I can find a good public SQL databsae to test against).
