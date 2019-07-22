package com.oc.ws.dao;

import com.oc.ws.entity.Pret;

import java.util.List;

public interface PretDao {
   void add(Pret pret);

   List<Pret> listPrets();

   List<Pret> trouverPret(String titrepret);
}
