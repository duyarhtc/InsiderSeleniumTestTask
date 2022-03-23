Feature: E-commerce

  Background:
    #task 1
    Given I initialize chrome driver
    When I go to "https://useinsider.com/" url
    Then I see home page
    And I wait for 5 seconds

  @HTC
  Scenario: Start Full Test

    When I check page  home
    Then I click element: homepage allow cookies index: 1
    #Task 2
    When I click element: homepage more index: 1
    Then I wait for 5 seconds
    When I click element: homepage career index: 1
    Then I see career page
    Then I wait for 2 seconds
    And I check page  career
   When I check careerPage seeAllTeamsButton in page index: 1
    Then I check careerPage locationArea in page index: 1
   Then I check careerPage lifeAtInsiderArea in page index: 1
    And I wait for 3 seconds
    #Task 3
    When I scroollPage for  element: careerPage seeAllTeamsButton , index: 1 and positions: 0 - 2500
    Then I scroollPage for  element: careerPage qualityAssuranceArea , index: 1 and positions: 0 - 200
    Then I see QA page
    And I wait for 3 seconds
    
    When I click element: QAPage seeAllQAJobsButton index: 1
    Then I see QAopenPosition page
    And I wait for 3 seconds

    When I scrollPage for 200
    Then I click element: QAopenPOsitionPage LocationDropDown index: 1
    And I wait for 3 seconds

    When I select in filter area :QAopenPOsitionPage LocationResults and set  value: Istanbul, Turkey
    Then I wait for 3 seconds

    When I click element: QAopenPOsitionPage DepartmentDropDown index: 1
    Then I wait for 1 seconds
    When I select in filter area :QAopenPOsitionPage DepartmentResults and set  value: Quality Assurance
    Then I wait for 1 seconds
    Then I check position result element : QAopenPOsitionPage FilterResultArea and index: 1
    And I wait for 5 seconds

    When I scrollPage for 250
    #Task 4-5
    Then I check positions element: QAopenPOsitionPage PositionList for departmant QA Assurance and loacation İstanbul, Turkey index : 1










