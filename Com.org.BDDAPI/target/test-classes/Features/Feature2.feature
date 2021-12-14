Feature: posts create a new post 

 Background: 
    Given Register end point in "DEV" environment 
    And Define HTTP Request
    
  @tag2
  Scenario Outline: Create a new post 
    When submit request via post method with "<uid>","<title>","<body>" to service 
    Then status code is "<sc>" as per "<criteria>" and content type is """application/java"""
   @smoketest
    Examples: 
      | uid | title  | body                   | Criteria| sc|
      | 10  | wishes | all the best students  | unique  |201|
      
      
      Examples: 
      | uid | title  | body                             | Criteriac  | sc|
      | 10  | wishes | Do singing in haven Mr.Balu sir  | unique     |201|
      | 10  | wishes | Do singing in haven Mr.Balu sir  | duplicate  |200|
      |     | wishes | do something                     | wrong      |400|
      
     
