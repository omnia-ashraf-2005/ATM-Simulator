/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atm;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class ATM {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int correctPIN=1234;
        int enteredPIN;
        int attempts=0;
        boolean loggedIn=false;
        double balance=2500.75;
        while(attempts<3 && !loggedIn){
            System.out.print("Enter your PIN");
            enteredPIN=input.nextInt();
            if(enteredPIN==correctPIN){
                loggedIn=true;
                System.out.println("login successful");
            }
            else{
                attempts++;
                System.out.println("incorrect PIN, Try again");
            }
            if(! loggedIn){
                System.out.println("Your account has been loaced");
            }
        }
        if (loggedIn) {

    int choice;

    do {

        System.out.println("========= ATM =========");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Show Account Status");
        System.out.println("5. Exit");
        System.out.println("=======================");

        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        switch(choice){
            case 1: System.out.println("your balance is: " + balance);
            break;
            case 2: System.out.print("enter deposit amount: ");
            double deposit=input.nextDouble();
            if(deposit>0){
                balance=balance+deposit;
                System.out.println("deposit successful");  
                System.out.println("new balance = "+ balance);
            }
            else{
                System.out.println("Invalid");
            }
            break;
            case 3:
        System.out.print("Enter withdrawal amount: ");
        double withdraw = input.nextDouble();

        if (withdraw > 0 && withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Withdrawal successful!");
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
        break;

    case 4:
        if (balance >= 5000) {
            System.out.println("VIP Customer");
        } else if (balance >= 1000) {
            System.out.println("Regular Customer");
        } else {
            System.out.println("Low Balance");
        }
        break;

    case 5:
        System.out.println("Thank you for using our ATM.");
        break;

    default:
        System.out.println("Invalid option.");

        }
    if(choice==5)
        break;

    } while (choice != 5);
}
    }
}
