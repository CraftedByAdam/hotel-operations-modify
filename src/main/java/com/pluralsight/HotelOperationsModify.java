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

        System.out.println("------------------------------------------\n");

        Employee employee1 = new Employee(1, "Joe", "Tech", 27.0, 0);

        employee1.punchIn(10);
        employee1.punchOut(14);
        System.out.println("test hours worked: " + employee1.getHoursWorked());
        System.out.println("test total pay: " + employee1.getTotalPay());


    }
}
