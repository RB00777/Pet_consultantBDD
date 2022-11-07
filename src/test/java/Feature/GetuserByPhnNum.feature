Feature: Get user by phone

@Getbyphonenumber
Scenario: user is able to get by phone Number 
When user  retrieve  the Phone Number by using an API is "http://localhost:8080/users/phone/{phone}?phone=87630971234"
Then User validate status code of get user by phone number 200