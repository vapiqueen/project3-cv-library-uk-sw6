package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobtitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropdown;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']" )
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(xpath="//input[@id='salarymin']")
    WebElement MinSalary;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement MaxSalary;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement SalaryTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement JobTypeDropDown;


     @CacheLookup
             @FindBy(xpath ="//input[@id='hp-search-btn']")
              WebElement FindJobButton;


    @CacheLookup
    @FindBy(xpath = "//span//div//span[normalize-space()='Accept All']")
    WebElement acceptCookies;


    public void enterJobTitle(String jobTitle){
         sendTextToElement(jobtitle,jobTitle);
        log.info("Enter the job title : " + jobtitle.toString());


     }
     public void enterLocation(String locations){
         sendTextToElement(location,locations);
         log.info("Enter the location : " +location.toString());
     }
     public void selectDistance(String distance) {
         selectByVisibleTextFromDropDown(distanceDropdown, distance);
         log.info("Selecting the distance : " + distanceDropdown.toString());
     }
     public void clickOnMoreSearchOptionLink(){
         clickOnElement(moreSearchOptionsLink);
         log.info("Click on more search option link : " + moreSearchOptionsLink.toString());
     }
     public void enterMinSalary(String minSalary){
         sendTextToElement(MinSalary,minSalary);
         log.info("Entering Minimum Salary : " + MinSalary.toString());
     }
     public void enterMaxSalary(String maxSalary){
         sendTextToElement(MaxSalary,maxSalary);
         log.info("Entering Maximum salary : " + MaxSalary.toString());
     }
     public void selectSalaryType(String sType){
         selectByVisibleTextFromDropDown(SalaryTypeDropDown,sType);
         log.info("Selecting salary type : " + SalaryTypeDropDown.toString());
     }
     public void selectJobType(String jobType){
         selectByVisibleTextFromDropDown(JobTypeDropDown,jobType);
         log.info("Selecting job type : " + JobTypeDropDown.toString());
     }
     public void clickOnFindJobsButton(){
         clickOnElement(FindJobButton);
         log.info("Clicking on find job button : " + FindJobButton.toString());
     }
    public void setAcceptCookies() {
        System.out.println("we are switching to iFrame");
        clickOnElement(acceptCookies);
        System.out.println("We are done with iFrame");
        log.info("Clicking on alert : " + acceptCookies.toString());
        driver.switchTo().defaultContent();
    }
    public void jobSearch(String jobtitle , String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType, String results){
        enterJobTitle(jobtitle);
        enterLocation(location);
       selectDistance(distance);
        clickOnMoreSearchOptionLink();
       enterMinSalary(salaryMin);
       enterMaxSalary(salaryMax);
        selectSalaryType(salaryType);
        selectJobType(jobType);
        clickOnFindJobsButton();

    }
}

