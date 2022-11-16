package com.mst.terrain.controller;

import com.mst.terrain.bean.TaxTnb;
import com.mst.terrain.service.TaxTnbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/taxTnb")
public class TaxTnbController {
    @Autowired
    private TaxTnbService taxTnbService;
    @PostMapping("/")
    public void save(@RequestBody TaxTnb taxTnb) {
        taxTnbService.save(taxTnb);
    }
    @GetMapping("/")
    public List<TaxTnb> findAll() {
        return taxTnbService.findAll();
    }
}
