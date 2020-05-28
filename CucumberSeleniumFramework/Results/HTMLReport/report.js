$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Features/W3School.feature");
formatter.feature({
  "line": 1,
  "name": "Verify W3School Website",
  "description": "",
  "id": "verify-w3school-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6423075100,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "To test Learn Java",
  "description": "",
  "id": "verify-w3school-website;to-test-learn-java",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "W_Navigate to \"https://www.w3schools.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Click on \"Learn Java\" link",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "Click on \"Home\" link",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.w3schools.com/",
      "offset": 15
    }
  ],
  "location": "W3SchoolStepDef.w_Navigate_to(String)"
});
formatter.result({
  "duration": 5852445799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Learn Java",
      "offset": 10
    }
  ],
  "location": "W3SchoolStepDef.click_on_link(String)"
});
formatter.result({
  "duration": 863329299,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 10
    }
  ],
  "location": "W3SchoolStepDef.click_on_link(String)"
});
formatter.result({
  "duration": 1042469300,
  "status": "passed"
});
formatter.after({
  "duration": 702811400,
  "status": "passed"
});
});