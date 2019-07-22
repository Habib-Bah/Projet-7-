package com.oc.ws.service;

import com.oc.ws.entity.Reservation;

import java.util.List;

public interface ReservationService {

    void add(Reservation reservation);

    void delete(Reservation reservation);

    List<Reservation> lisrReservations();

    List<Reservation> listReservationsUser(String email);

    Reservation retour(String email, String titrelivre);
}
