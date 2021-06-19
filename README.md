# Hotel_Booking_System

#### What is this project about?

This repository contains a course work assignment that I completed in 2019.
This project is about contributing to the developement of an extensible object-oriented data structure
for managing bookings for hotels, restaurants, and rickshaw taxis. 

## What was given?

Here part of the code, including an inheritance hierarchy below, is already given.
![hotel_inheritance_hierarchy](https://user-images.githubusercontent.com/38473664/122656981-50081900-d157-11eb-87ec-d2a1c0cb7ecb.png)

The classes that I was not allowed to modify at all that is, the code that I wrote in the other classes should work
with the original classes:

##### public abstract class Booking  
The abstract class Booking provides the basis of our inheritance hierarchy. Every object of
class Booking (and hence its subclasses) stores information about the name for which the 2
booking was made and the point in time for which the booking was made. We can query a
booking for this information. Moreover, we can query a booking for the number of persons
for whom the booking was made.  
##### public interface HasFixedPrice  
Classes implementing this interface provide methods that returns a fixed price as an int
in pence or as a formatted string. This interface also provides convenience functionality to
generate a string representation from an amount of money given in pence.  
##### public class Coursework2Main  
This class makes use
of some of the desired functionalities of our data structure in its main method.  

## What was my task?

I was required to implement the following classes:  

public class RickshawBooking extends Booking  
public class HotelBooking extends LocationBooking implements HasFixedPrice  
public class RestaurantBooking extends LocationBooking  
public class FixedPriceRestaurantBooking extends LocationBooking implements HasFixedPrice  







