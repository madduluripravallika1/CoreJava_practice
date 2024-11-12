package AgeVerificationforVoting;

import java.util.Scanner;

public class AgeVerificationforVoting {
    public void method1() {
        System.out.println("WELCOME TO THE VOTING REGISTRATION");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();

        try {
            if (age >= 18) {
                System.out.println("You are eligible for voting.");
            } else {
                // Throwing an exception when age is less than 18
                throw new IllegalArgumentException("You are not eligible for voting. Age must be 18 or above.");
            }
        } catch (IllegalArgumentException e) {
            // Directly handling the exception by printing the message
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        AgeVerificationforVoting ageVerificationforVoting = new AgeVerificationforVoting();
        ageVerificationforVoting.method1();
    }
}


//Age Verification for Voting
//Question: A system checks a user's age to verify if they are eligible to vote. If the age is below the minimum requirement, an error should be thrown.
//
//Clue:
//
//Use try to perform the age check.
//throw an exception if the age is below the required limit.
//catch the exception to notify the user of the eligibility requirement.
