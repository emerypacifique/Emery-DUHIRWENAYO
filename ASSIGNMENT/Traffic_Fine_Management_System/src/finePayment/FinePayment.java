package finePayment;

import trafficRecord.TrafficRecord;

public class FinePayment extends TrafficRecord {
    @Override
    public void recordViolation() {

    }

    @Override
    public void assessFine() {

    }

    @Override
    public void processPayment() {
        /* Allows payment only if paymentStatus == "UNPAID". */
        try {
            if (this.getPaymentStatus().equalsIgnoreCase("UNPAID")) {
                this.setPaymentStatus("PAID"); // Update payment status to PAID
                System.out.println("Payment processed successfully:");
                System.out.println("Driver Name: " + this.getDriverName());
                System.out.println("Driver ID: " + this.getDriverId());
                System.out.println("Vehicle Plate: " + this.getVehiclePlate());
                System.out.println("Fine Amount: " + this.getFineAmount() + " RWF");
                System.out.println("Payment Status: " + this.getPaymentStatus());
            } else if (this.getPaymentStatus().equalsIgnoreCase("PAID")) {
                System.out.println("Error: Fine is already paid.");
            }
        } catch (Exception e) {
            System.out.println("Error processing payment: " + e.getMessage());
        }
    }
}
