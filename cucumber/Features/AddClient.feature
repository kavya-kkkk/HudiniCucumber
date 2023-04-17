Feature: Adding  Client as a hudini admin
@sanity
   Scenario:  sign in to application by using valid creaditonals
  
    Given I launched chrome browser 
    When I opened the hudini Signin page "https://testing.d2okaspacdbhs.amplifyapp.com/"
    Then I entered the email id "kavya.krishnamurthy@rhibhus.com"
    And I entered the password "Kavya@1234"
    Then I clicked on sigin buttton 
    Then I can saw the Hudini Admin dashboard
    When I click on clients dropdown and Client list button
    And I can saw the  List of added Client list page
    Then  I clicked on Add button 
    And I  added  the client details as a admin
    When  I clicked on Add button
    And  I received successfully popup window with ok button
    Then  I click on popup  window OK button
    And I closed the browser
   



