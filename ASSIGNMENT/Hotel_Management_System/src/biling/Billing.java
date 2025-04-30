package biling;

import hotelService.HotelService;

public class Billing extends HotelService {
    // Constructor
    public Billing(String guestName, String guestId, String roomType, int stayDays, String roomStatus) {
        super(guestName, guestId, roomType, stayDays, roomStatus);
    }

    @Override
    public void bookRoom() {

    }

    @Override
    public void checkoutGuest() {

    }

    @Override
    public void generateBill() {
        /* Calculates cost based on roomType and stayDays:
           "STANDARD" → 50,000 per night
           "DELUXE" → 80,000 per night
           "SUITE" → 120,000 per night */
        int costPerNight = 0;
        switch (getRoomType()) {
            case "STANDARD":
                costPerNight = 50000;
                break;
            case "DELUXE":
                costPerNight = 80000;
                break;
            case "SUITE":
                costPerNight = 120000;
                break;
            default:
                System.out.println("Error: Invalid room type.");
                return;
        }
        int totalCost = costPerNight * getStayDays();
        System.out.println("Billing Details:");
        System.out.println("Guest Name: " + getGuestName());
        System.out.println("Guest ID: " + getGuestId());
        System.out.println("Room Type: " + getRoomType());
        System.out.println("Days Stayed: " + getStayDays());
        System.out.println("Total Cost: " + totalCost + " RWF");
    }
}
