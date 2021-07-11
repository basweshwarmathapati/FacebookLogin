@Flow
Feature: Login to Facebook


  Scenario: Login to Facebook
    Given I navigate to Facebook
    When I put username as "basweshmathapati@gmail.com"
    And I put password as "#$FGhjerl0"
    And I click on Login button.
    Then I should be on Home Page with Title "Hello"