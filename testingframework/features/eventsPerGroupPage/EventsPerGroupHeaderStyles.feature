@SanityTest2
Feature: Events Per Group header styles features
	Scenario: Validate header styles 
	Given User moves on to the "https://webuildsg.github.io/data/dataset/events-per-group/" page for validating header styles
	Then validate the following styleAttributes of header to be as below
	| styleProperty   | value |
  | background-color | c11a18 |
	| padding-top | 0px |
	| padding-right | 0px |
	| padding-bottom | 15px |
	| padding-left | 0px |
	| cursor | pointer |
	Then validate the following styleAttributes of h attribute of header to be as below
	| styleProperty   | value |
  | margin-top | 0px |
  | margin-bottom | 0px |
  | margin-right | 0px |
  | margin-left | 0px |
	| position | static |
	| overflow | visible |
	Then validate the following styleAttributes of div class SPLASH of SG DATA
	| styleProperty   | value |
  | background-color | fff |
  | font-size | 15.51px |
  | position | absolute |
  | right | 80px |
	| padding-top | 8px |
	| padding-bottom | 8px |
	| padding-right | 8px |
	| padding-left | 8px |
	|	transform | matrix(0.984808, -0.173648, 0.173648, 0.984808, 0, 0) |
  | border-top-color | rgba(34, 141, 183, 1) |
  | border-top-style | solid |
  | border-top-width | 5px |
  | border-right-color | rgba(34, 141, 183, 1) |
  | border-right-style | solid |
  | border-right-width | 5px |
  | border-bottom-color | rgba(34, 141, 183, 1) |
  | border-bottom-style | solid |
  | border-bottom-width | 5px |
  | border-left-color | rgba(34, 141, 183, 1) |
  | border-left-style | solid |
  | border-left-width | 5px |
  | border-image-source | none |
  | border-image-slice | 100% |
  | border-image-width | 1 |
  | border-image-outset | 0px |
  | border-image-repeat | stretch |
  | color | c11a18 |
  | -webkit-border-radius | 5.17px |
  | border-radius | 5.17px |
  Then validate the following styleAttributes of p class Subtitle
  | styleProperty   | value |
  | color | 666 |
  | text-align | center |
  | font-size | 20.8px |
  And after style validation for header is completed close the browser
  