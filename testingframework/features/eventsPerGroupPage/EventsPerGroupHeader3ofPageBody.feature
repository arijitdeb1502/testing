@SanityTestCurr
Feature: Events Per Group Page Body header3 Featues
  Scenario: Validate the header3 feature of body
    Given User is on the "https://webuildsg.github.io/data/dataset/events-per-group/" page to validate Page Body header Featues 
    Then validate that the text of the h3 element is "active user groups with > 5 events"
    And validate that the h element text color in hex is "228db7"
    And validate that the h element font size is "40px"
    And validate that the h elelemnt font weight is "700"
    And validate that the h elelemnt font family is "\"Roboto Slab\",serif"
    Then close the browser after validating the header feature of body

  