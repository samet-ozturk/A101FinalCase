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
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@scenario2"
    }
  ]
});
formatter.step({
  "name": "Search for products",
  "keyword": "When "
});
formatter.match({
  "location": "casestudy.step_def.MyStepdefs.searchForProducts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product is Select",
  "keyword": "And "
});
formatter.match({
  "location": "casestudy.step_def.MyStepdefs.productIsSelect()"
});
