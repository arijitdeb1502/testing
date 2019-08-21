@SanityTest2
Feature: DataPage footer features
	Scenario: Validate footer 
	Given User moves on to the "https://webuildsg.github.io/data/dataset/events-per-group/" page for validating footer
	Then validate all the following link texts are present in the footer
	| linkText |
	| suggestions |
	| report bugs / send pull requests |
	Then validate all the links present in the footer is clickable
	Then validate all the social links are clickable
	Then validate all the social class texts are like the following
	| linkText |
	| Twitter |
	| Facebook |
	| GitHub |
	| Calendar |
	| RSS |
	| iTunes |
	And close the browser after validation is completed for all the footer features
		