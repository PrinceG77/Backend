package com.project.BackendV3.Dao;

import com.project.BackendV3.bean.Activite;
import com.project.BackendV3.bean.FormulaireInscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormulaireInscriptionDao extends JpaRepository<FormulaireInscription, Long> {

    public List<FormulaireInscription> findByIsValidatedTrue();
    public List<FormulaireInscription> findByIsProcessedFalse();
    public List<FormulaireInscription> findByIsProcessedTrueAndIsValidatedFalse();

}
