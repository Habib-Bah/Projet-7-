package com.oc.ws.dao;

import com.oc.ws.entity.Livre;

import java.util.List;

public interface LivreDao {
   void add(Livre livre);
   List<Livre> listLivres();

   List<Livre> trouverlivre(String titrelivre);
}
