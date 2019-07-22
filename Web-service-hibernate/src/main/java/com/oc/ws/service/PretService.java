package com.oc.ws.service;

import com.oc.ws.entity.Pret;

import java.util.List;

public interface PretService {

    void add(Pret pret);

    List<Pret> listPrets();

    Pret trouverPret(String titrePret);
}
