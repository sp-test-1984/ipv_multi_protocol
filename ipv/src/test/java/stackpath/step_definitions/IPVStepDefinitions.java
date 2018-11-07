package stackpath.step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import stackpath.pages.LoginPage;
import stackpath.util.TestConf;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class IPVStepDefinitions {

    private static TestConf TEST_CONF = TestConf.getTestConf();
    private static boolean isAccessible = false;
    private Logger LOGGER = LoggerFactory.getLogger(IPVStepDefinitions.class);

    @Before
    public void setUp(){
        try {
            Desktop.getDesktop().open(new File(TEST_CONF.getApplicationPath()));
            isAccessible = true;
        } catch (IOException e){
            LOGGER.error("The file: /Applications/IPVanish VPN.app doesn't exist.");
        }
    }

    @Given("^IPVanish is accessible$")
    public void ipvanish_is_accessible() throws Throwable {
        Assert.assertTrue("ipvanish not accessible", isAccessible);
    }

    @Given("^I am logged$")
    public void i_am_logged() throws Throwable {
        LoginPage.login();
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
