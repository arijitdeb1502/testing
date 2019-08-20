@SanityTest
Feature: DataPage header features
	Scenario: Validate header 
	Given User moves on to the "https://webuildsg.github.io/data/" page for validating header
	Then validate that the "h1" element contains the string "we build!"
  Then validate that the SPLASH class within header contains the string "SG DATA"
  Then click on the link with text "main"
  And validate that it is rendered to "https://webuild.sg/" site
  Then click on the link with text "live"
  And validate that it is rendered to "https://webuildsg.github.io/live/" site
  Then validate the subtitle element text to be "Using data to inspire variety, openness and projects for the design and engineering community" 
	And also validate that "variety" text in subtitle is strongly tagged
	And also validate that "openness" text in subtitle is strongly tagged
	And also validate that "projects" text in subtitle is strongly tagged
	And then close the browser that was opened to validate header
		