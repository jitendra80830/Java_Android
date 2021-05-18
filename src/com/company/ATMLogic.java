package com.company;

import java.sql.SQLOutput;

public class ATMLogic {

    private int pin = 1234;
    private long balance = 2000;


    public boolean checkPin(int pin) {
        if (this.pin == pin) {
            return true;
        } else
            return false;


    }

    public long getBalance(int pin) {
        if (checkPin(pin)) {
            return balance;
        }
        return 0;
    }

    public boolean withdrawATM(int withdrawMoney) {
        if (this.balance > withdrawMoney) {
            this.balance -= withdrawMoney;
            return true;
        } else {
            return false;
        }
    }

    public boolean depositATM(long depositMoney) {
        try{
            this.balance += depositMoney;
            return true;

        }catch(Exception e){
            System.out.println("Exception is: "+e);
            e.getStackTrace();
        }
        return false;

    }
}
