package guestCheckout;

import hotelService.HotelService;

public class GuestCheckout extends HotelService {
    // Constructor
    public GuestCheckout(String guestName, String guestId, String roomType, int stayDays, String roomStatus) {
        super(guestName, guestId, roomType, stayDays, roomStatus);
    }

    @Override
    public void bookRoom() {

    }

    @Override
    public void checkoutGuest() {
        /* Processes guest checkout only if the room is currently "OCCUPIED".
           Changes roomStatus to "AVAILABLE" after checkout. */
        try {
            if (getRoomStatus().equals("OCCUPIED")) {
                setRoomStatus("AVAILABLE");
                System.out.println("Checkout successful! Room is now available for booking.");
            } else {
                System.out.println("Room is already available. Cannot checkout.");
            }
        } catch (Exception e) {
            System.out.println("ERROR: Can't checkout room.");
        }
    }

    @Override
    public void generateBill() {

    }
}
