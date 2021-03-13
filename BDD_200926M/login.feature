Feature: login verification
Background: 
Given open browser
And navigate to URL
Scenario: as a user using valid credential should be logged in


When User type userID in userID textBox
And user type password in passwordBox
And user click on login button 
Then user should be in his profile page

Scenario Outline: as a user using valid credential should be not logged in


When User type <"userID"> in userID textBox
And user type <"password"> in passwordBox
And user click on login button 
Then user should not be in his profile page

Examples: 
|userid|password|
|user1|password1|
|user2|passwrod2|

