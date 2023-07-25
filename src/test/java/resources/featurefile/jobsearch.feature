@regression
Feature: JobSearch Test
  As user I want to find the job

@smoke
  Scenario Outline: Verify User should able to Search the jobs Successfully
  Given I am on Homepage
  When I enter the job title "<job title>"
  And I enter the location "<location>"
  And I select the distance "<distance>"
  And I click on moreSearchOptionsLink
  And I enter the minimum salary "<salaryMin>"
  And I enter the maximum salary "<salaryMax>"
  And I select salaryType "<salaryType>"
  And I select jobType "<jobType>"
  And I click on find jobs button
  Then I verify the result "<result>"

    Examples:
      | job title | location              | distance | salaryMin | salaryMax | salaryType | jobType   | result                         |
      | Tester   | Harrow,Greater London | 5miles   | 30000     | 50000     | Per annum  | Permanent | Permanent Tester Jobs In Harrow |
      | Tester   | Reading               | 1mile    | 2000      | 4000      | Per Month  | Contract  | Contract Tester Job In Reading  |
      | Tester   | Ealing                | 10miles  | 100       | 500       | Per Day    | Part Time | Part Time Tester Jobs In Ealing |
