@tag
Feature: Webdriver university LoginPage
    @login
    Scenario: Login using valid credentials

        Given I access Webdriver university LoginPage
        When I enter a userName "Webdriver"
        And I enter a password "webdriver123"
        And I click on the Login button
        Then I should be presented with the following message "validation succeeded"

