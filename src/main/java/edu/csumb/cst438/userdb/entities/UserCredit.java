package edu.csumb.cst438.userdb.entities;

public class UserCredit {
    private double amount;

    public UserCredit (double amount) {
        this.amount = amount;
    }

   /* public double getUserCredit () {
        return this.amount;
    }*/


    public Double getAmount () {
        return this.amount;
    }
}
