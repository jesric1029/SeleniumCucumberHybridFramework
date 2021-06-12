Feature: Google UI Test POC

  @TC001
  Scenario Outline: Demonstrating how Cucumber with Selenium can test search input
    When the user navigates to Google
    Then The user searches Google via page object model"<Tests>"
    Examples:
      | Tests |
      | 1001  |
      | 1004  |

    @TC002
    Scenario Outline: Demonstrating using the page model to navigate through devices with multiple input.
      When the user navigates to Google
      Then the user navigates to the device "<Device>" and model "<Model>"
      Examples:
      | Device | Model |
      | .category-phones | Pixel 5 |
      | .category-phones | Pixel 4a (5G) |
      | .category-gaming | Stadia Controller |
      | .category-gaming | Intentionally failed test to validate driver cleanup |





