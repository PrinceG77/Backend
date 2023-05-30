package com.project.BackendV3.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormulaireInscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDateTime dateNaissance;
    private  String adresse;
    private  String contact;
    private  String typeHandicap;
    private  String besoins;
    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
    private  LocalDateTime dateSoumission;

    private  Boolean isProcessed = false;
    private  Boolean isValidated = false;

}
