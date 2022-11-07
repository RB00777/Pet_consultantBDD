Feature: Delete By ID

@DeleteById
Scenario: user wants to delete the id data from database

When User is able to delete the id by using an API is "http://localhost:8080/users/delete?id=67"
Then User validate the delete status code of id is 404