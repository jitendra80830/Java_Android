package com.company;
import java.util.Scanner;
public class ATMInterface {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        boolean flage =true;

        int pin ,withdrawMoney;
        long depositMoney;

        ATMLogic atmLogic = new ATMLogic();
        do{

            System.out.println("\n");
            System.out.println("welcome to bank of india");
            System.out.println("please choose option which you want");
            System.out.println("1.check pin");
            System.out.println("2.check balance");
            System.out.println("3.withdraw Money");
            System.out.println("4.Deposit money");
            System.out.println("5.Exit");

            int choose = input.nextInt();

            switch (choose) {

                case 1:
                    System.out.println("check pin");
                    break;
                case 2:
                    System.out.println("Inter 4-digit pin number");
                    pin = input.nextInt();

                    if (atmLogic.checkPin(pin)) {
                        System.out.println("your balance is: " + atmLogic.balance);
                    } else {
                        System.out.println("your pin is invalid");
                    }
                    break;
                case 3:
                    System.out.println("Enter pin for withdraw money");
                    pin = input.nextInt();

                    if (atmLogic.checkPin(pin)) {

                        System.out.println("Enter money for withdraw");
                        withdrawMoney = input.nextInt();

                        if (atmLogic.withdrawATM(withdrawMoney)) {

                            System.out.println("please collect the money");
                        } else {
                            System.out.println("your balance is sufficient");
                        }

                    } else {
                        System.out.println("your pin in incorrect");
                    }
                    break;
                case 4:
                    System.out.println("Enter Pin for Deposit money");
                    pin = input.nextInt();

                    if (atmLogic.checkPin(pin)) {
                        System.out.println("Enter Money for deposit");
                        depositMoney = input.nextLong();

                        if (atmLogic.depositATM(depositMoney)) {
                            System.out.println("Deposit money successfully");

                        } else {
                            System.out.println("there was a problem while you deposit money please  try again");
                        }
                    } else {
                        System.out.println("your pin is incorrect");
                    }
                    break;
                case 5:
                    System.out.println("Thank for using our ATM");
                    flage = false;
            }
        }while(flage);
    }
}
