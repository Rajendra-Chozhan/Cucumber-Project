Feature: Login 

@sanity
Scenario: Successful Login with Valid Credentials 

	Given User Launch Chrome browser 
	When User opens URL "http://automationpractice.com/index.php?controller=authentication&back=my-account" 
	And User enters Email as "chols@gmail.com" and Password as "chola761645" 
	And Click on Login 
	Then Page Title should be "Login - My Store" 
	When User click on Log out link 
	And close browser 
	
	@Regression
	Scenario Outline: Login Data Driven 
	Given User Launch Chrome browser 
	When User opens URL "http://automationpractice.com/index.php?controller=authentication&back=my-account" 
	And User enters Email as "<email>" and Password as "<password>" 
	And Click on Login 
	Then Page Title should be "Login - My Store" 
	When User click on Log out link 
	And close browser 
	
	Examples: 
		| email | password |
		|chols@gmail.com |	chola761645 |
		| admin1@yourstore.com | admin123	|
	