Feature: validate saucedemo login fucntionality

Background:
Given user is on login screen of saucedemo
When user enters uname,pswd and login to application

@smoke
Scenario: verify search & adding product to cart functionality
When user performs search operation
And user navigate to product details screen