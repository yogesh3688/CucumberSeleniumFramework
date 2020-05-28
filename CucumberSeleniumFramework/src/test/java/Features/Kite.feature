Feature: Checking Kite Functioanlity



Scenario: Verify Login Functioanlity
Given Kite_I open chrome browser
When Kite_I naviagate to "https://inrprepaid.icicibank.com/customer/login.jsp"
And Kite_I enter user id "NIPATEYG3688" and password "yogi20038980509" and click Login button
And Kite_I enter Pin "060592" and click on continue button
Then Kite_click on Logout
Then Close the Browser
