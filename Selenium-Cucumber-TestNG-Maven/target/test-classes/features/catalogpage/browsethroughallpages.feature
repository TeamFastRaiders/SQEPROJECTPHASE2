Feature: Feature to test all pages in a catalog can be browsed

  Scenario Outline: The user is able to successfully browse through all pages available in a catalog
    Given that user is in a catalog
    When the user clicks on the <icon>
    And the user is on page <current page>
    Then the page <page number> of the catalog shall be displayed

    Examples: 
      | icon                  | current page | page number |
      | Single Arrow Forward  |            2 |           3 |
      | Double Arrow Forward  |            2 |          15 |
      | Single Arrow Backward |            3 |           2 |
      | Double Arrow Backward |            3 |           1 |
