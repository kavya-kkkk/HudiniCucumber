Feature: Client edit feature

Scenario: Login as a admin Hudini  and edit a client 

   Given I launched browser 
    When I opened the hudini Signin page "https://testing.d2okaspacdbhs.amplifyapp.com/"
    Then I entered the email id "kavya.krishnamurthy@rhibhus.com"
    And I entered the password "Kavya@1234"
    Then I clicked on sigin buttton 
    Then I can see the Hudini Admin dashboard
    When I click on clients dropdown and Client list button
    And I can saw the  List of added Client list page
    And I clicked on particular clients edit button
    Then I edited the client details as a admin
    Then I clicked on save button
    And  I received successfully popup window with ok button
    Then  I click on popup  window OK button
    And I closed the browser
   
   


    
    

