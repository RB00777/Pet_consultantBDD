Feature: Post Method

@Post
Scenario: User wants to post the data
Given User is able to post the data in json format
When User post the data by using an api is "http://localhost:8080/users/save"
Then User validates the post status code is 201 

