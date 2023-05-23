

Feature: Hudini signin page
@sanity
 Scenario: sign in to application by using valid creaditonals
  Given I launched browser 
    When I opened the hudini Signin page "https://testing.d2okaspacdbhs.amplifyapp.com/"
   Then I entered the email id "kavya.krishnamurthy@rhibhus.com" 
   And I entered the password "Kavya@1234"
    Then I clicked on signin buttton 
     And I closed the browser
   
      