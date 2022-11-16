package com.mst.terrain.service.impl;

import com.mst.terrain.bean.TaxTnb;
import com.mst.terrain.dao.TaxTnbDao;
import com.mst.terrain.service.TaxTnbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxTnbServiceImpl implements TaxTnbService {
   @Autowired
   private TaxTnbDao taxTnbDao;

    @Override
    public void save(TaxTnb taxTnb) {
        taxTnbDao.save(taxTnb);
    }

    @Override
    public List<TaxTnb> findAll() {
        return taxTnbDao.findAll();
    }
}
