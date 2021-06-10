package automation;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTwo {
    @Test
    public void searchByCategory() {
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://opentdb.com/");

        Assert.assertEquals("Open Trivia DB: Free to use, user-contributed trivia question database.", driver.getTitle());

        WebElement buttonBrowse = driver.findElement(By.xpath("//*[@id=\"page-top\"]/section/div/div/div/a[1]"));
        buttonBrowse.click();

        WebElement searchInput = driver.findElement(By.id("query"));

        searchInput.sendKeys("Science: Computers");

        WebElement selectCategory = driver.findElement(By.xpath("/html/body/div[1]/form/div/select/option[3]"));
        selectCategory.click();

        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/form/div/button"));
        searchButton.click();

        int rowCount = driver.findElements(By.xpath("//*[@id=\"page-top\"]/div[2]/table/tbody/tr")).size();

        Assert.assertEquals(25, rowCount);

        WebElement pageControl = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[2]/center/ul"));
        boolean isPresent = pageControl.isDisplayed();
        Assert.assertTrue(isPresent);
    }
}