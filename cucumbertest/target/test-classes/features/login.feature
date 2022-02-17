#Author
#Date
Feature: feature to test order product function

  Scenario: Check order product is successful with valid credentials
    Given user is on main page
    And user click on women page button
    And user click on product and navigate to product detail page
    And user add product to cash and navigate to shopping cart summary page
    And user click process to checkout and navigate to authentication page  
    And user fill email infomation and click on create account button then navigate to create account page
    And user fill information and create account then navigate to addresss page
    And user process to checkout and navigate to shipping page
    And user process to checkout and navigate to payment page
    And user click on pay by check and navigate to order summary page
    And User click on confirm button and navigate to order confirmation page
    Then user will see completed message

      
      #Scenario Outline: eating
  			#Given there are <start> cucumbers
 		 		#When I eat <eat> cucumbers
  			#Then I should have <left> cucumbers
#
		  #Examples:
		    #| start | eat | left |
		    #|    12 |   5 |    7 |
		    #|    20 |   5 |   15 |
