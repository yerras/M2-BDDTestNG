package bddtestng.testngstepdef;

import bddtestng.service.NavigationService;
import bddtestng.service.ValidationService;
import gherkin.lexer.De;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

public class MyStepdefs {

        private static  NavigationService navigationService;
        private static  ValidationService validationService;

        public MyStepdefs(NavigationService navigationService, ValidationService validationService){
            this.navigationService = navigationService;
            this.validationService = validationService;
        }
    public void setUp(){
        MutablePicoContainer pico = new DefaultPicoContainer();
        pico.addComponent(navigationService);
        pico.addComponent(validationService);

    }
    @Given("A user is on the BBC Home page")
    public void aUserIsOnTheBBCHomePage() {
            navigationService.openHomePage();
    }

    @When("the user selects \"([^\"]*)\"$")
    public void theUserSelects(String topBarLink) {
            navigationService.selectTopBarLink();
    }

    @Then("the local weather page is displayed")
    public void theLocalWeatherPageIsDisplayed() throws Throwable {
            throw new PendingException();
    }
}
