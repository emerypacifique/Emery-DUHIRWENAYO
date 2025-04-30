package mainMethod;

import biling.Billing;
import guestCheckout.GuestCheckout;
import roomBooking.RoomBooking;

import java.util.Scanner;

public class Main {
    /**/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("HOTEL MANAGEMENT SYSTEM");
        System.out.println("___________________________");
        System.out.println();
        System.out.println("1. Book Room");
        System.out.println("2. Checkout Guest");
        System.out.println("3. Generate Bill");
        System.out.println("4. Exit");

        int choice;
        do {
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            String guestName;
            String guestId;
            String roomType;
            int stayDays;
            String roomStatus = "AVAILABLE";

            switch (choice) {
                case 1:
                    System.out.println("Room Booking");
                    System.out.println("_______________");
                    System.out.println("Enter your names: ");
                    guestName = sc.nextLine();
                    System.out.println("Enter your ID: ");
                    guestId = sc.nextLine();
                    System.out.println("Enter your room type (STANDARD/DELUXE/SUITE): ");
                    roomType = sc.nextLine().toUpperCase();
                    System.out.println("Enter number of days to stay in the hotel: ");
                    stayDays = sc.nextInt();
                    sc.nextLine();


                    RoomBooking booking = new RoomBooking(guestName, guestId, roomType, stayDays, roomStatus);
                    booking.bookRoom();
                    break;

                case 2:
                    System.out.println("Guest Checkout");
                    System.out.println("_______________");
                    System.out.println("Enter your names: ");
                    guestName = sc.nextLine();
                    System.out.println("Enter your ID: ");
                    guestId = sc.nextLine();
                    System.out.println("Enter the room type you stayed in 'STANDARD' 'DELUXE' 'SUITE': ");
                    roomType = sc.nextLine().toUpperCase();

                    GuestCheckout checkout = new GuestCheckout(guestName, guestId, roomType, 0, "OCCUPIED");
                    checkout.checkoutGuest();
                    break;

                case 3:
                    System.out.println("Generating Bill");
                    System.out.println("_______________");
                    System.out.println("Enter your names: ");
                    guestName = sc.nextLine();
                    System.out.println("Enter your ID: ");
                    guestId = sc.nextLine();
                    System.out.println("Enter the room type you stayed in 'STANDARD' 'DELUXE' 'SUITE': ");
                    roomType = sc.nextLine().toUpperCase();
                    System.out.println("Enter number of days stayed in the hotel: ");
                    stayDays = sc.nextInt();
                    sc.nextLine(); // Consume newline


                    Billing billing = new Billing(guestName, guestId, roomType, stayDays, "OCCUPIED");
                    billing.generateBill();
                    break;

                case 4:
                    System.out.println("System Exit ");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
