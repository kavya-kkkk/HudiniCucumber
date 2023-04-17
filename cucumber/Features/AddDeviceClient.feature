Feature: Adding device as a client


 if u are using intead of scenarios  it will show error  steps and 0 secenario
 
 
Scenario:  Login to application as a client and add a device
    Given I launched browser 
    When I opened the hudini Signin page "https://testing.d2okaspacdbhs.amplifyapp.com/"
    Then I entered the email id "gkrishnamurthy443@gmail.com" 
    And  I entered the password "Kavya@1234"
    Then I clicked on sigin buttton
    And I can saw the Hudini Admin dashboard 
    When  I clicked on chromecast button 
    Then I can saw the  List of add device list page 
    And  I clicked on add device button
    Then I  added  the client as a admin
    When I clicked on save button
    Then I clicked on popup window ok button
    And I closed the browser
   
   