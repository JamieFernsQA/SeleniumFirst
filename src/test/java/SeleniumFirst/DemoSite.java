package SeleniumFirst;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSite {

    private static WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

@Test
public void makeAccount() throws InterruptedException {

    driver.manage().window().maximize();
    driver.get("http://thedemosite.co.uk/");
    driver.findElement(By.linkText("addauser.php")).click();
    Thread.sleep(1000);

}


    @After
    public void tearDown(){
        driver.quit();
    }
}
