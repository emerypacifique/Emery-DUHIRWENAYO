package violationEntry;

import trafficRecord.TrafficRecord;

public class ViolationEntry extends TrafficRecord {
    @Override
    public void recordViolation() {
        /*   Functionality:
        Accepts a traffic violation report for a given driver.
        Validates that violationType is one of the allowed types.
        Sets paymentStatus = "UNPAID" initially.
        Prints a confirmation with violation details. */
        try {
            if (getViolationType().equalsIgnoreCase("SPEEDING") ||
                getViolationType().equalsIgnoreCase("NO_HELMET") ||
                getViolationType().equalsIgnoreCase("DUI") ||
                getViolationType().equalsIgnoreCase("RED_LIGHT")) {
                
                this.setPaymentStatus("UNPAID"); // Set payment status to UNPAID
                System.out.println("Violation recorded successfully:");
                System.out.println("Driver Name: " + getDriverName());
                System.out.println("Driver ID: " + getDriverId());
                System.out.println("Vehicle Plate: " + getVehiclePlate());
                System.out.println("Violation Type: " + getViolationType());
                System.out.println("Payment Status: " + getPaymentStatus());
            } else {
                System.out.println("Error: Invalid violation type.");
            }
        } catch (Exception e) {
            System.out.println("Error recording violation: " + e.getMessage());
        }
    }

    @Override
    public void assessFine() {

    }

    @Override
    public void processPayment() {

    }
}
