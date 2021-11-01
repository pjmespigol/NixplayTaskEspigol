#Author: pamelaespigol@gmail.com
#Date: October 31, 2021
#Description: In compliance to Nixplay's Technical Task for the QA position

@FrameSelection
Feature: Nixplay Frame Selection Menu

  @FrameSelectionTC1
  Scenario: Validate the header and menu of the Nixplay Fifteen Inch Frame page
    Given User opens Nixplay website
    When User clicks on Nixplay Frames tab
    And User clicks on Fifteen Inch option at the top of the page
    Then Header and tabs are valid