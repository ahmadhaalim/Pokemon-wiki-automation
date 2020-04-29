package demo.steps;

import demo.pages.BulbaHomePage;
import demo.pages.ResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchPokemonDefinition {
    private BulbaHomePage bulbaHomePage = new BulbaHomePage();
    private ResultPage resultPage = new ResultPage();
    @Given("User in the bulbapedia homepage")
    public void userInTheBulbapediaHomepage() {
        bulbaHomePage.openHomePage();
    }

    @When("User input {string} on input search and press enter")
    public void userInputOnInputSearch(String pokemon) {
        bulbaHomePage.insertKeys(pokemon);
    }

    @Then("User get into the {string} article page with number {string}")
    public void userGetIntoTheArticlePage(String pokemon, String number) {
        String result = resultPage.getTitlePage();
        String resultnumber = resultPage.getNumber();
        Assert.assertEquals(pokemon,result);
        Assert.assertEquals(number,resultnumber);
    }
}
