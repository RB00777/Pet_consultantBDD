Feature: Put Method

@PUt
Scenario: User wants to post the data
Given User is able to update the data in json format
When User update the data by using an api is "http://localhost:8080/users"
Then User validates the update status code is 201 
