$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/study.feature");
formatter.feature({
  "name": "Case Study Tests",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "homepage is open",
  "keyword": "Given "
});
formatter.match({
  "location": "casestudy.step_def.MyStepdefs.homepageIsOpen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the pop up",
  "keyword": "And "
});
formatter.match({
  "location": "casestudy.step_def.MyStepdefs.iCloseThePopUp()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify page title",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Page title verification",
  "keyword": "When "
});
formatter.match({
  "location": "casestudy.step_def.MyStepdefs.pageTitleVerification()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Maximize windows",
  "keyword": "Then "
});
formatter.match({
  "location": "casestudy.step_def.MyStepdefs.maximizeWindows()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for Drone",
  "keyword": "And "
});
formatter.match({
  "location": "casestudy.step_def.MyStepdefs.searchForDrone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify search results are listed for Drone",
  "keyword": "And "
});
formatter.match({
  "location": "casestudy.step_def.MyStepdefs.verifySearchResultsAreListedForDrone()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});