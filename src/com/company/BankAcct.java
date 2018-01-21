package com.company;
// Week 2 Homework - Bank Account Class Object

public class BankAcct {
        public int    iAcctNum;
        public String sName;
        public double dBalance;

        public BankAcct(int iAcctNum, String sName, Double dBalance) {
            this.iAcctNum = iAcctNum;
            this.sName = sName;
            this.dBalance = dBalance;
        } // end of constructor

        // Both methods should accept an argument to altar the account.
        // withdraw method - deduct money from the account
        public void Withdraw(double dSub) {
            this.dBalance -= dSub;
        } // end Withdraw

        // deposit method - add money to the account
       public void Deposit(double dAdd) {
           this.dBalance += dAdd;
        } // end Deposit

} // end of class object BankAcct
