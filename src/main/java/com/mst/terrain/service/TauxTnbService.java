package com.mst.terrain.service;

import com.mst.terrain.bean.Secteur;
import com.mst.terrain.bean.TauxTnb;

import java.util.List;

public interface TauxTnbService {

    public void save(TauxTnb tauxTnb);
    public List<TauxTnb> findAll();
}
