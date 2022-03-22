package pages;

import org.openqa.selenium.By;

import java.util.Hashtable;

public class HomePage extends BasePage {

    public Hashtable<String, By> homeElements;

    public HomePage() {
        super();
        this.homeElements = new Hashtable<>();

        homeElements.put("homepage allow cookies",By.id("wt-cli-accept-all-btn"));
        homeElements.put("homepage more",By.xpath("//*[contains(text(), 'More')]"));
        homeElements.put("homepage career",By.xpath("//*[contains(text(), 'Careers')]"));



        this.pageElements = homeElements;
    }
}
