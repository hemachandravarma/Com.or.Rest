Feature: post creation

  @smoketest
  Scenario: Post data table 
    Given Register end point in "QA" environment 
    And define HTTP Request
    Then validate that restful service with content-type "application/json"
      | uid | title  | body                             | Criteriac  | sc|
      | 10  | wishes | all the best students            | unique     |201|
      | 10  | wishes | Do singing in haven Mr.Balu sir  | unique     |201|
      | 10  | wishes | Do singing in haven Mr.Balu sir  | duplicate  |200|
      |     | wishes | do something                     | wrong      |400|
    
    
   

 