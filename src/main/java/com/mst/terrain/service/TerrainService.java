package com.mst.terrain.service;

import com.mst.terrain.bean.TaxTnb;
import com.mst.terrain.bean.Terrain;

import java.util.List;

public interface TerrainService {

    public void save(Terrain terrain);
    public List<Terrain> findAll();
}
