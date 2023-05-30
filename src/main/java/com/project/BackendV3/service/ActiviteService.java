package com.project.BackendV3.service;

import com.project.BackendV3.Dao.ActiviteDao;
import com.project.BackendV3.bean.Activite;
import com.project.BackendV3.bean.FormulaireInscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActiviteService {
    @Autowired
    private ActiviteDao activiteDao;

    public List<Activite> findAll() {
        return activiteDao.findAll();
    }

    public String save(Activite activite) {

             activiteDao.save(activite);
             return "service added successfully !";

    }

    public Activite update(Activite activite)
    {
        return activiteDao.save(activite);
    }

    public Optional<Activite> findById(Long aLong) {
        return activiteDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        activiteDao.deleteById(aLong);
    }
}
