package SeleniumFirst;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PHPTravels {
    private static WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void travelWebsiteExcercise() throws InterruptedException{
        driver.manage().window();
        Thread.sleep(1000);
        driver.get("https://www.phptravels.net/");
        Thread.sleep(2000);
        WebElement srch = driver.findElement(By.tagName("input"));
        srch.sendKeys("London");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//html//li[@class='select2-results-dept-0 select2-result select2-result-unselectable select2-result-with-children']//li[1]/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("checkout")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[15]/div[@class='datepicker-days']/table//td[.='20']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='adults']//option[@value='3']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='body-section']/div[5]/div[3]/div/table/tbody/tr/td/div[2]/div/h4/a/b")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//html//tr[1]/td[1]/div[2]/div[3]/div[3]/button[1]")).click();
        Thread.sleep(4000);
    }

        @After
        public void tearDown(){
            driver.quit();
        }

    }
