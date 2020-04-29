package demo.pages;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BulbaHomePage {
    public void openHomePage(){
        WebDriverInstance.driver.get("https://bulbapedia.bulbagarden.net/wiki/Main_Page");
    }

    public void insertKeys(String text){
        WebDriverWait wait = new WebDriverWait(WebDriverInstance.driver, 10);
        WebElement inputSearch = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("searchInput")));
        //WebElement inputSearch = WebDriverInstance.driver.findElement(By.id("searchInput"));
        inputSearch.sendKeys(text + Keys.ENTER);
    }
}
