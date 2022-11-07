Feature: validate user By Phone number

@Validatebyphonenumber
Scenario: user is able to validated by phone Number 
When user  validating  the Phone Number by using an API is "http://localhost:8080/users/phone/{phone}?phone=7018530713"
Then User get status code of validate user by phone number 200