package com.aca;

import java.time.LocalDateTime;
import java.util.List;

public class HotelBookin implements HotelBookingService {

    @Override
    public void makeReservation(Reservation reservation) {
        Room room = reservation.getRoom();
        List<Reservation> resCatalog = room.getCatalog();
        // if available make a reservation
        resCatalog.add(reservation);
    }


    @Override
    public void cancelReservation(Room room) {

    }

    @Override
    public void checkIn() {

    }

    @Override
    public void checkOut() {

    }
}
