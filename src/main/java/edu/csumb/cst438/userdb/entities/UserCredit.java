package edu.csumb.cst438.userdb.entities;

public class UserCredit {
    private int amount;

    public UserCredit (int amount) {
        this.amount = amount;
    }

   /* public double getUserCredit () {
        return this.amount;
    }*/


    public int getAmount () {
        return this.amount;
    }
}
