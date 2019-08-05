package com.oc.ws.dao;

import com.oc.ws.entity.Reservation;
import com.oc.ws.entity.Utilisateur;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class UtilisateurDaoImp implements UtilisateurDao {

   @PersistenceContext
   private EntityManager em;

   @Override
   public void add(Utilisateur utilisateur) {
      em.persist(utilisateur);
   }

   @Override
   public List<Utilisateur> listUtilisateurs() {
      CriteriaQuery<Utilisateur> criteriaQuery = em.getCriteriaBuilder().createQuery(Utilisateur.class);
      @SuppressWarnings("unused")
      Root<Utilisateur> root = criteriaQuery.from(Utilisateur.class);
      return em.createQuery(criteriaQuery).getResultList();
   }

   @Override
   public Utilisateur connexion(String email, String motdepasse) {
      String sql = "select * from utilisateur where email='"+email+"' and motdepasse='"+motdepasse+"'";
      CriteriaQuery<Utilisateur> criteriaQuery = em.getCriteriaBuilder().createQuery(Utilisateur.class);
      @SuppressWarnings("unused")
      Root<Utilisateur> root = criteriaQuery.from(Utilisateur.class);
      return (Utilisateur) em.createNativeQuery(sql, Utilisateur.class).getSingleResult();
	   
	  /* Utilisateur u = new Utilisateur();
	   u.setEmail("emailtest");
	   u.setMotdepasse("1111");
	   u.setId(100);
	   u.setNom("uTest");
	   
	   return u;
	   
	   */
   }

}