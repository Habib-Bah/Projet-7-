package com.oc.ws.dao;

import com.oc.ws.entity.Livre;
import com.oc.ws.entity.Reservation;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class ReservationDaoImp implements ReservationDao {

   @PersistenceContext
   private EntityManager em;

   @Override
   public void add(Reservation reservation) {
      em.persist(reservation);
   }

   @Override
   public void delete(Reservation reservation) {
      em.remove(reservation);
   }

   @Override
   public List<Reservation> listReservations() {
      CriteriaQuery<Reservation> criteriaQuery = em.getCriteriaBuilder().createQuery(Reservation.class);
      @SuppressWarnings("unused")
      Root<Reservation> root = criteriaQuery.from(Reservation.class);
      return em.createQuery(criteriaQuery).getResultList();
   }

   @Override
   public List<Reservation> listReservationsUser(String email) {

      String sql = "select * from reservation where email = '" + email + "'";
      CriteriaQuery<Reservation> criteriaQuery = em.getCriteriaBuilder().createQuery(Reservation.class);
      @SuppressWarnings("unused")
      Root<Reservation> root = criteriaQuery.from(Reservation.class);
      return em.createNativeQuery(sql, Reservation.class).getResultList();
   }

   @Override
   public List<Reservation> listReservationsUser(String email, String titreLivre) {

      String sql = "select * from reservation where email = '" + email + "' and titrelivre = '"+titreLivre+"'";
      CriteriaQuery<Reservation> criteriaQuery = em.getCriteriaBuilder().createQuery(Reservation.class);
      @SuppressWarnings("unused")
      Root<Reservation> root = criteriaQuery.from(Reservation.class);
      return em.createNativeQuery(sql, Reservation.class).getResultList();
   }

}