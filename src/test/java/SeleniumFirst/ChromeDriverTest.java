package SeleniumFirst;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

    private static WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test

    public void exampleSelenium() throws InterruptedException {
        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        driver.get("http://www.google.com/");
        Thread.sleep(1000);
    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
