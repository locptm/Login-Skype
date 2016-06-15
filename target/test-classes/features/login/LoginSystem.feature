#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Login to system 
As an user
to do something
I would like to login to system

@tag1
Scenario: Login fail with valid Skype name and invalid password
Given user go to page https://login.skype.com/login
And enter valid skype name is "phuongtt6103" and invalid password is "123456dh"
When user click Signin button
Then page show message "Signing in failed. Please double-check your Skype Name and re-enter your password."

Scenario: Login fail with invalid Skype name and valid password
Given user go to page https://login.skype.com/login
And enter invalid skype name is "phuongtt6103tt" and valid password is "Phuong123456"
When user click Signin button
Then page show message "Signing in failed. Please double-check your Skype Name and re-enter your password."

Scenario: Login fail with valid Skype name and valid password
Given user go to page https://login.skype.com/login
And enter valid skype name is "phuongtt6103" and valid password is "Phuong123456"
When user click Signin button
Then page direct to home page with title is "Skype My Account"
