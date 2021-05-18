package Bank_Accounts;

public class BankAccount {
    private int accountNo;
    private int balance;
    private int pin;

    public BankAccount(int pin) {
        this.pin = pin;
        this.balance = 1000;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
