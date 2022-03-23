import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.BasePage;

public class MySteps extends BasePage {
    WebSteps websteps;
    String productName = "";

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) websteps.driver).getScreenshotAs(OutputType.BYTES);
            // embed it in the report.
            scenario.embed(screenshot, "image/png");
            String link = "C:\\Users\\keski\\IdeaProjects\\SeleniumProjectTask2\\target\\cucumber-html-report\\index.html";
            System.out.println("Error saved to log");
            System.out.println("<a href=\"" + link + "\">" + link + "</a>");
        }
        websteps.driver.quit();
    }

    @Before
    public void beforeScenario() {

        System.out.println("*************Insider Selenium Test***********");
    }

    @When("^I see (.*) page$")
    public void seePage(String page) {

        websteps.seePage(page);
    }

    @When("^I initialize (chrome|firefox) driver$")
    public void initializeChromeDriver(String browser) {
        websteps = new WebSteps();
        websteps.initializeDriver(browser);
    }

    @When("^I go to \"([^\"]*)\" url$")
    public void gotoURL(String url) {
        websteps.openUrl(url);
    }


    @When("^I wait (.*) element (\\d+) seconds$")
    public void waitElement(String element, int timeout) throws InterruptedException {
        websteps.waitElement(element, timeout);
    }

    @When("^(?:I )?click element: (\\w+(?: \\w+)*) index: (\\d+)$")
    public void clickElement(String element, int index) throws InterruptedException {
        websteps.clickElement(element,index-1);

    }

    @When("^I enter \"([^\"]*)\" text to (.*) text area$")
    public void enterText(String text, String element) throws InterruptedException {
        mouseHover(element);

        WebElement object;
        object = websteps.findElement(element, 0);
        if (object != null) {
            object.sendKeys(text);
            System.out.println("The text has been entered.");
        }
    }

    @When("^I click \"([^\"]*)\" keyboard button$")
    public void clickKeyboard(String key) {
        websteps.clickKeyboard(key);
    }

    @When("^I do click \"([^\"]*)\" keyboard button with \"([^\"]*)\" element$")
    public void clickKeyboardWithElement(String key, String element) {
        websteps.clickKeyboardWithElement(key, element);
    }

    @When("^(?:I )?wait for (\\d+) seconds?$")
    public void waitForNSeconds(int seconds) {
        try {
            Thread.sleep((long) seconds * 1000L);
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @When("^I send text \"([^\"]*)\" to  \"([^\"]*)\" element$")
    public void sendText(String value, String element) {
        websteps.enterText(value, element);
    }

    @When("^(?:I )?focus (.*) element$")
    public void mouseHover(String element) throws InterruptedException {
        websteps.mouseHover(element);

    }


    @When("^I check page  (.*)$")
    public void CheckPage(String page) {
        websteps.CheckPage(page);
    }

    @When("^I check (\\w+(?: \\w+)*) in page index: (\\d+)$")
    public void CheckElementPage(String element, int index) {
        websteps.CheckElementPage(element,index-1);
    }

    @When("I scroollPage for  element: (\\w+(?: \\w+)*) , index: (\\d+) and positions: (\\d+) - (\\d+)$")
    public void ScroollPageForPositions(String element, int index, int begin, int end)throws InterruptedException {
        websteps.ScroollPageForPositions(element,index-1,begin,end);
    }

    @When("^I check clikable element : (\\w+(?: \\w+)*) index: (\\d+)$")
    public void CheckClikableElement(String element, int  index) {
        websteps.CheckClikableElement(element,index-1);
    }


    @When("^I scrollPage for (\\d+)$")
    public void ScrollPage(int value)throws InterruptedException {
        websteps.ScrollPage(value);
    }

    @Then("^I select in filter area :(\\w+(?: \\w+)*) and set  value: (.*)$")
    public void SelectInFilterArea(String element, String value) throws InterruptedException{
        websteps.SelectInFilterArea(element,value);
    }

    @Then("^I check position result element : (\\w+(?: \\w+)*) and index: (.*)$")
    public void CheckPositionResult(String element, int index) {
        websteps.CheckPositionResult(element,index-1);
    }

    @When("^I check positions element: (\\w+(?: \\w+)*) for departmant (.*) and loacation (.*) index : (.*)$")
    public void CheckPositionsElementForDepartmantAndLoacation(String element, String department, String location, int index)throws InterruptedException {
    websteps.CheckPositionsElementForDepartmantAndLoacation(element,department,location,index-1);
    }
}