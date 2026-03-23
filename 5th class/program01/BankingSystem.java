// 1. Custom Exception for Invalid Transaction
// Problem Statement:
// Design a Java program to simulate a simple banking system. You are given a list of transactions where each transaction contains:
// •	accountBalance 
// •	withdrawAmount 
// If the withdrawAmount is greater than the accountBalance, throw a custom exception called InsufficientBalanceException.
// Process all transactions and:
// •	Print "Transaction Successful" if withdrawal is valid 
// •	Catch the exception and print "Insufficient Balance" 
// Constraints:
// •	Number of transactions ≤ 10⁴ 
// •	Balance and withdrawal amounts are non-negative integers 
// Concepts Used:
// Custom Exception, try-catch, exception propagation

import java.util.*;

// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankingSystem {

    public static void withdraw(int balance, int withdrawAmount) throws InsufficientBalanceException {
        if (withdrawAmount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        } else {
            System.out.println("Transaction Successful");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 // Number of transactions
        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nTransaction " + (i + 1));

            System.out.print("Enter account balance: ");
            int balance = sc.nextInt();

            System.out.print("Enter withdraw amount: ");
            int withdrawAmount = sc.nextInt();

            try {
                withdraw(balance, withdrawAmount);
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}