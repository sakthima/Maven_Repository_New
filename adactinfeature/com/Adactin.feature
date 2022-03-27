Feature: Adactin Application_Hotel Room Booking

Scenario Outline: Login Functionality
Given user Launch The Adactin Application
When user Enters The "<username>" Username In The InputBox
And user Enters The "<password>" Password In The InputBox
Then user Clicks The Login Button And It Navigates To The SearchHotelPage

Examples:
|username|password|
|raja|9999999|
|mani|111111|
|sakthima|sakthi@123|


Scenario: Search Hotel Functionality
When user Select The Location In The Dropdown
And user Select The Hotels In The Dropdown
And user Select The RoomType In The Dropdown
And user Select The NumberOfRooms In The Dropdown
And user Select The AdultsPerRoom In The Dropdown
And user Select The ChildrenPerRoom In The Dropdown
Then user Clicks The Search Button And It Navigates To The SelectHotelPage

Scenario: Select Hotel Functionality
When user Clicks The Select Hotel Radio Button
Then user Clicks The Continue Button And It Navigates To The BookHotelPage

@sanitytest
Scenario: Book Hotel Functionality
When user Enters The FirstName In The InputBox
And user Enters The LastName In The InputBox
And user Enters The Billing Address In The InputBox
And user Enters The CreditCardNo In The InputBox
And user Select The CreditCardType In The Dropdown
And user Select The ExpMonth In The Dropdown
And user Select The ExpYear In The Dropdown
And user Enters The CvvNumber In The InputBox
Then user Clicks The BookNow Button And It Navigates To The BookingConfirmationPage

@smoketest
Scenario: Booking Confirmation Functionality
Then user Clicks The MyItinerary Button And It Navigates To The LogoutPage

@smoketest1
Scenario: Logout Functionality
When user Clicks The FirstOrderId In The CheckBox
Then user Clicks The Logout Button And It Navigates To The ClickHereToLoginAgain Page

#Scenario: Merge Page
#When user Choose The Bus
