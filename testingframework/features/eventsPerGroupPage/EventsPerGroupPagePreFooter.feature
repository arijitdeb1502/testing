@SanityTest
Feature: Events Per Group pre footer feature
  Scenario: Validate the number of event per group statistics as displayed
    Given User is on the "https://webuildsg.github.io/data/dataset/events-per-group/" page to validate pre footer container features
    Then validate that text inside infoClass contains "All graphs are generated based on"
    And validate that link text inside infoClass contains the following
    |linkText|
    |open events data|
    |open source data|
    And there is a " and " inside the line break of  infoClass
    And validate that the links inside infoClass Elements are clickable
    And validate that para in the explain div class contains the following
    |linkText|
    |an open event is:|
    |an open source repository has:|
    And validate that unordered list in the prefooter contains the following texts
    |linkText|
    |curated from an api (Facebook, Meetup, Eventbrite):manually included or queried from an ICS url:open to public and free for all:held at a valid location:engineering or design related|
		|an open license:a remote repository on Github:"Singapore" in the owner's location:at least 50 star gazers:been updated in the last 3 months|
		And validate that following text in pre footer are linktext
		|linkText|
		|Facebook|
		|Meetup|
		|Eventbrite|
		|open license|
		|Github|
		|owner's location|
		|star gazers|
		|updated|
		Then close the browser openned to validate pre footer features for Events Per Group Page  
