package automation;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationThree {
    @Test
    public void createAPI() {
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://opentdb.com/");

        Assert.assertEquals("Open Trivia DB: Free to use, user-contributed trivia question database.", driver.getTitle());

        WebElement buttonAPI = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a"));
        buttonAPI.click();

        WebElement inputNumber = driver.findElement(By.xpath("//*[@id=\"trivia_amount\"]\n"));
        inputNumber.clear();
        inputNumber.sendKeys("5");

        WebElement selectCategory = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/form/select[1]/option[13]"));
        selectCategory.click();

        WebElement selectDifficulty = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/form/select[2]/option[3]"));
        selectDifficulty.click();

        WebElement buttonGenerateAPI = driver.findElement(By.xpath("/html/body/div[1]/form/button"));
        buttonGenerateAPI.click();

        WebElement successAPI = driver.findElement(By.xpath("/html/body/div[1]/div"));

        System.out.println(successAPI.isDisplayed());
        Assert.assertTrue(successAPI.isDisplayed());
    }
}
