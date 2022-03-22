package pages;

import org.openqa.selenium.By;

import java.util.Hashtable;

public class CareerPage extends BasePage {

    public Hashtable<String, By> CareerElements;

    public CareerPage() {
        super();
        this.CareerElements = new Hashtable<>();
        CareerElements.put("careerPage locationArea", By.xpath("//*[contains(text(), '\n" + "Our Locations ')]"));
        CareerElements.put("careerPage seeAllTeamsButton", By.xpath("//*[contains(text(), 'See all teams')]"));
        CareerElements.put("careerPage lifeAtInsiderArea", By.xpath("//*[contains(text(), 'Life at Insider')]"));
        CareerElements.put("careerPage qualityAssuranceArea", By.xpath("//*[contains(text(), 'Quality Assurance')]"));


        CareerElements.put("submit login button", By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/button"));
        this.pageElements = CareerElements;
    }
}
