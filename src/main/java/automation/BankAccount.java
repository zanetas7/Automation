package automation;

public class BankAccount {
    private int accountBalance;

    public BankAccount(){
   accountBalance = 0;
    }

//konstruktor parametrowy
public BankAccount (int accountBalance){
    this.accountBalance = accountBalance;


}

public boolean withdraw(int amount){
    if (amount > this.accountBalance) {
        return false;
    }this.accountBalance = accountBalance - amount;
    return true;

    }
    //Metoda druga
    public void transfer(int amount){
    this.accountBalance = accountBalance + amount;

    }

    public int getAccountBalance() {
        return accountBalance;
    }
}




