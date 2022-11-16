package com.mst.terrain.service.impl;

import com.mst.terrain.bean.Redevable;
import com.mst.terrain.dao.RedevableDao;
import com.mst.terrain.service.RedevableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedevableServiceImpl implements RedevableService {
   @Autowired
   private RedevableDao redevableDao;

    @Override
    public void save(Redevable redevable) {
        redevableDao.save(redevable);
    }

    @Override
    public List<Redevable> findAll() {
        return redevableDao.findAll();
    }
}
