package com.project.BackendV3.service;

import com.project.BackendV3.Dao.InformationsCentreDao;
import com.project.BackendV3.bean.InformationsCentre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InformationsCentreService {
    @Autowired
    private InformationsCentreDao informationsCentreDao;

    public List<InformationsCentre> findAll() {
        return informationsCentreDao.findAll();
    }

    public String save(InformationsCentre informationsCentre) {

        informationsCentreDao.save(informationsCentre);
             return "infos added successfully !";

    }

    public InformationsCentre update(InformationsCentre informationsCentre)
    {
        return informationsCentreDao.save(informationsCentre);
    }

    public Optional<InformationsCentre> findById(Long aLong) {
        return informationsCentreDao.findById(aLong);
    }

    public void deleteById(Long aLong) {
        informationsCentreDao.deleteById(aLong);
    }
}
