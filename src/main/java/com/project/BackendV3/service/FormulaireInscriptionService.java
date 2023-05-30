package com.project.BackendV3.service;

import com.project.BackendV3.Dao.ActiviteDao;
import com.project.BackendV3.Dao.FormulaireInscriptionDao;
import com.project.BackendV3.bean.Activite;
import com.project.BackendV3.bean.FormulaireInscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormulaireInscriptionService {
    @Autowired
    private FormulaireInscriptionDao formulaireInscriptionDao;

    public List<FormulaireInscription> findAll() {
        return formulaireInscriptionDao.findAll();
    }

    public List<FormulaireInscription> getValidateForms() {
        return formulaireInscriptionDao.findByIsValidatedTrue();
    }

    public List<FormulaireInscription> getNotProcessedForms() {
        return formulaireInscriptionDao.findByIsProcessedFalse();
    }

    public List<FormulaireInscription> getFormsForValidation() {
        return formulaireInscriptionDao.findByIsProcessedTrueAndIsValidatedFalse();
    }


    public Optional<FormulaireInscription> findById(Long aLong) {
        return formulaireInscriptionDao.findById(aLong);
    }
    public void deleteById(Long id) {
        formulaireInscriptionDao.deleteById(id);
    }
    public FormulaireInscription update(FormulaireInscription formulaireInscription)
    {
        return formulaireInscriptionDao.save(formulaireInscription);
    }
    public String save(FormulaireInscription formulaireInscription) {

        formulaireInscriptionDao.save(formulaireInscription);
             return "service added successfully !";

    }




}
