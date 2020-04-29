package demo.pages;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {
    public String getTitlePage(){
        WebElement title = WebDriverInstance.driver.findElement(By
                .cssSelector("body.mediawiki.ltr.sitedir-ltr.mw-hide-empty-elt.ns-0.ns-subject.page-Pikachu_Pokémon.rootpage-Pikachu_Pokémon.skin-monobook.action-view.site-bulbapedia:nth-child(2) div.mw-body div.mw-body-content div.mw-content-ltr:nth-child(4) table.roundy:nth-child(2) table.roundy td.roundy:nth-child(1) tr:nth-child(1) td:nth-child(1) big:nth-child(1) big:nth-child(1) > b:nth-child(1)"));
        return title.getText();
    }

    public String getNumber(){
        WebElement number = WebDriverInstance.driver.findElement(By
                .cssSelector("body.mediawiki.ltr.sitedir-ltr.mw-hide-empty-elt.ns-0.ns-subject.page-Pikachu_Pokémon.rootpage-Pikachu_Pokémon.skin-monobook.action-view.site-bulbapedia:nth-child(2) div.mw-body div.mw-body-content div.mw-content-ltr:nth-child(4) table.roundy:nth-child(2) table.roundy th.roundy:nth-child(2) big:nth-child(1) big:nth-child(1) a:nth-child(1) > span:nth-child(1)"));
        return number.getText();
    }
}
