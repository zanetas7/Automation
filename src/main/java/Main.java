import automation.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount mBank = new BankAccount();  // nowe konto bankowe z nazwa Mbank
        mBank.transfer(1000);  //włacenie kasy na konto Mbank
        mBank.withdraw(1000);
        mBank.transfer(200);
        mBank.getAccountBalance();


    }

}
