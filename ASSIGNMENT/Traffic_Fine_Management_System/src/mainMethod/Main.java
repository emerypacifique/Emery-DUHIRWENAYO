package mainMethod;

import fineAssessment.FineAssessment;
import finePayment.FinePayment;
import violationEntry.ViolationEntry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        String driverName;
        String driverID;
        String vehiclePlate;
        String violationType;

        while (!exit) {
            System.out.println("TRAFFIC FINE MANAGEMENT SYSTEM");
            System.out.println("_________________________________");
            System.out.println("1. Record Violation");
            System.out.println("2. Assess Fine");
            System.out.println("3. Process Payment");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Driver's name: ");
                     driverName = sc.nextLine();
                    System.out.println("Enter Driver's ID: ");
                     driverID = sc.nextLine();
                    System.out.println("Enter Vehicle plate number: ");
                     vehiclePlate = sc.nextLine();
                    System.out.println("Enter Driver's violation Type: ");
                     violationType = sc.nextLine();

                    // Calling the violation Entry Method
                    ViolationEntry entry = new ViolationEntry();
                    entry.setDriverName(driverName);
                    entry.setDriverId(driverID);
                    entry.setVehiclePlate(vehiclePlate);
                    entry.setViolationType(violationType);
                    entry.recordViolation();
                    break;

                case 2:
                    System.out.println("Enter Driver's name: ");
                    driverName = sc.nextLine();
                    System.out.println("Enter Driver's ID: ");
                    driverID = sc.nextLine();
                    System.out.println("Enter Vehicle plate number: ");
                    vehiclePlate = sc.nextLine();
                    System.out.println("Enter Driver's violation Type: ");
                    violationType = sc.nextLine();

                    // Calling the Fine Assessment method
                    FineAssessment fine = new FineAssessment();
                    fine.setDriverName(driverName);
                    fine.setDriverId(driverID);
                    fine.setVehiclePlate(vehiclePlate);
                    fine.setViolationType(violationType);
                    fine.assessFine();
                    break;

                case 3:
                    System.out.println("Enter Driver's name: ");
                    driverName = sc.nextLine();
                    System.out.println("Enter Driver's ID: ");
                    driverID = sc.nextLine();
                    System.out.println("Enter Vehicle plate number: ");
                    vehiclePlate = sc.nextLine();
                    System.out.println("Enter Fine Amount: ");
                    double fineAmount = sc.nextDouble();
                    sc.nextLine();

                    // Calling the fine payment
                    FinePayment payment = new FinePayment();
                    payment.setDriverName(driverName);
                    payment.setDriverId(driverID);
                    payment.setVehiclePlate(vehiclePlate);
                    payment.setFineAmount(fineAmount);
                    payment.setPaymentStatus("UNPAID");
                    payment.processPayment();
                    break;

                case 4:
                    System.out.println("Exiting the system. ");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
