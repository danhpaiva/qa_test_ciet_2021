package automation_one;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateOne {
    @Test
    public void helloWorld() {
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://opentdb.com/");

        Assert.assertEquals("Open Trivia DB: Free to use, user-contributed trivia question database.", driver.getTitle());

        WebElement buttonBrowse = driver.findElement(By.xpath("//*[@id=\"page-top\"]/section/div/div/div/a[1]"));
        buttonBrowse.click();
        
    }
}