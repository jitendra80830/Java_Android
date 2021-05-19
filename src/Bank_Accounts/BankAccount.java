package Bank_Accounts;

public class BankAccount {
    private int accountNo;
    private int balance;
    private int pin;

    static int counter = 1001;

    public BankAccount(int pin,int balance) {
        this.pin = pin;
        this.balance = balance;
        this.accountNo = counter++;
    }

    public int getPin() {
        return pin;
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
