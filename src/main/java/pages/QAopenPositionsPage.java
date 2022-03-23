package pages;

import org.openqa.selenium.By;

import java.util.Hashtable;

public class QAopenPositionsPage extends BasePage {

    public Hashtable<String, By> QAopenPositionsElements;

    public QAopenPositionsPage() {
        super();
        this.QAopenPositionsElements = new Hashtable<>();
        QAopenPositionsElements.put("QAopenPOsitionPage LocationDropDown", By.id("select2-filter-by-location-container"));
        QAopenPositionsElements.put("QAopenPOsitionPage DepartmentDropDown", By.id("select2-filter-by-department-container"));

        QAopenPositionsElements.put("QAopenPOsitionPage LocationResults", By.id("select2-filter-by-location-results"));
        QAopenPositionsElements.put("QAopenPOsitionPage DepartmentResults", By.id("select2-filter-by-department-results"));

        QAopenPositionsElements.put("QAopenPOsitionPage FilterResultArea", By.id("resultCounter"));
        QAopenPositionsElements.put("QAopenPOsitionPage PositionList", By.className("position-list-item-wrapper"));



        this.pageElements = QAopenPositionsElements;
    }
}
