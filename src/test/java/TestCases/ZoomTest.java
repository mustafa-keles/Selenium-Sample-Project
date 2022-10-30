package TestCases;

import Pages.DriverWrapper;
import Pages.ZoomHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZoomTest extends DriverWrapper {
    ZoomHomePage zoomObj = new ZoomHomePage();



    @Test
    public void getHomePage (){

       zoomObj.clickScheduleButton();

       System.out.println(DriverWrapper.getDriver().getTitle());
       Assert.assertEquals("Schedule | ZoomiCare", zoomObj.getPageTitle(), "Title is not correct");
    }




}
