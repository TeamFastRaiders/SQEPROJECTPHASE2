Feature: Feature to test that items can be sorted according to a applied filter

  Scenario Outline: The user is able to sort the items in a specific catalog according to a filter
      Background: The user has a catalog opened

    Given that the user clicks on the drop-down box
    When the user selects <filter>
    Then the items in the catalog shall be sorted according to the <filter>

    Examples: 
      | filter         |
      | Best Match     |
      | Price Low-High |
      | Price High-Low |
      | New Arrivals   |
      | Most Popular   |
      | Top Rated      |
