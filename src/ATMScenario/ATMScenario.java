package ATMScenario;

import java.util.Scanner;

public class ATMScenario {
    public void method1() {
        System.out.println("WELCOME TO THE ATM MACHINE");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter available balance: ");
        int availableBalance = scanner.nextInt();

        System.out.print("Enter requested amount: ");
        int requestedAmount = scanner.nextInt();

        try {
            if (requestedAmount > availableBalance) {
                throw new IllegalArgumentException("Insufficient funds.");
            } else {
                System.out.println("WITHDRAW THE " + requestedAmount + " BY CASH.");
                System.out.println("Remaining balance: " + (availableBalance - requestedAmount));
            }
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        ATMScenario atmScenario = new ATMScenario();
        atmScenario.method1();
    }
}


//ATM Cash Withdrawal
//Question: Imagine an ATM machine that dispenses cash. If the requested amount is greater than the available balance, it should throw an error.
//
//Clue:
//
//Use a try block to attempt the withdrawal.
//        Use throw to signal an insufficient balance.
//        Use catch to handle the exception and inform the user of the error.
