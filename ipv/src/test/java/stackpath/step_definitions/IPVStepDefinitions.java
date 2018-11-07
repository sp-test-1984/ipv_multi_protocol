package stackpath.step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stackpath.util.TestConf;

public class IPVStepDefinitions {


    @Given("^IPVanish is accessible$")
    public void ipvanish_is_accessible() throws Throwable {
        System.out.println(TestConf.getTestConf().getApplicationPath());
    }

    @Given("^I am logged$")
    public void i_am_logged() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I select \"([^\"]*)\"$")
    public void i_select(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^attempt connection$")
    public void attempt_connection() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should successfully connect$")
    public void i_should_successfully_connect() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
