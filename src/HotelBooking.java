import java.util.Date;

/**
 * A HotelBooking is a LocationBooking with a fixed total price, a number of
 * booked single rooms, and a number of booked double rooms.
 *
 * @author Janos Nagy
 */
public class HotelBooking extends LocationBooking implements HasFixedPrice {

    /** The total price in pence for the booking. */
    private int totalPriceInPence;

    /** The number of single rooms, must be at least 0. */
    private int singleRooms;

    /** The number of double rooms, must be at least 0. */
    private int doubleRooms;

    /**
     * Constructs a new HotelBooking according to the parameters.
     * Note that at least one room must be booked.
     *
     * @param name the name for which the booking was made; must not be null
     * @param date the point in time for which the booking was made; must not be null
     *  and must not be in the past
     * @param location the address of the hotel; must not be null
     * @param totalPriceInPence the total price in pence for the booking
     * @param singleRooms the number of single rooms, must be at least 0
     * @param doubleRooms the number of double rooms, must be at least 0
     */
    public HotelBooking(String name, Date date, String location, int totalPriceInPence, int singleRooms, int doubleRooms) {
        super(name,date,location);

        if (singleRooms < 0) {
            throw new IllegalArgumentException("Expected at least 0 singleRooms, found: " + singleRooms);
        }
        if (doubleRooms < 0) {
            throw new IllegalArgumentException("Expected at least 0 doubleRooms, found:" + doubleRooms);
        }
        if (doubleRooms + singleRooms <= 0) {
            throw new IllegalArgumentException("number of rooms must be at least 1!");
        }
        this.totalPriceInPence = totalPriceInPence;
        this.singleRooms = singleRooms;
        this.doubleRooms = doubleRooms;
    }

    /**
     * @return the number of single rooms; must be at least 0.
     */
    public int getSingleRooms(){
        return this.singleRooms;
    }

    /**
     * @return the number of double rooms; must be at least 0.
     */
    public int getDoubleRooms(){
        return this.doubleRooms;
    }

    @Override
    public int getNumberOfPersons(){
        if (this.singleRooms + this.doubleRooms * 2 < 1) {
            throw new IllegalArgumentException(" At least 1 room must be booked, found: " + this.singleRooms + this.doubleRooms * 2);
        }
        return this.singleRooms + this.doubleRooms * 2;
    }

    /**
     * @return the total price in pence for the booking; implemented from HasFixedPrice
     */
    public int getFixedPriceInPence(){
        return this.totalPriceInPence;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLocation: " + this.getLocation()
                + "\nPrice: " + this.getFormattedPrice()
                + "\nSingle rooms: " + this.getSingleRooms()
                + "\nDouble rooms: " + this.getDoubleRooms();
    }
}

