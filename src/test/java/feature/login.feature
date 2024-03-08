Feature: Login page Feature

Background:
Given Set the entries from the data base
When User enter launches browser from config file
And user get the URL 

@smoke
  Scenario: Admin Login page
    Given User is on Net bank login page
    When User enter username "Admin" and password 12345
    Then User uccessfully navigate to the home page

  #reusability
  #Data driven
  @Regration
  Scenario Outline: Multiuser login
    Given User is on Net bank login page
    When User enter username "<Username>" and password <password>
    Then User uccessfully navigate to the home page

    Examples: 
      | Username       | password |
      | NetbankUser    |      123 |
      | CreditcardUser |      199 |
      | DebitcardUser  |      100 |
	
  #parametarization
  @Unit @Regration
  Scenario: Userregistration signup page
    Given User is on registration page
    When User enter details in regisyration page
      | anj    |
      | martha |
      | man    |
      |anj@gmail.com|
      |1.009|
      | 504502 |
      
      Then User successfully registered
