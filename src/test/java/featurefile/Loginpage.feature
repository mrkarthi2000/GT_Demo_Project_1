Feature: Adactin Feature

Scenario Outline: Login Page

Given user lanching the application
When user enter "<Username>" a username field
And user enter "<Password>" a password field
Then user enter submit button

Examples:
|Username|Password|
|mrkarthikeyan|Thinkdifferent@#123|

Scenario: Group of Hotel
Given user select the area location 
When user now select the hotels
And user select types of hotels
And user select the nos person stay in room
And user select adult are there
And user select Child are there
Then user click the search button

Scenario: Avilable Hotel
Given user is select available hotels
Then user click the contine

Scenario: Book a Hotel
Given user enter the first name
And user enter the last name
And user enter the billing name
And user enter the credit card no
And user enter the credit card type
And user enter the credit card expiry month
And user enter the credit card expiry Year
Then finally user enter the credit card cvv no
