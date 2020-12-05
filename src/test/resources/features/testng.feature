
  Feature: BBC News Header navigation
    @test1
    Scenario: A user on the BBC News Home page navigates to the local weather via the top navbar
      Given A user is on the BBC Home page
      When the user selects "Weather"
      Then the local weather page is displayed