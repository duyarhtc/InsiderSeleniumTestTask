import org.openqa.selenium.*;
import java.io.IOException;

public interface MainSteps {

    public void initializeDriver(String browser);

    public void seePage(String page);

    public void CheckPage(String page);

    public void openUrl(String url);

    public WebElement findElement(String element,int index);

    public WebElement waitElement(String element, int timeout) throws InterruptedException, IOException;

    public void clickElement(String element,int index) throws InterruptedException;

    public void enterText(String text, String element);

    public void clickKeyboard(String key);

    public void clickKeyboardWithElement(String key, String element);

    public void switchTab();
}
