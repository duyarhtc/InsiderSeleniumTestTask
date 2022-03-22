package pages;

import org.openqa.selenium.By;

import java.util.Dictionary;
import java.util.Hashtable;

public abstract class BasePage {
    public Dictionary<String, By> pageElements;
    public Dictionary<String, By> commonElements;

    public BasePage() {
        this.pageElements = new Hashtable<>();
        this.commonElements = new Hashtable<>();
        commonElements.put("skip button", By.xpath("//*[(text()='Atla')]//parent::div"));
        commonElements.put("close image button", By.xpath("/html/body/div[6]/img"));
        commonElements.put("product results button", By.xpath("//p[@class='hb-pl-cn']"));
        commonElements.put("add to cart tab", By.xpath("//span [contains(text(),'Sepete Ekle')]//parent::button"));
        commonElements.put("go to cart button", By.xpath("//a[contains(text(),'Sepete git')]"));
        commonElements.put("complete the shopping button", By.xpath("//button [@class='sc-AxjAm cxvjoB button_next_step_Dj-RE']"));
    }
}