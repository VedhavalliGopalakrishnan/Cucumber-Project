Feature: Hotel Booking Functionality

Background: User want to login the application
Given User want to launch the adactin application
When User enter "vvvv0ssss" the valid username
And User enter "ssssvvvv" the valid password
Then User verify the valid username and password

Scenario Outline:User want to login the application 
Given User want to launch the adactin application
When User enter "<Username>" the valid username
And User enter "<Password>" the valid password
Then User verify the valid username and password

Examples:

|Username|Password|
|aaa|111|
|bbb|222|
|ccc|333|

@Login
Scenario: User want to login the application
Given User want to launch the adactin application
When User enter "vvvv0ssss" the valid username
And User enter "ssssvvvv" the valid password
Then User verify the valid username and password

Scenario: User want to search Hotel
Given User want to select the location
Then User want to select the Hotel
And User selects the Room type
Then User select the number of Room
When User select the checkin date
And User enter the checkout date
Then User select the adult per room
Then Finally User select the search button

Scenario: User want to select Hotel
Given User selects the Hotel
Then User clicks continue

Scenario: User want to Book A Hotel
Given User enters the FirstName
Then User enters the LastName
And User enters the Billing Address
When User enter the CreditCard Number
Then User selects the CreditCard Type
Then User gives the ExpiryDate
And User enters the CVV
Then User clicks Book Now

Scenario: Booking Confirmed for User
Given User logouts from the Application