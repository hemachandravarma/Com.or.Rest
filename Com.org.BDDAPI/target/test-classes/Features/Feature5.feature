
Feature: Update post 

  Scenario: Updtae the existing post 
    Given Register the endpoint in "STG" environment 
    And Define HTTP Request 
    When submit request via PUT method to service by taking data from excel file 
    Then validate the response as per the data in excel files 

