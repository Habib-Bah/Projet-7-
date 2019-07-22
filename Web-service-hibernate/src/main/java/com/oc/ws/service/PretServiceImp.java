package com.oc.ws.service;


import com.oc.ws.dao.PretDao;
import com.oc.ws.entity.Pret;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class PretServiceImp implements PretService {


    @Autowired
    private PretDao PretDao;
    @Transactional
    public void add(Pret Pret) {
        PretDao.add(Pret);
    }
    @Transactional(readOnly = true)
    public List<Pret> listPrets() {
        return PretDao.listPrets();
    }

    @Override
    public Pret trouverPret(String titrePret) {
        List<Pret> PretList = PretDao.trouverPret(titrePret);

        return null;
    }

}
