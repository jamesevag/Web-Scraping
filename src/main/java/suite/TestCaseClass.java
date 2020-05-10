package suite;

import common.HelperClass;
import org.testng.annotations.Test;

import java.util.Dictionary;
import java.util.Hashtable;

public class TestCaseClass extends HelperClass {

    static Dictionary<String, String> locations = new Hashtable<String, String>();
    final static String urlPrefix= "https://www.spitogatos.gr/search/results/residential/sale/r";

    static {
        locations.put("Athens","102/m102m?ref=homepageMapSearchSR");
        locations.put("Mykonos","176/m3681m?ref=homepageMapSearchSR");

    }
    public TestCaseClass(){
    }

        @Test
        public void openAthensUrl() {
                System.out.println("Open Athens results");
                driver.get(urlPrefix+locations.get("Athens"));
        }

    @Test
    public void openMykonosUrl() {
        System.out.println("Open Mykonos results");
        driver.get(urlPrefix+locations.get("Mykonos"));
    }
}
