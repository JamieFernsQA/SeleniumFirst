package SeleniumFirst;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class DemoQAMouse {

    private static WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void MouseTest() throws InterruptedException {

        driver.manage().window().maximize();
        driver.get("http://demoqa.com/");
        driver.findElement(By.id("ui-id-1")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ui-id-2")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ui-id-3")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ui-id-4")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ui-id-5")).click();
        Thread.sleep(1000);

        driver.get("http://demoqa.com/selectable/");
        driver.findElement(By.id("ui-id-1")).click();
        driver.findElement(By.id("ui-id-2")).click();
        driver.findElement(By.id("ui-id-3")).click();




        driver.get("http://demoqa.com/");
        driver.findElement(By.linkText("Accordion")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ui-id-6")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ui-id-8")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ui-id-10")).click();
        Thread.sleep(1000);

        driver.findElement(By.linkText("Autocomplete")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ui-id-5")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("tagsss")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("tagsss")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("tagsss")).sendKeys("ja");
        Thread.sleep(1000);
        driver.findElement(By.id("tagsss")).sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        driver.findElement(By.id("tagsss")).sendKeys(Keys.DOWN);
        Thread.sleep(1000);
        driver.findElement(By.id("tagsss")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        driver.get("http://demoqa.com/datepicker/");
        Thread.sleep(1000);
        driver.findElement(By.id("ui-id-3")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("datepicker3")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/select")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/select[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("8")).click();
        Thread.sleep(1000);

        driver.get("http://demoqa.com/menu/");
        driver.findElement(By.linkText("Sub Menu Item 1")).click();
        driver.findElement(By.linkText("Sub Menu Item 2")).click();
        driver.findElement(By.linkText("Sub Menu Item 3")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Sub Menu Item 3')])[2]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Sub Menu Item 1')])[2]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Sub Menu Item 3')])[3]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Sub Menu Item 1')])[3]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Sub Menu Item 2')])[2]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Sub Menu Item 3')])[4]")).click();
        driver.findElement(By.id("ui-id-1")).click();




        driver.get("http://demoqa.com/tabs/");
        driver.findElement(By.id("ui-id-2")).click();
        driver.findElement(By.id("ui-id-3")).click();

        driver.get("http://demoqa.com/tooltip/");
        driver.findElement(By.id("age")).click();
        }


    @After
    public void tearDown(){
        driver.quit();
    }
}
