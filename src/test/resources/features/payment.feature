#make a payment to three different client
# client countries CN, USA, JPN
# client amounts 10, 20, 30
# for each payment user's balance should be checked.

# scenario
# make payment for each country in countries list
#logout test
Feature: make a payment
  @homework5
  Scenario Outline: make a payment to three different client
    When user login in Eribank App
    And user make a payment "<phone>" "<name>" "<client>" "<amount>"
    Then user check balance
    And user logout Eribank
    Examples:
    | phone | name | client | amount |
    | 11111 | user1 | China | 10 |
    | 22222 | user2 | USA | 10 |
    | 33333 | user3 | Japan | 10 |

  @homework6
  Scenario Outline: make a payment to each country
    When user login in Eribank App
    And user make a payment "<phone>" "<name>" "<client>" "<amount>"
    Then user check balance
    And user logout Eribank
    Examples:
      | phone | name | client | amount |
      | 11111 | user1 | China | 10 |
      | 22222 | user2 | USA | 15 |
      | 33333 | user3 | Japan | 30 |
      | 44444 | user4 | India | 40 |
      | 55555 | user5 | Greece | 55 |
      | 66666 | user6 | Greenland | 66 |
      | 77777 | user7 | Norway | 77 |
      | 88888 | user8 | Italy | 88 |
      | 99999 | user9 | Ireland | 100 |

