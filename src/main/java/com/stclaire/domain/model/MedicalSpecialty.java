package com.stclaire.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "specialty")
public class MedicalSpecialty {

    @Id
    private String specialtyName;    //updatable max 100char min 5char,

    @Column(name = "physicianInCharge")
    private String physicianInCharge; //updatable max 45 char min 10,

    @Column(name = "patients")
    private Set<Patient> patients;
}
