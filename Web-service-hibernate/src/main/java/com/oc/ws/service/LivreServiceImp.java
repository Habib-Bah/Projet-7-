package com.oc.ws.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oc.ws.dao.LivreDao;
import com.oc.ws.entity.Livre;


@Service
public class LivreServiceImp implements LivreService {


    @Autowired
    private LivreDao livreDao;
    @Transactional
    public void add(Livre livre) {
        livreDao.add(livre);
    }
   
}
