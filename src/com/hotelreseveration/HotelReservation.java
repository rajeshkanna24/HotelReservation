package com.hotelreseveration;
import java.util.ArrayList;
import java.util.List;
public class HotelReservation {
    List<Hotel> hotels = new ArrayList<>();
    public void uc1_addHotel(String name, int rate) {
        Hotel hotel = new Hotel(name, rate);
        hotels.add(hotel);
    }

}
