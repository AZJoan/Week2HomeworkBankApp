package com.company;

import java.text.NumberFormat;
import java.util.ArrayList;

// We are going to start working with the idea of Bank Accounts,
// which plays nicely into the concept of 'Object Orientated Programming".
// For this application, I want you to build a bank account class that contains
// different pieces of information.
// The account should house a "Bank Account Number", "Account Holder Name", and "Balance".
// All three member fields should be set in the constructor method, using arguments to set the values.
// Make two methods named "Withdraw" and "Deposit".
// Withdraw should deduct money from the account, deposit should add money to the account.
// Both of the methods should accept an argument to altar the account.
//
// From the main application file, create a bank account for everyone in class.
// Then deposit $57,000 (the average starting salary of a developer).
// Log out the balance of each account.
//
// Extras:
// DONE - After creating each of the accounts, store them all in an Array
// DONE (try both ArrayList and BankAccount[]), then use that array
// DONE and a loop to deposit all of the money, as well as logging out each of the balances.
// DONE  Look up the 'for each' loop and try to apply that,
//      rather than a 'fori' loop (we will cover this later in class).
// **WILL ADD LATER** Look up 'getters and setters' and see if you can apply the concept
//      (we will cover this later in class).

public class Main {

    public static void main(String[] args) {
        double iSetBal = 57000.00;

        // create a name array
        ArrayList<String> NameArr = new ArrayList<String>();
        // use method to load names in array
        int totAccts = SetNames(NameArr);

        // create array for initializing account number
        int[] AcctNumArr = new int[totAccts];
        // use method to load account numbers in array
        SetAcctNums(totAccts, AcctNumArr);

        // create array for initializing balance
        double[] BalArr = new double[totAccts];
        // use method to load initial balance array
        // Save Example: Worked BUT was replaced below by BankAcct.Deposit
        //SetAcctBal(totAccts, BalArr, iSetBal);

        // Create Array of BankAcct object instances
        ArrayList<BankAcct> BankAcctArr = new ArrayList<BankAcct>();
        for (int j = 0; j < totAccts - 1; j++) {
            BankAcctArr.add(new BankAcct(AcctNumArr[j], NameArr.get(j), BalArr[j]));
        } // end of for j

        // loop through array of BankAcct objects-set initial balance & print results
        // Could not figure out how to pass an array of objects to a method-wonder if you can or not??
        for (int k = 0; k < totAccts - 1; k++) {

            // create a temporary copy of each BankAcct object in array
            BankAcct TempAcct = BankAcctArr.get(k);

            // use BankAcct object method deposit (was calling SetAcctBal here before)
            TempAcct.Deposit(iSetBal);

            // use NumberFormat object with getCurrencyInstance method to format as $00,000.00
            NumberFormat formatBal = NumberFormat.getCurrencyInstance();

            // display each account and current balance
            System.out.println(
                    "|Acct. Number: " + TempAcct.iAcctNum + " |Holder Name: "
                            + TempAcct.sName + " |Balance: "
                            + formatBal.format(TempAcct.dBalance) + "|"
            );

        }  // end of for k

    } // end of psv main

    // method to set names in array
    static int SetNames (ArrayList < String > a) {

        a.add("Ted");
        a.add("Koddie");
        a.add("Mark");
        a.add("Joan");
        a.add("Lori");
        a.add("Kym");
        a.add("Jake");
        a.add("Zech");
        a.add("Manny");
        return a.size();
    }

    static void SetAcctNums (int iTot, int[] iNum){

        // populate account number array starting at 100
        int incNums = 100;
        // example of using for each
        for (int a: iNum) {
            incNums++;
            a = incNums;
        } // end of for each
    } // end SetAcctNum

// Save Example: SetAcctBal worked in previous version to initialize balance array to default value
//  then changed program to use BankAcct.Deposit method above in main
// Wanted to pass Object to this method and call BankAcct.Deposit from within it-could not figure it out
//
//      static void SetAcctBal (int iTot, double[] dArr, double dBal){
//
//        // populate balance array with initial value
//        for (int i = 0; i < iTot - 1; i++) {
//            dArr[i] = dBal;
//        } // end of for i
//    } // end SetAcctBal


} // end main class