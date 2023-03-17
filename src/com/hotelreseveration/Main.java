package com.hotelreseveration;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System program");
        HotelReservation hotelReservationSystem = new HotelReservation();
        String[] names = {"LakeWood", "BridgeWood", "RidgeWood"};
        int[] rates = {110, 160, 220};
        for(int i = 0; i < names.length; i++) {
            hotelReservationSystem.uc1_addHotel(names[i], rates[i]);
        }
        System.out.println(hotelReservationSystem.hotels);
    }
}
