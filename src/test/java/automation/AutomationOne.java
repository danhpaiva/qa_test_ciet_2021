package automation;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationOne {
    @Test
    public void searchQuestionNoExist() {
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://opentdb.com/");

        Assert.assertEquals("Open Trivia DB: Free to use, user-contributed trivia question database.", driver.getTitle());

        WebElement buttonBrowse = driver.findElement(By.xpath("//*[@id=\"page-top\"]/section/div/div/div/a[1]"));
        buttonBrowse.click();

        WebElement searchInput = driver.findElement(By.id("query"));

        searchInput.sendKeys("Science: Computers");

        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/form/div/button"));
        searchButton.click();

        WebElement resultNoQuestion = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[2]/div"));
        Assert.assertEquals("No questions found.", resultNoQuestion.getText());
    }
}
