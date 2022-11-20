Feature: Feature to test all pages in a catalog can be browsed

  Scenario Outline: The user is able to successfully browse through all pages available in a catalog
    Background: The user is in a catalog
    Given that user is on page <current page>
    When the user clicks on the <icon>
    Then the page <page number> of the catalog shall be displayed

    Examples: 
      | icon                  | current page | page number |
      | Single Arrow Forward  |            2 |           3 |
      | Double Arrow Forward  |            2 |           7 |
      | Single Arrow Backward |            3 |           2 |
      | Double Arrow Backward |            3 |           1 |
