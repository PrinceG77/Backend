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
public class InformationsCentre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private  String adresse;
    private  String situationSiege;
    private  String domaine;
    private  String telephone;

    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
    private  LocalDateTime dateCreation;
    private  Long capacite;
    private  String email;

    private  String typeHandicap;


}
