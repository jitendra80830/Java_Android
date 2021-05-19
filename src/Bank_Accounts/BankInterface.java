package Bank_Accounts;

import java.util.*;
public class BankInterface {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice,securityPin,accountNo,deposiitAmt;

        boolean flag = true;
        BankAccount bankAccLogic;
        ArrayList<BankAccount> accountsList = new ArrayList<>();


        /*
        1.create account
        2.set pin to a account
        3.deposit money to account
        4.withdraw money from account using pin
         */

        do {

            System.out.println("\n");
            System.out.println("welcome to bank of india");
            System.out.println("1.create account");
            System.out.println("2.check details");
            System.out.println("3.withdraw Money");
            System.out.println("4.Deposit money");
            System.out.println("5.change pin");
            System.out.println("6.Exit");
            System.out.println("Please choose a option which you want to do");
            choice = input.nextInt();

            switch (choice){
                case 1: //create account
                    System.out.println("Enter your security pin");
                    securityPin = input.nextInt();
                    System.out.println("Please enter initilize deposit amount");
                    deposiitAmt = input.nextInt();
                    bankAccLogic = new BankAccount(securityPin,deposiitAmt);
                    accountsList.add(bankAccLogic);
                    System.out.println("Account created successfully");
                    System.out.println("Total no of bank accounts: "+accountsList.size());
                    break;
                case 2:
                    System.out.println("enter your account no");
                    accountNo = input.nextInt();
                    System.out.println("Enter your security pin");
                    securityPin = input.nextInt();

                    for(BankAccount bankAccount : accountsList){
                        if(bankAccount.getPin() == securityPin && bankAccount.getAccountNo() == accountNo){
                            System.out.println("Account No: "+bankAccount.getAccountNo());
                            System.out.println("Balance: "+bankAccount.getBalance());
                        }else {
                            System.out.println("Please inter valid account no or security pin");

                        }
                    }

                    break;
                case 6:
                    System.out.println("Thank you for using bank");
                    flag = false;
            }

        }while(flag);
    }
}
