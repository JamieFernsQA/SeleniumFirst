package SeleniumFirst;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

    private static WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
