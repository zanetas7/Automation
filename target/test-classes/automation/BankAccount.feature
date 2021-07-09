Feature: BankAccount

  Scenario: withdraw money available in user account
    Given bankAccount has 1000 PLN
    When user withdraw 500 PLN
    Then transaction should be done
    And account balance should be 500PLN

    Scenario: withdraw is not possible
      Given bankAccount has 1000 PLN
      When user withdraw 1500 PLN
      Then transaction should not be done
      And account balance should be 1000PLN

      Scenario: withdrawn and transfer money available for user
        Given bankAccount has 1000 PLN
        When user withdraw 1000 PLN
        And user transfer 2000 PLN
        And user withdraw 500 PLN
        Then transaction should be done
        And account balance should be 1500PLN

        Scenario: money pay in & withdraw are not available for user account
          Given bankAccount has 2000 PLN
          When user withdraw 1500 PLN
          And user withdraw 1500 PLN
          Then transaction should not be done
          And account balance should be 500PLN



