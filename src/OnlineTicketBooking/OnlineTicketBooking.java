package OnlineTicketBooking;

import java.util.Scanner;

public class OnlineTicketBooking {

    public void method1() {
        System.out.println("WELCOME TO THE SHOW");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of available seats: ");
        int seatsAvailable = scanner.nextInt();

        System.out.print("Enter the number of seats you want to book: ");
        int seatsRequested = scanner.nextInt();

        try {
            if (seatsRequested > seatsAvailable) {
                throw new IllegalArgumentException("Not enough seats available.");
            } else {
                System.out.println("SEATS AVAILABLE AFTER BOOKING: " + (seatsAvailable - seatsRequested));
                System.out.println(" Continue the Process of Booking "+ seatsRequested +" You Can Book now !!!!!!!!!!!");
                System.out.println("PLEASE CONTINUE WITH YOUR BOOKING.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("SORRY, SEATS ARE FULL OR INSUFFICIENT. WE APOLOGIZE FOR THE INCONVENIENCE.");
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        OnlineTicketBooking onlineTicketBooking = new OnlineTicketBooking();
        onlineTicketBooking.method1();
    }
}


//Example: Online Ticket Booking
//Question: A user tries to book a ticket for a show. If the seats are already full, an error should be raised to indicate unavailability.
//
//        Clue:
//
//Use try to check seat availability before booking.
//Use throw to raise an exception if no seats are left.
//        catch the exception to notify the user about the unavailability.
