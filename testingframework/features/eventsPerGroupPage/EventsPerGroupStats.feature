@SanityTest
Feature: Events Per Group statistics
  Scenario: Validate the number of event per group statistics as displayed
    Given User is on the "https://webuildsg.github.io/data/dataset/events-per-group/" page to validate number of event per group statistics as displayed
    Then validate that all the following groups contains the mentioned memeber counts actually
		|grpName|memberCnt|
		|.NET Developers Singapore|5|
		|IoTSG|9|
		|Agile Singapore|6|
		|AnalyticsTech|6|
		|Clojure Meetup|5|
		|CodingGirls|10|
		|DataKind|9|
		|DataScience|8|
		|Elm Singapore|5|
		|Ethereum Singapore|17|
		|FOSSASIA OpenXLab Meetup|10|
		|Google Cloud Platform User Group Singapore|6|
		|Hacks/Hackers Singapore|6|
		|Hackware|10|
		|iOS Dev Scout Meetup|5|
		|IxDA Singapore|6|
		|Java User Group|7|
		|Kubernetes User Group|5|
		|Microsoft User Groups|29|
		|Next Gen Native Hadoop Big Data Apex Users Group, Singapore|37|
		|Null - The Open Security Community|10|
		|OneMap IdeaWorks!|5|
		|OpenBio Singapore|8|
		|PyData Singapore|11|
		|Ruby Group|8|
		|Scala Programmers|6|
		|Singaporeans Learning To Code|10|
		|SingaporeCSS|6|
		|SingaporeJS|17|
		|TensorFlow and Deep Learning Singapore|8|
		|ThoughtWorks Talks Tech|8|
		|Women Who Code Singapore|36|
		Then click on all the links of active user groups to validate the windows with following page titles are opened in a separate tab
		|pageTitle|
		|Extend your community \| Meetup|
		|Women Who Code Singapore (Singapore, Singapore) \| Meetup|
		|ThoughtWorks Talks Tech (Singapore, Singapore) \| Meetup|
		|TensorFlow and Deep Learning Singapore (Singapore, Singapore) \| Meetup|
		|SingaporeJS (Singapore, Singapore) \| Meetup|
		|SingaporeCSS (Singapore, Singapore) \| Meetup|
		|Let's Learn Coding (Singapore, Singapore) \| Meetup|
		|Singapore Scala Programmers (Singapore, Singapore) \| Meetup|
		|Singapore Ruby Group (Singapore, Singapore) \| Meetup|
		|PyData Singapore (Singapore, Singapore) \| Meetup|
		|Find your people \| Meetup|
		|Find your people \| Meetup|
		|Null Singapore - The Open Security Community (Singapore, Singapore) \| Meetup|
		|Find your people \| Meetup|
		|Azure, Office and Data Community (Singapore) (Singapore, Singapore) \| Meetup|
		|Singapore Kubernetes User Group (Singapore, Singapore) \| Meetup|
		|Singapore Java User Group (Singapore, Singapore) \| Meetup|
		|IxDA Singapore (Singapore, Singapore) \| Meetup|
		|Singapore iOS Dev Scout Meetup (Singapore, Singapore) \| Meetup|
		|Hackware (Singapore, Singapore) \| Meetup|
		|Hacks/Hackers Singapore (Data & Innovative Journalism) (Singapore, Singapore) \| Meetup|
		|Google Cloud Platform User Group Singapore (Singapore, Singapore) \| Meetup|
		|FOSSASIA Singapore Open Tech Meetup (Singapore, Singapore) \| Meetup|
		|Ethereum Singapore (Singapore, Singapore) \| Meetup|
		|Elm Singapore (Singapore, Singapore) \| Meetup|
		|DataScience SG (Singapore, Singapore) \| Meetup|
		|DataKind SG (Singapore, Singapore) \| Meetup|
		|Find your people \| Meetup|
		|Singapore Clojure Meetup (Singapore, Singapore) \| Meetup|
		|AnalyticsTech (Singapore, Singapore) \| Meetup|
		|Agile Singapore (Singapore, Singapore) \| Meetup|
		|IoTSG- An Adaptive Ecosystem (IoT, AI, Emerging Tech) (Singapore, Singapore) \| Meetup|
		|.NET Developers Community Singapore (Singapore, Singapore) \| Meetup|
		Then mouse over to each of the active user group link
		|updatedTimeStamp|
		|last updated on 19 Sep 2017, Tue, 6:45 pm|
		|last updated on 14 Sep 2017, Thu, 6:30 pm|
		|last updated on 14 Sep 2017, Thu, 6:30 pm|
		|last updated on 25 Oct 2017, Wed, 7:00 pm|
		|last updated on 01 Jan 2018, Mon, 10:00 am|
		|last updated on 24 Aug 2017, Thu, 6:30 pm|
		|last updated on 08 Aug 2017, Tue, 5:30 pm|
		|last updated on 12 Dec 2017, Tue, 7:00 pm|
		|last updated on 06 Sep 2017, Wed, 7:00 pm|
		|last updated on 12 Sep 2017, Tue, 6:30 pm|
		|last updated on 24 Aug 2017, Thu, 7:00 pm|
		|last updated on 25 Oct 2017, Wed, 6:30 pm|
		|last updated on 19 Aug 2017, Sat, 10:00 am|
		|last updated on 19 Mar 2017, Sun, 3:00 pm|
		|last updated on 17 Jan 2018, Wed, 7:00 pm|
		|last updated on 21 Sep 2017, Thu, 9:00 am|
		|last updated on 28 Aug 2017, Mon, 7:30 pm|
		|last updated on 02 Jan 2018, Tue, 7:30 pm|
		|last updated on 30 Aug 2017, Wed, 6:30 pm|
		|last updated on 28 Sep 2017, Thu, 7:00 pm|
		|last updated on 20 Sep 2017, Wed, 7:00 pm|
		|last updated on 28 Jan 2018, Sun, 10:57 am|
		|last updated on 30 Aug 2017, Wed, 7:00 pm|
		|last updated on 23 Jul 2017, Sun, 10:00 am|
		|last updated on 26 Oct 2017, Thu, 8:00 am|
		|last updated on 26 Oct 2017, Thu, 9:00 am|
		|last updated on 27 Oct 2017, Fri, 6:30 pm|
		|last updated on 30 Sep 2017, Sat, 10:30 am|
		|last updated on 19 Jan 2018, Fri, 6:30 pm|
		|last updated on 24 Aug 2017, Thu, 7:30 pm|
		|last updated on 12 Oct 2017, Thu, 9:00 am|
		|last updated on 01 Sep 2017, Fri, 7:00 pm|
		|last updated on 02 Oct 2017, Mon, 7:30 pm|
		|last updated on 28 Sep 2017, Thu, 8:30 am|
		|last updated on 25 Oct 2017, Wed, 7:00 pm|
		|last updated on 26 Sep 2017, Tue, 6:30 pm|
		|last updated on 25 Aug 2017, Fri, 6:30 pm|
		|last updated on 24 Oct 2017, Tue, 7:00 pm|
		|last updated on 30 Aug 2017, Wed, 7:00 pm|
		|last updated on 25 Oct 2017, Wed, 7:00 pm|
		|last updated on 15 Aug 2017, Tue, 9:30 am|
		|last updated on 20 Jul 2017, Thu, 7:00 pm|
		|last updated on 27 Jun 2017, Tue, 7:00 pm|
		|last updated on 21 Sep 2017, Thu, 6:45 pm|
		|last updated on 25 Oct 2017, Wed, 9:00 am|
		|last updated on 19 Jan 2018, Fri, 6:30 pm|
		Then close the browser openned to validate number of event per group statistics 
