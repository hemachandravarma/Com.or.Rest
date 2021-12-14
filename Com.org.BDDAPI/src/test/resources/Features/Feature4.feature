
Feature: delete

  Scenario: Delete existing posts
    Given Register end point in "QA" environment
    And define HTTP request
    When submit request via DELETE to service by taking data from text file
    Then validate response aas per data in text file 
