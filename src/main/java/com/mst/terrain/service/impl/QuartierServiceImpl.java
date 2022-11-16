package com.mst.terrain.service.impl;

import com.mst.terrain.bean.Categorie;
import com.mst.terrain.bean.Quartier;
import com.mst.terrain.dao.CategorieDao;
import com.mst.terrain.dao.QuartierDao;
import com.mst.terrain.service.CategorieService;
import com.mst.terrain.service.QuartierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuartierServiceImpl implements QuartierService {
   @Autowired
   private QuartierDao quartierDao;

    @Override
    public void save(Quartier quartier) {
        quartierDao.save(quartier);
    }

    @Override
    public List<Quartier> findAll() {
        return quartierDao.findAll();
    }
}
