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
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d99.0.4844.82)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-DQ676ILB\u0027, ip: \u0027192.168.1.8\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_312\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 99.0.4844.82, chrome: {chromedriverVersion: 99.0.4844.51 (d537ec02474b5..., userDataDir: C:\\Users\\keski\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:57688}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 7b3b413d06165ff295083d7696296dce\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteNavigation.to(RemoteWebDriver.java:857)\r\n\tat WebSteps.openUrl(WebSteps.java:58)\r\n\tat MySteps.gotoURL(MySteps.java:49)\r\n\tat ✽.I go to \"https://useinsider.com/\" url(file:src/test/resources/features/insiderSite.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I see home page",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.seePage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I wait for 5 seconds",
  "keyword": "And "
});
formatter.match({
  "location": "MySteps.waitForNSeconds(int)"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.step({
  "name": "I click element: homepage allow cookies index: 1",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.clickElement(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click element: homepage more index: 1",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.clickElement(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I wait for 5 seconds",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.waitForNSeconds(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click element: homepage career index: 1",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.clickElement(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I see career page",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.seePage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I wait for 2 seconds",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.waitForNSeconds(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I check page  career",
  "keyword": "And "
});
formatter.match({
  "location": "MySteps.CheckPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I check careerPage seeAllTeamsButton in page index: 1",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.CheckElementPage(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I check careerPage locationArea in page index: 1",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.CheckElementPage(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I check careerPage lifeAtInsiderArea in page index: 1",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.CheckElementPage(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I wait for 3 seconds",
  "keyword": "And "
});
formatter.match({
  "location": "MySteps.waitForNSeconds(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I scroollPage for  element: careerPage seeAllTeamsButton , index: 1 and positions: 0 - 2500",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.ScroollPageForPositions(String,int,int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I scroollPage for  element: careerPage qualityAssuranceArea , index: 1 and positions: 0 - 200",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.ScroollPageForPositions(String,int,int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I see QA page",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.seePage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I wait for 3 seconds",
  "keyword": "And "
});
formatter.match({
  "location": "MySteps.waitForNSeconds(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click element: QAPage seeAllQAJobsButton index: 1",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.clickElement(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I see QAopenPosition page",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.seePage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I wait for 3 seconds",
  "keyword": "And "
});
formatter.match({
  "location": "MySteps.waitForNSeconds(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I scrollPage for 200",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.ScrollPage(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click element: QAopenPOsitionPage LocationDropDown index: 1",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.clickElement(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I wait for 3 seconds",
  "keyword": "And "
});
formatter.match({
  "location": "MySteps.waitForNSeconds(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I select in filter area :QAopenPOsitionPage LocationResults and set  value: Istanbul, Turkey",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.SelectInFilterArea(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I wait for 3 seconds",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.waitForNSeconds(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click element: QAopenPOsitionPage DepartmentDropDown index: 1",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.clickElement(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I wait for 1 seconds",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.waitForNSeconds(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I select in filter area :QAopenPOsitionPage DepartmentResults and set  value: Quality Assurance",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.SelectInFilterArea(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I wait for 1 seconds",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.waitForNSeconds(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I check position result element : QAopenPOsitionPage FilterResultArea and index: 1",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.CheckPositionResult(String,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I wait for 5 seconds",
  "keyword": "And "
});
formatter.match({
  "location": "MySteps.waitForNSeconds(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I scrollPage for 250",
  "keyword": "When "
});
formatter.match({
  "location": "MySteps.ScrollPage(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I check positions element: QAopenPOsitionPage PositionList for departmant QA Assurance and loacation İstanbul, Turkey index : 1",
  "keyword": "Then "
});
formatter.match({
  "location": "MySteps.CheckPositionsElementForDepartmantAndLoacation(String,String,String,int)"
});
formatter.result({
  "status": "skipped"
});
