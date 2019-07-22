package com.oc.ws.dao;

import com.oc.ws.entity.Utilisateur;

import java.util.List;

public interface UtilisateurDao {
   void add(Utilisateur utilisateur);
   List<Utilisateur> listUtilisateurs();
   Utilisateur connexion(String email, String motdepasse);
}
