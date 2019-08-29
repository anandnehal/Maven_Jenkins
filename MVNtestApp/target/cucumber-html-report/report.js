$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("facebook.feature");
formatter.feature({
  "line": 1,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6397126739,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "verify facebook login page",
  "description": "",
  "id": "title-of-your-feature;verify-facebook-login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "launch facebook",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Verify title of webpage",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I enter credentials",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.launch_facebook()"
});
formatter.result({
  "duration": 11214497799,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.verify_title_of_webpage()"
});
formatter.result({
  "duration": 3085464778,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.i_enter_credentials()"
});
formatter.result({
  "duration": 8346941062,
  "status": "passed"
});
formatter.after({
  "duration": 1187723743,
  "status": "passed"
});
});