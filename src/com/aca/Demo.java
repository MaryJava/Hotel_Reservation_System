package com.aca;

public class Demo {

    public static void main(String[] args) {

        Guest guest = new Guest("Razmik", "Badalyan", "+374 77 11 11 11");
        System.out.println("Person wants to make a reservation");

        // create a room for reservation
        Room room = new Room(204, RoomType.FREE);

        // make a reservation
    }
}
