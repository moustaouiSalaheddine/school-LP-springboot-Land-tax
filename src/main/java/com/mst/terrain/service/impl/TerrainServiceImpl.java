package com.mst.terrain.service.impl;

import com.mst.terrain.bean.Terrain;
import com.mst.terrain.dao.TerrainDao;
import com.mst.terrain.service.TerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TerrainServiceImpl implements TerrainService {
   @Autowired
   private TerrainDao terrainDao;

    @Override
    public void save(Terrain terrain) {
        terrainDao.save(terrain);
    }

    @Override
    public List<Terrain> findAll() {
        return terrainDao.findAll();
    }
}
