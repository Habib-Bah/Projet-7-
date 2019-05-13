package com.opendevup.service;

import java.util.*;

import com.opendevup.metier.Livre;
import com.opendevup.repository.LivreRepository;



@javax.jws.WebService(name="BibliothequeWS")
public class WebService {

	LivreRepository livrerepository;
	
	public List <Livre> listelivre() {
		
		return livrerepository.findAll();
	}
	
	public Livre getLivre(String titre) {
		return livrerepository.fibdByTitre(titre);
	}
}
