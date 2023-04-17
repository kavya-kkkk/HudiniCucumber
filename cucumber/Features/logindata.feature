Feature: data driven

Scenario Outline: Login data driven 
Then I entered the email id "<email>"
   
    Then I entered the password "<password>"
    Then I clicked on sigin buttton 
    
     And I close the browser

     Examples:
     | email | password |
     |kavya.krishnamurthy@rhibhus.com|Kavya@1234|
     |kavyakrishnamurthy | Kavy@1234 |
    
