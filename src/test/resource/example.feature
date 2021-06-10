Feature: Google UI Test POC

  @TC001
  Scenario Outline: Demonstrating how Cucumber with Selenium can test search input
    Given the user initializes the Selenium driver for "<Browser>"
    And the user navigates to Google
    Then The user searches Google via page object model"<Tests>"
    Examples:
      | Browser | Tests |
      | Chrome  | 1001  |
      | Firefox    | 1004  |

    @TC002
    Scenario Outline: Demonstrating using the page model to navigate through devices with multiple input.
      Given the user initializes the Selenium driver for "<Browser>"
      And the user navigates to Google
      Then the user navigates to the device "<Device>" and model "<Model>"
      And we close the driver
      Examples:
      | Browser | Device | Model |
      | Chrome  | .category-phones | Pixel 5 |
      | Chrome  | .category-phones | Pixel 4a (5G) |
      | Chrome  | .category-gaming | Stadia Controller |





