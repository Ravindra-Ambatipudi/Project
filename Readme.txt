Framework:
For the project, Cucumber BDD Page Object Model Framework is considered which creates object repository for web elements. A separate page class is created for each and every web page in the application. The Page Class created will identify the web elements of that web page and also the page methods which perform the operations on those web elements.
In this project, in the Framework different packages were considered:
src/Tests/java:
1)	Page Specific Locators Package: In this Page Specific Locators package we will create a file to define the customized Page Specific Methods which will be used while executing the code.

2)	Utility Package: In this package all the reusable logics which will be used in the script will be saved in a file. Along with that If any data need to be get from Excel files or and data from the test reports and to retrieve data from the property file all the files will be saved in the utility package.


3)	Step Definitions Package: In this package all the steps to be performed during the code execution will be framed and defined. 
 
4)	Package for Exceptions: A separate package for all the exceptions that will be triggered during the code execution will be saved in a file under this package.


5)	Package for Constants

6)	Package for Logics for mobile app launch: 

7)	Runner Package: 
Src/Tests/ resource:
1)	Feature Files: The code will be written in this file and based on the steps mentioned in the step definition package the desired methods from the page specific methods will be called and the code will be run in the Runner class.

2)	Config.properties: The properties of the device will be specified in this file.




The 3 Test Cases considered for this project are:
Test Case 1: Login Functionality
Objective: To verify that the user can log-in successfully with valid credentials.
Steps to be considered: 
a)	Launch the application
b)	Click on the Login button
c)	Find the Username text box using Locator and enter the valid USERNAME
d)	Find the Password text box using Locator and enter the valid PASSWORD
e)	Click the Submit button
f)	Verify that the user is redirected to the home page

Test Case 2: Search Functionality
Objective: To verify that the user can search for a Search for a product and view all the products.
Steps to be considered:
a)	Launch the application
b)	Click on Search button
c)	Enter the product name in the search box
d)	Click on search button
e)	Verify that the search results are displayed
f)	Click on one of the search results
g)	Verify that the details of the product are displayed 

Test Case 3: Checkout Functionality
Objective: To verify that the user can checkout and complete the purchase process.
Steps to be considered:
a)	Launch the application
b)	Search for a product
c)	Select the product
d)	Add the product to the cart
e)	Click on the cart button
f)	Verify that the correct product is displayed in the cart
g)	Click on the checkout button
h)	Enter the shipping and billing information
i)	Click on the place order button
j)	Verify that the order confirmation message displayed

For the Test Cases considered we will write the program for Automation and run the Code in the Runner class and will check for the flow. If any defects are found out the code will be edited for the errors and will be checked again. If there are any bugs identified during the testing it will be reported to the developer for the changes. Jira tool will be used as Project Management tool for reporting the bugs and checking the status of the project.


