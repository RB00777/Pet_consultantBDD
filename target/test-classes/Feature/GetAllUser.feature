Feature: get All

@Getbyall
Scenario: User is able to fetch all the details from the database

When User is able to retrieve details by using an URI is "http://localhost:8080/users"
Then User validate the Status Code of get all user 200