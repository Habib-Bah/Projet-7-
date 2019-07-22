package com.oc.ws.service;


import com.oc.ws.dao.UtilisateurDao;
import com.oc.ws.entity.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UtilisateurServiceImp implements UtilisateurService {


    @Autowired
    private UtilisateurDao UtilisateurDao;
    @Transactional
    public void add(Utilisateur utilisateur) {
        UtilisateurDao.add(utilisateur);
    }
    @Transactional(readOnly = true)
    public List<Utilisateur> listUtilisateurs() {
        return UtilisateurDao.listUtilisateurs();
    }

    @Override
    public Utilisateur connexion(String email, String motdepasse) {
        //return UtilisateurDao.connexion(email, motdepasse);
    	return UtilisateurDao.connexion(email, motdepasse);
    }

}