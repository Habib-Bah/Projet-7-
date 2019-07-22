package com.oc.ws.service;

import com.oc.ws.entity.Utilisateur;

import java.util.List;

public interface UtilisateurService {

    void add(Utilisateur utilisateur);

    List<Utilisateur> listUtilisateurs();

    Utilisateur connexion(String email, String motdepasse);
}
