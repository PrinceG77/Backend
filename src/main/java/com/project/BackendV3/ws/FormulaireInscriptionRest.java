package com.project.BackendV3.ws;

import com.project.BackendV3.bean.Activite;
import com.project.BackendV3.bean.FormulaireInscription;
import com.project.BackendV3.service.ActiviteService;
import com.project.BackendV3.service.FormulaireInscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/inscription-form")
public class FormulaireInscriptionRest {
    @Autowired
    private FormulaireInscriptionService formulaireInscriptionService;

    @GetMapping("/all")
    @PreAuthorize("hasAnyAuthority('ROLE_SECRETARIAT', 'ROLE_DIRECTEUR')")
    public List<FormulaireInscription> findAll() {
        return formulaireInscriptionService.findAll();
    }

    @GetMapping("/validated-forms")
    @PreAuthorize("hasAnyAuthority('ROLE_SECRETARIAT', 'ROLE_DIRECTEUR')")
    public List<FormulaireInscription> getValidatedForms() {
        return formulaireInscriptionService.getValidateForms();
    }

    @GetMapping("/unprocessed-forms")
    @PreAuthorize("hasAnyAuthority('ROLE_SECRETARIAT')")
    public List<FormulaireInscription> getNotProcessedForms() {
        return formulaireInscriptionService.getNotProcessedForms();
    }


    @GetMapping("/unprocessed-forms")
    @PreAuthorize("hasAnyAuthority('ROLE_SECRETARIAT', 'ROLE_DIRECTEUR')")
    public Optional<FormulaireInscription> findById(@PathVariable Long aLong) {
        return formulaireInscriptionService.findById(aLong);
    }

    @GetMapping("/validation-forms")
    @PreAuthorize("hasAnyAuthority('ROLE_SECRETARIAT', 'ROLE_DIRECTEUR')")
    public List<FormulaireInscription> getFormsForValidation() {
        return formulaireInscriptionService.getFormsForValidation();
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAnyAuthority('ROLE_SECRETARIAT', 'ROLE_DIRECTEUR')")
    public void deleteById(@PathVariable Long id) {
        formulaireInscriptionService.deleteById(id);
    }

    @PutMapping("/update")
    @PreAuthorize("hasAnyAuthority('ROLE_SECRETARIAT', 'ROLE_DIRECTEUR')")
    public FormulaireInscription update(@RequestBody FormulaireInscription formulaireInscription) {
        return formulaireInscriptionService.update(formulaireInscription);
    }

    @PostMapping("/add")
    @PreAuthorize("hasAnyAuthority('ROLE_SECRETARIAT', 'ROLE_DIRECTEUR')")
    public String save(@RequestBody FormulaireInscription formulaireInscription) {
        return formulaireInscriptionService.save(formulaireInscription);
    }
}
