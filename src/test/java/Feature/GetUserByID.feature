Feature: User is able to fetch details from the database by using id

@Getbyid
Scenario: user wants to Retrieve the id data from Database

When User is able to Retrieve details by using an Api is "http://localhost:8080/users/65"
Then User Validate the Status code of get all user 200