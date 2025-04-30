package fineAssessment;

import trafficRecord.TrafficRecord;

public class FineAssessment extends TrafficRecord {
    @Override
    public void recordViolation() {

    }

    @Override
    public void assessFine() {
        /* Determines the fine amount based on the violation type */
        try {
            switch (getViolationType().toUpperCase()) {
                case "SPEEDING":
                    this.setFineAmount(50000);
                    break;
                case "RED_LIGHT":
                    this.setFineAmount(80000);
                    break;
                case "NO_HELMET":
                    this.setFineAmount(30000);
                    break;
                case "DUI":
                    this.setFineAmount(150000);
                    break;
                default:
                    System.out.println("Error: Invalid violation type.");
                    return;
            }
            System.out.println("Fine assessed successfully:");
            System.out.println("Driver Name: " + getDriverName());
            System.out.println("Driver ID: " + getDriverId());
            System.out.println("Vehicle Plate: " + getVehiclePlate());
            System.out.println("Violation Type: " + getViolationType());
            System.out.println("Fine Amount: " + getFineAmount() + " RWF");
        } catch (Exception e) {
            System.out.println("Error assessing fine: " + e.getMessage());
        }
    }

    @Override
    public void processPayment() {
        // Not implemented in this class
    }
}
