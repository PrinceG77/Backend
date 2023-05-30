package com.project.BackendV3.service;

import com.project.BackendV3.Dao.EvenementDao;
import com.project.BackendV3.Dao.InformationsCentreDao;
import com.project.BackendV3.bean.Evenement;
import com.project.BackendV3.bean.InformationsCentre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvenementService {
    @Autowired
    private EvenementDao evenementDao;

    public List<Evenement> findAll() {
        return evenementDao.findAll();
    }

    public String save(Evenement evenement) {

        evenementDao.save(evenement);
             return "event added successfully !";

    }

    public Evenement update(Evenement evenement)
    {
        return evenementDao.save(evenement);
    }

    public Optional<Evenement> findById(Long aLong) {
        return evenementDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        evenementDao.deleteById(aLong);
    }
}
