Feature:To validate login functionality of facebook application

Scenario: To validate login by using valid email and invalid password
Given User have to enter facebook login through chrome browser
When User have to enter valid email and invalid password
And User have to click login button
Then User have to close the page
			
Scenario:To validate forget password page by phone number
Given User have to enter facebook login through chrome browser
When User have to click the forget password
And user have to enter the phone number
Then User have to click search button

Scenario:To validate signup page
Given User have to enter facebook login through chrome browser
When User have to click create new account button
And User have to pass first name 
And User have to pass last name
And User have to pass mob number and new password
And User have to give DOB and gender
Then User have to click signup button 
