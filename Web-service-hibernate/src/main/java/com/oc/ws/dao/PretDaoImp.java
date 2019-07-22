package com.oc.ws.dao;

import com.oc.ws.entity.Pret;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class PretDaoImp implements PretDao {

   @PersistenceContext
   private EntityManager em;

   @Override
   public void add(Pret Pret) {
      em.persist(Pret);
   }

   @Override
   public List<Pret> listPrets() {
      CriteriaQuery<Pret> criteriaQuery = em.getCriteriaBuilder().createQuery(Pret.class);
      @SuppressWarnings("unused")
      Root<Pret> root = criteriaQuery.from(Pret.class);
      return em.createQuery(criteriaQuery).getResultList();
   }

   @Override
   public List<Pret> trouverPret(String titrePret) {

      String sql = "select * from Pret where titrePret = '" + titrePret + "'";
      CriteriaQuery<Pret> criteriaQuery = em.getCriteriaBuilder().createQuery(Pret.class);
      @SuppressWarnings("unused")
      Root<Pret> root = criteriaQuery.from(Pret.class);
      return em.createNativeQuery(sql, Pret.class).getResultList();
   }

}