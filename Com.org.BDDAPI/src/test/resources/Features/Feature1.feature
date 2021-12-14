
Feature: Get Employee details 

  Background: 
    Given Register end point in "DEV" environment 
    And Define HTTP Request
    
  @smoketest
  Scenario: get all posts 
    When Submit the reequest via HTTP GET method to restful service 
    Then Status code is "200" and Content-Type is: 
     """ 
      Application/json 
     """

  @smoketest
  Scenario Outline: get specific post
    When submit request for id "10" via HTTP POST method to restful service 
    Then status code is "200" and id is "10" in json response body


  @tag2
  Scenario Outline: get specific post in data driven
    
    When submit request for id "10" via GET method to restfull service 
    Then statuscode is "200" and content type is 
    """
    application/json
    """

    Examples: 
      | id    | Criteria | status code  |
      | 10    | valid    | 200          |
      | 101   | invalid  | 400          |
      |       | blank    | 400          |
