package pages;

import org.openqa.selenium.By;

import java.util.Hashtable;

public class QApage extends BasePage {

    public Hashtable<String, By> QAElements;

    public QApage() {
        super();
        this.QAElements = new Hashtable<>();
        QAElements.put("QAPage seeAllQAJobsButton", By.xpath("//*[contains(text(), 'See all QA jobs')]"));

        this.pageElements = QAElements;
    }
}
