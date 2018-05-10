package gradle.cucumber;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.web.client.RestTemplate;

public class BasicStepdefs {
    /*@When("^I run a failing step")
    public void I_run_a_failing_step() throws Throwable {
        new Production().doWork();
    }*/

    @When("^I do a GET request to Test controller")
    public void Get_test_controller_response() throws Throwable{
        RestTemplate restTemplate = new RestTemplate();
        String res = restTemplate.getForObject("http://localhost:8080/Test", String.class);
    }
    @Then("^I should get a Ok response$")
    public void i_should_get_a_Ok_response(String responseExpected) {
        Assert.assertEquals(responseExpected, "Ok");
    }
}
