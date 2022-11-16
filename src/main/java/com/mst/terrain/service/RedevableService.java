package com.mst.terrain.service;

import com.mst.terrain.bean.Quartier;
import com.mst.terrain.bean.Redevable;

import java.util.List;

public interface RedevableService {

    public void save(Redevable redevable);
    public List<Redevable> findAll();
}
