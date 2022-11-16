package com.mst.terrain.service;

import com.mst.terrain.bean.TauxTnb;
import com.mst.terrain.bean.TaxTnb;

import java.util.List;

public interface TaxTnbService {

    public void save(TaxTnb taxTnb);
    public List<TaxTnb> findAll();
}
