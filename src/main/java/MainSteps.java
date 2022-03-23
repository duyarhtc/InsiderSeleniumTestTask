import org.openqa.selenium.*;
import java.io.IOException;

public interface MainSteps {

    public void initializeDriver(String browser);

    public void seePage(String page);

    public void CheckPage(String page);

    public void openUrl(String url);

    public void CheckElementPage(String element, int index);

    public void ScroollPageForPositions(String element, int index, int begin, int end)throws InterruptedException ;

    public void SelectInFilterArea(String element, String value) throws InterruptedException;

    public void mouseHover(String element) throws InterruptedException;

    public void CheckClikableElement(String element, int  index);

    public void CheckPositionResult(String element, int index);

    public void CheckPositionsElementForDepartmantAndLoacation(String element, String department, String location, int index)throws InterruptedException ;


        public void ScrollPage(int value)throws InterruptedException;

    public WebElement findElement(String element,int index);

    public WebElement waitElement(String element, int timeout) throws InterruptedException, IOException;

    public void clickElement(String element,int index) throws InterruptedException;

    public void enterText(String text, String element);

    public void clickKeyboard(String key);

    public void clickKeyboardWithElement(String key, String element);


}
