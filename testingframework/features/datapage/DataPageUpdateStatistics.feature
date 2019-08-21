@SanityTest
Feature: DataPage statistical count data and styles
	Scenario Outline: Validate all the statistical counts along with styles of the data page 
	Given User is on the "https://webuildsg.github.io/data/" page
	Then validate the "<action>" count for "<year>" is "<counts>"
	Then validate the style of box element is "background: rgb(248, 244, 218);"
	Then validate the text inside statistics details of "<action>" for "<year>" is like "<textvalue>"
	And close the browser
	Examples:
	|action|year|counts|textvalue|
	|repos|2017|330|open source repos updated in|
	|repos|2016|242|open source repos updated in|
	|repos|2015|129|open source repos updated in|
	|updates|2017|3893|updates made to repos in|
	|updates|2016|3517|updates made to repos in|
	|updates|2015|975|updates made to repos in|
	|events|2017|860|open events held in|
	|events|2016|921|open events held in|
	|events|2015|803|open events held in|
	|groups|2017|226|user groups held events in|
	|groups|2016|193|user groups held events in|
	|groups|2015|181|user groups held events in|