package demo.pages;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultPage {
    public String getTitlePage(){
        WebDriverWait wait = new WebDriverWait(WebDriverInstance.driver, 10);
        WebElement title = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//big/b")));
        //WebElement title = WebDriverInstance.driver.findElement(By
          //      .cssSelector("body.mediawiki.ltr.sitedir-ltr.mw-hide-empty-elt.ns-0.ns-subject.page-Pikachu_Pokémon.rootpage-Pikachu_Pokémon.skin-monobook.action-view.site-bulbapedia:nth-child(2) div.mw-body div.mw-body-content div.mw-content-ltr:nth-child(4) table.roundy:nth-child(2) table.roundy td.roundy:nth-child(1) tr:nth-child(1) td:nth-child(1) big:nth-child(1) big:nth-child(1) > b:nth-child(1)"));
        return title.getText();
    }

    public String getNumber(){
        WebDriverWait wait = new WebDriverWait(WebDriverInstance.driver, 10);
        WebElement number = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//big/a")));
//        WebElement number = WebDriverInstance.driver.findElement(By
//                .xpath("//big/a"));
        return number.getText();
    }
}
