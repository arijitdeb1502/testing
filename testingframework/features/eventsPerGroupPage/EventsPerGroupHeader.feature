@SanityTest
Feature: Event Vs Grp Page header features
	Scenario: Validate header 
	Given User moves on to the "https://webuildsg.github.io/data/dataset/events-per-group/" page for validating header
	Then validate that the "h1" element contains the string "we build!"
  Then validate that the SPLASH class within header contains the string "SG DATA"
  #Then click on the link with text "main"
  #And validate that it is rendered to "https://webuild.sg/" site
  #Then click on the link with text "live"
  #And validate that it is rendered to "https://webuildsg.github.io/live/" site
  Then all the links of header will contain the the following link texts
  |linkText|url|
  |main|https://webuild.sg/|
	|apps|https://webuild.sg/apps|
	|live|https://live.webuild.sg/|
	|data|https://data.webuild.sg/|
	|notes|https://notes.webuild.sg/|
	|api|https://api.webuild.sg/|
  Then validate the subtitle element text to be "Using data to inspire variety, openness and projects for the design and engineering community" 
	And also validate that "variety" text in subtitle is strongly tagged
	And also validate that "openness" text in subtitle is strongly tagged
	And also validate that "projects" text in subtitle is strongly tagged
	And then close the browser that was opened to validate header
		