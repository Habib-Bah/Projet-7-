package com.oc.ws.service;


import com.oc.ws.dao.LivreDao;
import com.oc.ws.dao.ReservationDao;
import com.oc.ws.entity.Livre;
import com.oc.ws.entity.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class ReservationServiceImp implements ReservationService {


    @Autowired
    private ReservationDao reservationDao;
    @Transactional
    public void add(Reservation reservation) {
        reservationDao.add(reservation);
    }
    @Transactional
    public void delete(Reservation reservation) {
        reservationDao.delete(reservation);
    }
    @Transactional(readOnly = true)
    public List<Reservation> lisrReservations() {
        return reservationDao.listReservations();
    }
    @Transactional(readOnly = true)
    public List<Reservation> listReservationsUser(String email) {
        return reservationDao.listReservationsUser(email);
    }
    @Transactional(readOnly = true)
    public Reservation retour(String email, String titrelivre) {
        List<Reservation> reservations = reservationDao.listReservationsUser(email, titrelivre);

        if(reservations != null && !reservations.isEmpty()){
            Reservation reservation = reservations.get(0);
            if (email.equalsIgnoreCase(reservation.getEmail()) && titrelivre.equalsIgnoreCase(reservation.getTitrelivre())){
                return reservation;
            }
        }

        return null;
    }

}
