package SeleniumFirst;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingSite {

    private static WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }
    @Test
    public void phpWebsiteTest() throws InterruptedException{
        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        driver.get("http://automationpractice.com/index.php");
        Thread.sleep(1000);
        WebElement dressSearchField = driver.findElement(By.id("search_query_top"));
        Thread.sleep(1000);
        dressSearchField.sendKeys ("dresses");
        dressSearchField.submit();
        Thread.sleep(1000);
        WebElement printedDress = driver.findElement(By.partialLinkText("Printed Summer Dress"));
        printedDress.click();
        Thread.sleep(4000);
    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
