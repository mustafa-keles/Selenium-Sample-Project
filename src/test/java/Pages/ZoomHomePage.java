package Pages;

import org.openqa.selenium.By;

public class ZoomHomePage extends BasePage {

    By scheduleButtonEle = By.xpath("//a[@id='nav-schedule']");
    


    /*Fill out the edit box with "coronavirus NY numbers today".
Ø Click the "Google Search" button.
Ø Click on the link "Coronavirus in New York & NYC: Latest Updates".
Ø Verify the article header is "Coronavirus in New York: Latest Updates".*/
    public void clickScheduleButton() {
        clickOn(scheduleButtonEle);
        DriverWrapper.getDriver().findElement(scheduleButtonEle).click();
    }


}