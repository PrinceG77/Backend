package com.project.BackendV3.service;

import com.project.BackendV3.Dao.ActiviteDao;
import com.project.BackendV3.Dao.DonDao;
import com.project.BackendV3.bean.Activite;
import com.project.BackendV3.bean.Don;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonService {
    @Autowired
    private DonDao donDao;

    public List<Don> findAll() {
        return donDao.findAll();
    }

    public String save(Don don) {

              donDao.save(don);
             return "service added successfully !";

    }

    public Don update(Don don)
    {
        return donDao.save(don);
    }

    public Optional<Don> findById(Long aLong) {
        return donDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        donDao.deleteById(aLong);
    }
}
