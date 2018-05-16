package SeleniumFirst;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHPTravels {
    private static WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void phpTravelsTest() throws InterruptedException {
        driver.manage().window();
        Thread.sleep(1000);
        driver.get("https://www.phptravels.net/");
        Thread.sleep(1000);

        WebElement LocationSearchField = driver.findElement(By.tagName("input"));
        LocationSearchField.sendKeys("London");

        Thread.sleep(2000);

        WebElement numberOfAdults = driver.findElement(By.id("adults"));
        numberOfAdults.sendKeys("3");
        Thread.sleep(2000);

        WebElement CheckInDate = driver.findElement(By.name("checkin"));
        CheckInDate.clear();
        CheckInDate.sendKeys("18/09/2018");
        Thread.sleep(1000);


        WebElement CheckOutDate = driver.findElement(By.name("checkout"));
        CheckOutDate.clear();
        CheckOutDate.sendKeys("21/09/2018");
        Thread.sleep(1000);



        WebElement PressSearchButton = driver.findElement(By.className(".btn"));
        PressSearchButton.click();
        Thread.sleep(2000);




    }

        @After
        public void tearDown(){
            driver.quit();
        }

    }
