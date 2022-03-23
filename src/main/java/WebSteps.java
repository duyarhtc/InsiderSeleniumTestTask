import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.List;

public class WebSteps implements MainSteps {
    public WebDriver driver;
    public BasePage page;
    public String BaseURL;

    public void initializeDriver(String browser) {
        if (browser.equals("chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            System.setProperty("webdriver.chrome.driver", FileSystems.getDefault().getPath("").toAbsolutePath().toString() + "\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver(options);
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", FileSystems.getDefault().getPath("").toAbsolutePath().toString() + "\\geckodriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
    }

    public void seePage(String pageName) {
        switch (pageName) {
            case "home":
                page = new HomePage();
                break;
            case "career":
                page = new CareerPage();
                break;
            case "QA":
                page = new QApage();
                break;

            case "QAopenPosition":
                page = new QAopenPositionsPage();
                break;

            default:
                break;
        }
    }



    public void openUrl(String url) {
        BaseURL=url;
        this.driver.navigate().to(url);
        System.out.println(url + " address was reached.");
    }
    public void CheckPage(String page){
        switch (page) {

            case "home":{

                if(driver.getCurrentUrl().equals(BaseURL)){
                    System.out.println("This page is Home Page");
                }
                else{
                    System.out.println("This page is not Home Page!");
                }
            }
                break;
            case "career":{
                if(driver.getCurrentUrl().equals(BaseURL+"careers/")){
                    System.out.println("This page is Career Page");
                }
                else{
                    System.out.println("This page is not Career Page!");
                }

            }

                break;



            default:
                System.out.println("hatalı ");
                break;
        }

    }

    public void CheckElementPage(String element, int index){
        WebElement object;
        object=findElement(element,index);
        if(object.isDisplayed()){
            System.out.println("This element is exist");
        }
        else System.out.println("This element is not exist!");
    }

    public void ScroollPageForPositions(String element, int index, int begin, int end)throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy("+begin+","+end+")");
        jse.executeScript("arguments[0].click();", findElement(element,index));
        Thread.sleep(500);


    }
    public void CheckClikableElement(String element, int  index){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
    }

    public void ScrollPage(int value)throws InterruptedException{

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,"+value+")");
        Thread.sleep(500);

    }

    public void SelectInFilterArea(String element, String value) throws InterruptedException{
        WebElement objectDropdown=findElement(element,0);
        List<WebElement> options = objectDropdown.findElements(By.tagName("li"));
        for (WebElement option : options)
        {
            if (option.getText().equals(value))
            {

                    option.click(); // click the desired option
                    System.out.println("Select option:" + value);
                    break;

            }
        }


    }

    public void CheckPositionResult(String element, int index){
        WebElement object=findElement(element,index);

        String result=object.getText();
        if(!result.equals("0 result.")){
            System.out.println("There is open position/s for this filter");
        }
        else{
            System.out.println("There is no open position for this filter.");
        }

    }

    public void CheckPositionsElementForDepartmantAndLoacation(String element, String department, String location, int index) throws InterruptedException{

        List<WebElement> joblist = driver.findElements(By.className("position-list-item-wrapper"));

           for(WebElement job:joblist){
               System.out.println(job.getText());
               if(job.getText().contains(department)&&job.getText().contains(location)){
                   System.out.println("all areas are suitable for filtering");

                   Actions actions = new Actions(driver);
                   actions.moveToElement(job).build().perform();
                   Thread.sleep(2000);

                   WebElement elementApply=job.findElement(By.xpath("//*[contains(text(), 'Apply Now')]"));
                   elementApply.click();
                   Thread.sleep(200);
                   driver.navigate().back();
                   Thread.sleep(200);

               }
               else{
                   System.out.println("fields are not suitable for filter"+job.getText());
               }

           }


    }
    public void mouseHover(String element) throws InterruptedException{
        Actions actions = new Actions(driver);
        WebElement elem = null;
        elem = waitElement(element, 100);
        actions.moveToElement(elem).build().perform();
        Thread.sleep(2000);
    }

    public WebElement findElement(String element, int index) {
        try {
            WebElement object;

            By elem = page.pageElements.get(element);

            if (elem == null) {
                elem = page.commonElements.get(element);
            }
            object = driver.findElements(elem).get(index);
            System.out.println("Object found : " + element);
            return object;
        } catch (Exception e) {
            //Assert.fail("Element is not found!");
            return null;
        }
    }

    public WebElement waitElement(String element, int timeout) throws InterruptedException {
        WebElement object;
        for (int i = 0; i < timeout; i++) {

            object = findElement(element, 0);
            if (object != null) {
                Thread.sleep(2000);
                return object;
            } else {
                Thread.sleep(2000);
            }
        }
        Assert.fail("Waiting element is not found!");
        return null;
    }

    public void clickElement(String element, int index) throws InterruptedException {
        WebElement object = waitElement(element, 30);

        if (object != null) {
            Thread.sleep(500);

            findElement(element, index).click();

            System.out.println("Clicked on object-->" + element);
        } else {
            System.out.println("Could not click on object-->" + element);
        }
    }

    public void enterText(String text, String element) {
        WebElement object;
        object = findElement(element, 0);

        if (object != null) {
            object.sendKeys(text);
            System.out.println("The text has been entered.");
        }
    }

    public void clickKeyboard(String key) {
        Actions action = new Actions(driver);
        switch (key) {
            case "ENTER":
                action.sendKeys(Keys.ENTER).build().perform();
                System.out.println(key + " clicked.");
                break;
            case "TAB":
                action.sendKeys(Keys.TAB).build().perform();
                System.out.println(key + " clicked.");
                break;
            case "PAGE_DOWN":
                action.sendKeys(Keys.PAGE_DOWN).build().perform();
                System.out.println(key + " clicked.");
                break;
            case "PAGE_UP":
                action.sendKeys(Keys.PAGE_UP).build().perform();
                System.out.println(key + " clicked.");
                break;
            default:
                break;
        }
    }



    public void clickKeyboardWithElement(String key, String element) {
        WebElement object = findElement(element, 0);
        if (object != null) {
            switch (key) {
                case "ENTER":
                    object.sendKeys(Keys.ENTER);
                    break;
                case "TAB":
                    object.sendKeys(Keys.TAB);
                    break;
                case "PAGE_DOWN":
                    object.sendKeys(Keys.PAGE_DOWN);
                    break;
                case "PAGE_UP":
                    object.sendKeys(Keys.PAGE_UP);
                    break;
                default:
                    break;
            }
        }
    }


}
