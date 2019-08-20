@SanityTest
Feature: DataPage body pictures features
	Scenario: Validate DataPage body pictures 
	Given User moves on to the "https://webuildsg.github.io/data/" page for validating body pictures
	Then validate the following pictures
	| textVal | picCode |
  |repos per week|M8 56h56v8H0V0h8zm10-4c-3.3 0-6-2.7-6-6s2.7-6 6-6h.5L25 29.3c-.6-1-1-2-1-3.3 0-3.3 2.7-6 6-6s6 2.7 6 6c0 1.2-.4 2.3-1 3.3L41.5 40h1L53 21.4c-.6-1-1-2-1-3.4 0-3.3 2.7-6 6-6s6 2.7 6 6-2.7 6-6 6h-.4L47 42.6c.6 1 1 2 1 3.4 0 3.3-2.7 6-6 6s-6-2.7-6-6c0-1.2.4-2.3 1-3.3L30.5 32h-1L23 42.7c.6 1 1 2 1 3.3 0 3.3-2.7 6-6 6z|
  |events per week|M18 24H6c-1 0-2 1-2 2v36c0 1 1 2 2 2h12c1 0 2-1 2-2V26c0-1-1-2-2-2zm0 36H6V44h12v16zm20-44H26c-1 0-2 1-2 2v44c0 1 1 2 2 2h12c1 0 2-1 2-2V18c0-1-1-2-2-2zm0 44H26V40h12v20zM58 8H46c-1 0-2 1-2 2v52c0 1 1 2 2 2h12c1 0 2-1 2-2V10c0-1-1-2-2-2zm0 52H46V36h12v24z|
  |activities per programming languages|M36 46l6 6 20-20-20-20-6 6 14 14z|
  |active user groups|M48 48.2V45c4.4-2.6 8-8.8 8-15 0-10 0-18-12-18s-12 8-12 18c0 6.2 3.6 12.4 8 15v3c-13.6 1.2-24 8-24 16h56c0-8-10.4-14.7-24-15.8z|
  |active repositories|M57.4 14.3c-1.4-2-3.4-4-5.5-6.2s-5-4-7-5c-3-2.4-4-3-5-3H9C6.2 0 4 2.4 4 5v54c0 2.8 2.2 5 5 5h46c2.8 0 5-2.2 5-5V20c0-1-.3-2.5-2.6-5.7zM49 11c2 1.8 3.5 3.6 4.6 5H44V6.4c1.4 1 3.2 2.6 5 4.5zm7 48c0 .5-.5 1-1 1H9c-.5 0-1-.5-1-1V5c0-.5.5-1 1-1h31v14c0 1 1 2 2 2h14v39z|
  |repositories per programming language|M57.4 22.3c-1.4-2-3.4-4-5.5-6.2s-4.5-4-6.4-5.3C42.6 8.3 41 8 40 8H17c-2.8 0-5 2.2-5 5v46c0 2.8 2.2 5 5 5h38c2.8 0 5-2.2 5-5V28c0-1-.3-2.5-2.6-5.7zM49 19c2 1.8 3.5 3.6 4.6 5H44v-9.6c1.4 1 3.2 2.6 5 4.5zm7 40c0 .5-.5 1-1 1H17c-.5 0-1-.5-1-1V13c0-.5.5-1 1-1h23v14c0 1 1 2 2 2h14v31z|
  |event day of week|M20 24h8v8h-8zM32 24h8v8h-8zM44 24h8v8h-8zM8 48h8v8h-8zM20 48h8v8h-8zM32 48h8v8h-8zM20 36h8v8h-8zM32 36h8v8h-8zM44 36h8v8h-8zM8 36h8v8h-8zM52 0v4h-8v-4h-28v4h-8v-4h-8v64h60v-64h-8zM56 60h-52v-44h52v44z|
  |event per week of month|M20 24h8v8h-8zM32 24h8v8h-8zM44 24h8v8h-8zM8 48h8v8h-8zM20 48h8v8h-8zM32 48h8v8h-8zM20 36h8v8h-8zM32 36h8v8h-8zM44 36h8v8h-8zM8 36h8v8h-8zM52 0v4h-8v-4h-28v4h-8v-4h-8v64h60v-64h-8zM56 60h-52v-44h52v44z|
  |event duration|M45.6 32C54.2 26.5 60 16 60 4c0-1.4 0-2.7-.2-4H4.2L4 4c0 12 5.8 22.5 14.4 28C9.8 37.5 4 48 4 60c0 1.4 0 2.7.2 4h55.6l.2-4c0-12-5.8-22.5-14.4-28zM10 60c0-11.7 5-21.6 14-25v-6c-9-3.4-14-13.3-14-25h44c0 11.7-5 21.6-14 25v6c9 3.4 14 13.3 14 25H10zm28.7-18c-4.5-3-4.7-6-4.7-8v-4c0-2 .2-5.3 4.7-8 2.4-1.3 4.5-3.4 6-6H19.3c1.6 2.6 3.7 4.8 6 6.2C30 24.7 30 28 30 30v4c0 2-.2 5.3-4.7 8-4.6 2.5-8 7.7-9 14h31.4c-1-6.3-4.4-11.5-9-14z|
  |event time of day|M41.2 46.8L28 33.8V16h8v14.3l10.8 11zM32 0C14.3 0 0 14.3 0 32s14.3 32 32 32 32-14.3 32-32S49.7 0 32 0zm0 56C18.7 56 8 45.3 8 32S18.7 8 32 8s24 10.7 24 24-10.7 24-24 24z|
  |event locations|M42 12L22 4 0 12v48l22-8 20 8 22-8V4l-22 8zM24 9l16 6.5V55l-16-6.5V9zM4 15L20 9v39.5L4 54.3V14.8zm56 34.4L44 55V15.5l16-5.8v39.5z|
  And close the browser which was opened for validating body pictures