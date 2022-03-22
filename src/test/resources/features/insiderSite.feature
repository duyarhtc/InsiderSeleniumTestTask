Feature: E-commerce

  Background:
    Given I initialize chrome driver
    When I go to "https://useinsider.com/" url
    Then I see home page
    And I wait for 5 seconds

  @HTC
  Scenario: Start Full Test

    When I check page  home
    When I click element: homepage allow cookies index: 1

    When I click element: homepage more index: 1
    And I wait for 5 seconds
    When I click element: homepage career index: 1
    Then I see career page
    And I wait for 2 seconds
    
    When I check page  career


   When I check careerPage seeAllTeamsButton in page index: 1
    #When I check careerPage locationArea in page index: 1
   #When I check careerPage lifeAtInsiderArea in page index: 1
    #When I wait for 3 seconds



    #When I scroollPage for  element: careerPage seeAllTeamsButton , 1 and 0 - 2500
    #When I click element: careerPage seeAllTeamsButton index: 1
    #When I scroollPage for  element: careerPage qualityAssuranceArea , 1 and 0 - 2800
    #When I click element: careerPage qualityAssuranceArea index: 1






