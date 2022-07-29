package com.stclaire.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.Fetch;
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

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "identification_number")
    private PatientRegistry patientRegistry;
}
