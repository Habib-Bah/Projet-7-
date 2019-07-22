package com.oc.ws.dao;

import com.oc.ws.entity.Reservation;

import java.util.List;

public interface ReservationDao {
   void add(Reservation reservation);
   void delete(Reservation reservation);
   List<Reservation> listReservations();
   List<Reservation> listReservationsUser(String email);
   List<Reservation> listReservationsUser(String email, String titreLivre);
}
