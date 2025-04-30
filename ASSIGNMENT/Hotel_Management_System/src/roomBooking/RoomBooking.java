package roomBooking;

import hotelService.HotelService;

public class RoomBooking extends HotelService {
    // Constructor
    public RoomBooking(String guestName, String guestId, String roomType, int stayDays, String roomStatus) {
        super(guestName, guestId, roomType, stayDays, roomStatus);
    }

    @Override
    public void bookRoom() {
        /* Allows booking only if stayDays is between 1 and 30.
           Verifies roomStatus == "AVAILABLE" before confirming a booking. */
        try {
            if (getStayDays() >= 1 && getStayDays() <= 30 && getRoomStatus().equals("AVAILABLE")) {
                setRoomStatus("OCCUPIED");
                System.out.println("Booking successful! Valet will show you to your room.");
            } else {
                System.out.println("ROOM NOT AVAILABLE or invalid stay duration.");
            }
        } catch (Exception e) {
            System.out.println("ERROR: Number of days should be between 1 and 30 for room booking.");
        }
    }

    @Override
    public void checkoutGuest() {

    }

    @Override
    public void generateBill() {

    }
}
