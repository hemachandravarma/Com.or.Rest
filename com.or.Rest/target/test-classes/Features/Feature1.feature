Feature: Get all employee details

  Background:
    Given Register end point
    And define HTTP method

  Scenario: Get All posts
   
    When Submit request via GET Method to restful service
    Then Statuscode is "200" and content type is:
      """
      application/json
      """

  Scenario: Get specific post
    When Submit request for id "1" via GET Method to restful service
    Then Statuscode is "200" and id is "1"
