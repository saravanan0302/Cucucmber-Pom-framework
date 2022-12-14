Feature: Validation of booking page in adactinhotel web application

  Scenario Outline: TC01_Validation of booking page with valid inputs
    Given User launch adactinhotel web page
    When User enters valid "<username>" and valid "<password>"
    And User clicks the login button and search hotel page should be opened
    When User select the "<location>","<hotel>","<roomtype>","<NoofRooms>","<adultscount>" and "<childcount>"
    And User clicks the search button and select hotel page should be opened
    When User select the radio button
    And User clicks the continue button
    When User enters "<firstname>","<lastname>", "<billingaddress>", "<creditcardnumber>","<cardtype>","<expiryMonth>","<expiryYr>" and "<cvvnumber>"
    And User clicks Book now button and order number should be displayed

    Examples: 
      | username      | password | location | hotel        | roomtype     | NoofRooms |  adultscount | childcount | firstname | lastname | billingaddress | creditcardnumber | cardtype | expiryMonth | expiryYr | cvvnumber |
      | saravanakrish | 2KX7V8   | Paris    | Hotel Hervey | Super Deluxe | 1 - One   |  1 - One     | 1 - One    | saravanan | krish    | Erode          | 1234567891234567 | VISA     | November    |     2022 |      2234 |
