@SanityTest
Feature: DataPage data links
	Scenario Outline: Validate the data links of the data page 
	Given User is on the "https://webuildsg.github.io/data/" page to validate the links
	When User clicks on the "<link>" link
	Then validate that the User is navigated to "<url>" page
  Then validate that the title of that page is "We Build SG Data"
  Examples:                      		
	|link          |url         |		
	|repos per week|https://webuildsg.github.io/data/dataset/repos-per-week/|
	|events per week|https://webuildsg.github.io/data/dataset/events-per-week/|
	|activities per programming languages|https://webuildsg.github.io/data/dataset/repos-update-activities-per-programming/|
	|active user groups|https://webuildsg.github.io/data/dataset/events-per-group/|
	|active repositories|https://webuildsg.github.io/data/dataset/repos-most-active/|
	|repositories per programming language|https://webuildsg.github.io/data/dataset/repos-per-programming-language/|
	|event day of week|https://webuildsg.github.io/data/dataset/events-per-day-of-week/|
	|event per week of month|https://webuildsg.github.io/data/dataset/events-per-week-of-month/|
	|event duration|https://webuildsg.github.io/data/dataset/events-per-duration/|
	|event time of day|https://webuildsg.github.io/data/dataset/events-per-time-of-day/|
	|event locations|https://webuildsg.github.io/data/dataset/events-per-location/|