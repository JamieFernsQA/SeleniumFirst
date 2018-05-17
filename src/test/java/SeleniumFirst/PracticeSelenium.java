package SeleniumFirst;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSelenium {

    private static WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }
@Test
public void feedback(){


}



    @After
    public void tearDown(){
        driver.quit();
    }
}
