package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {
    @Given("I am on Homepage")
    public void iAmOnHomepage() {

    }

    @When("I enter the job title {string}")
    public void iEnterTheJobTitle(String jobtitle) {
        new HomePage().enterJobTitle(jobtitle);
    }

    @And("I enter the location {string}")
    public void iEnterTheLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("I select the distance {string}")
    public void iSelectTheDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("I click on moreSearchOptionsLink")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter the minimum salary {string}")
    public void iEnterTheMinimumSalary(String MinSalary) {
        new HomePage().enterMinSalary(MinSalary);
    }

    @And("I enter the maximum salary {string}")
    public void iEnterTheMaximumSalary(String MaxSalary) {
        new HomePage().enterMaxSalary(MaxSalary);
    }

    @And("I select salaryType {string}")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("I select jobType {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("I click on find jobs button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("I verify the result {string}")
    public void iVerifyTheResult(String result) {
        Assert.assertEquals(new ResultPage().verifyTheResults(result),"result","No verify text found");
    }
}
