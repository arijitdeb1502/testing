@SanityTest
Feature: DataPage title
	Scenario: Validate the title of the data page 
	Given User is present on the "https://webuildsg.github.io/data/" page
	Then validate the title of current page is "We Build SG Data"