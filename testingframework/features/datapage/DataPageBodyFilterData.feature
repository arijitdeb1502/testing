@SanityTest
Feature: DataPage body input search filter data feature
	Scenario Outline: Validate DataPage input search filter data
	Given User moves on to the "https://webuildsg.github.io/data/" page for validating input search filter data
	When the user texts the following search as "<input>" 
	Then validate that data-index filteres by the "<input>" will be displayed
  And close the browser which was opened for validating input search filter data
  Examples:
  |input|
  |repos|
  |active|
  |so|
  |sos|