package demo.pages;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BulbaHomePage {
    public void openHomePage(){
        WebDriverInstance.driver.get("https://bulbapedia.bulbagarden.net/wiki/Main_Page");
    }

    public void insertKeys(String text){
        WebElement inputSearch = WebDriverInstance.driver.findElement(By.id("searchInput"));
        inputSearch.sendKeys(text, Keys.ENTER);
    }
}
