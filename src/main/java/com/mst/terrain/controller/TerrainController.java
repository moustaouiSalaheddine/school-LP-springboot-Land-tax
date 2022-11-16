package com.mst.terrain.controller;

import com.mst.terrain.bean.Terrain;
import com.mst.terrain.service.TerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/terrain")
public class TerrainController {
    @Autowired
    private TerrainService terrainService;
    @PostMapping("/")
    public void save(@RequestBody Terrain terrain) {
        terrainService.save(terrain);
    }
    @GetMapping("/")
    public List<Terrain> findAll() {
        return terrainService.findAll();
    }
}
