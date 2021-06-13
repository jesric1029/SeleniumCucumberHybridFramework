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

      @TC003
      Scenario Outline: Validating that the rest request to the public US population data API year matches the expect population
        When the user makes a GET request to URL "<Url>"
        Then we validate the status code is "<Status Code>"
        And the user validates the response with a year of "<Year>" has a population of "<Expected Population>"
        Examples:
        | Url | Status Code | Year | Expected Population |
        | https://datausa.io/api/data?drilldowns=Nation&measures=Population | 200 | 2018 | 327167439 |
        | https://datausa.io/api/data?drilldowns=Nation&measures=Population | 200 | 2017 | 325719178 |
        | https://datausa.io/api/data?drilldowns=Nation&measures=Population | 200 | 2016 | 999999999 |








