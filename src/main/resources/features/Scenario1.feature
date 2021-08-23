Feature: Android Mobile app test to check the IOlistings

  Scenario Outline: I can create 2 new lists, Add new list items and Delete an item from the list
    Given I login to android app on virtual device
    When I navigate to IOListings app
    Then I create two new lists

    Examples:
    | Fruits | | Vegetables |
