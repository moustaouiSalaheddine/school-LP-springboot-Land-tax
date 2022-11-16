package com.mst.terrain.controller;

import com.mst.terrain.bean.Quartier;
import com.mst.terrain.service.QuartierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quartier")
public class QuartierController {
    @Autowired
    private QuartierService quartierService;
    @PostMapping("/")
    public void save(@RequestBody Quartier quartier) {
        quartierService.save(quartier);
    }
    @GetMapping("/")
    public List<Quartier> findAll() {
        return quartierService.findAll();
    }
}
