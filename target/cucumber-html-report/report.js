$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/insiderSite.feature");
formatter.feature({
  "name": "E-commerce",
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
  "name": "I initialize chrome driver",
  "keyword": "Given "
});
formatter.match({
  "location": "MySteps.initializeChromeDriver(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to \"https://useinsider.com/\" url",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.gotoURL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see home page",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.seePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for 5 seconds",
  "keyword": "And "
});
formatter.match({
  "location": "MySteps.waitForNSeconds(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Start Full Test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@HTC"
    }
  ]
});
formatter.step({
  "name": "I check page  home",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.CheckPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click element: homepage allow cookies index: 1",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.clickElement(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click element: homepage more index: 1",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.clickElement(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for 5 seconds",
  "keyword": "And "
});
formatter.match({
  "location": "MySteps.waitForNSeconds(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click element: homepage career index: 1",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.clickElement(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see career page",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.seePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I wait for 2 seconds",
  "keyword": "And "
});
formatter.match({
  "location": "MySteps.waitForNSeconds(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check page  career",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.CheckPage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});