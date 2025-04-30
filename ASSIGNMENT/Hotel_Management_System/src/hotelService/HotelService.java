package hotelService;

public abstract class HotelService {
    protected String guestName;
    protected String guestId;
    protected String roomType;
    protected int  stayDays;
    protected String roomStatus;
    /* */
    //getters and setters + constructor


    public HotelService(String guestName, String guestId, String roomType,
                        int stayDays, String roomStatus) {
        this.guestName = guestName;
        this.guestId = guestId;
        this.roomType = roomType;
        this.stayDays = stayDays;
        this.roomStatus = roomStatus;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getStayDays() {
        return stayDays;
    }

    public void setStayDays(int stayDays) {
        this.stayDays = stayDays;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public boolean setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
        return false;
    }

    public abstract void bookRoom();
    public abstract void checkoutGuest();
    public abstract void generateBill();

}
