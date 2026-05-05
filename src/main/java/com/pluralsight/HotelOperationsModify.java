package com.pluralsight;

public class HotelOperationsModify {
    public static void main(String[] args) {

        Room room1 = new Room(1, 100);

        System.out.println("room 1: " + room1+ "\n");

        room1.checkIn();
        System.out.println("test: " + room1 + "\n");

        room1.checkOut();
        System.out.println("room 1: " + room1 + "\n");

        room1.cleanRoom();
        System.out.println("room 1: " + room1 + "\n");

    }
}
