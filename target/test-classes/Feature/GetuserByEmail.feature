Feature: User is able to fetch email from the database



@Getbyemail
Scenario: User is able to get by email from the database
When User is able to retrieve email by using URI  is "http://localhost:8080/users/email?email=ras555@gmail.com"
Then User validate the status code  200