Feature: Get Request

@GetWithEmail/Passward
Scenario: User is able to fetch Email from the Database

When User is Able to Retrieve email by using an URI is "http://localhost:8080/users/ras555@gmail.com/email?password=ring@123"
Then User Validate the Status code for get Email 200