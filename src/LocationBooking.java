import java.util.Date;

/**
 * A LocationBooking is a booking for a fixed location.
 *
 * @author Janos Nagy
 */
public abstract class LocationBooking extends Booking {

    /** The name of location for which the booking was made. Non-null. */
    private String location;

    /**
     * Constructs a new Booking with a name, a date and a location.
     *
     * @param name the name for which the booking was made; must not be null; accessed from Booking.
     * @param date the point in time for which the booking was made;
     *  must not be null and must not be in the past; accessed from Booking.
     * @param location the name of location for which the booking was made; must not be null.
     */
    public LocationBooking(String name, Date date, String location){
        super(name,date);

        if (location == null) {
            throw new IllegalArgumentException("location must not be null!");
        }
        this.location = location;
    }

    /**
     * @return the name for which the booking was made; must not be null.
     */
    public String getName(){
        return super.getName();
    }

    /**
     * @return the point in time for which the booking was made;
     *  must not be null and must not be in the past.
     */
    public Date getDate(){
        return super.getDate();
    }

    /**
     * @return the name of location for which the booking was made; must not be null.
     */
    public String getLocation(){
        return this.location;
    }
}
