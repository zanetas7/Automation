package automation.steps;

import automation.BankAccount;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BankAccountSteps {

    private BankAccount bankAccount;
    private boolean isWithdrawPossible;



    @Given("bankAccount has {int} PLN")
    public void bankaccountHasPLN(int accountBalance) {
        bankAccount = new BankAccount(accountBalance);
    }

    @When("user withdraw {int} PLN")
    public void userWithdrawPLN(int withdrawMoney) {
   isWithdrawPossible = bankAccount.withdraw(withdrawMoney);


    }

    @Then("transaction should be done")
    public void transactionShouldBeDone() {
        Assert.assertTrue(isWithdrawPossible);
    }

    @And("account balance should be {int}PLN")
    public void accountBalanceShouldBePLN(int accountBalance) {
   Assert.assertEquals(accountBalance, bankAccount.getAccountBalance());
    }

    @Then("transaction should not be done")
    public void transactionShouldNotBeDone() {
   Assert.assertFalse(isWithdrawPossible);
   
    }

    @And("user transfer {int} PLN")
    public void userTransferPLN(int transferAmount) {
        bankAccount.transfer(transferAmount);
    }
}
