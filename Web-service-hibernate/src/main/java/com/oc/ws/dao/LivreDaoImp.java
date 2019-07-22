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
public class LivreDaoImp implements LivreDao {

   @PersistenceContext
   private EntityManager em;

   @Override
   public void add(Livre livre) {
      em.persist(livre);
   }

   @Override
   public List<Livre> listLivres() {
      CriteriaQuery<Livre> criteriaQuery = em.getCriteriaBuilder().createQuery(Livre.class);
      @SuppressWarnings("unused")
      Root<Livre> root = criteriaQuery.from(Livre.class);
      return em.createQuery(criteriaQuery).getResultList();
   }

   @Override
   public List<Livre> trouverlivre(String titrelivre) {

      String sql = "select * from livre where titrelivre = '" + titrelivre + "'";
      CriteriaQuery<Livre> criteriaQuery = em.getCriteriaBuilder().createQuery(Livre.class);
      @SuppressWarnings("unused")
      Root<Livre> root = criteriaQuery.from(Livre.class);
      return em.createNativeQuery(sql, Livre.class).getResultList();
   }

}