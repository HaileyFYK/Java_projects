/**
 * Author: Hailey Kuo
 * Date: 9/22/2026
 * A This program simulates a simple banking system where a user can deposit and withdraw money from their account. The program prompts the user for their name, initial balance, deposit amount, and withdrawal amount, and then calculates and displays the ending balance after the transactions.
 */

import java.util.Scanner;

public class BankingRunning
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.print("Enter deposit amount: ");
        double deposit = in.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double withdrawal = in.nextDouble();

        Banking account = new Banking();

        account.Name(name);
        account.deposit_method(deposit);
        account.withdraw_method(withdrawal);

        System.out.println(" ");
        System.out.println("Name: " + account.getName());
        System.out.println("Beginning balance: 0.0");
        System.out.println("Deposit amount: " + deposit);
        System.out.println("Withdrawal amount: " + withdrawal);
        account.print_Ending_Balance();

        in.close();
    }
}