package suite;

import common.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.*;

public class TestCaseClass extends HelperClass {

    static Dictionary<String, String> locations = new Hashtable<String, String>();
    final static String urlPrefix = "https://www.spitogatos.gr/search/results/residential/sale/r";

    static {
        locations.put("Athens", "102/m102m?ref=homepageMapSearchSR");
        locations.put("Mykonos", "176/m3681m?ref=homepageMapSearchSR");

    }

    public TestCaseClass() {
    }

    @Test
    public void openAthensUrl() throws InterruptedException {
        System.out.println("Open Athens results");
        driver.get(urlPrefix + locations.get("Athens"));
        Thread.sleep(1000);
        final List<WebElement> elements = driver.findElements(By.xpath("//div[@id='searchDetailsListings']"));
        elements.forEach(el-> {
            System.out.println(el.getText());
        } );
    }

    @Test
    public void openMykonosUrl() throws InterruptedException {
        System.out.println("Open Mykonos results");
        driver.get(urlPrefix + locations.get("Mykonos"));
        Thread.sleep(1000);
        final List<WebElement> elements = driver.findElements(By.xpath("//div[@id='searchDetailsListings']"));
        elements.forEach(el-> {
            System.out.println(el.getText());
        } );
    }
}
