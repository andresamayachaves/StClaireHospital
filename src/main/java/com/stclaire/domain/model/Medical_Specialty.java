package com.stclaire.domain.model;

import com.stclaire.domain.service.Specialty_Service;
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
@Table(name = "Specialty")
public class Medical_Specialty {

    @Id
    private String SpecialtyString;    //updatable max 100char min 5char,

    @Column(name = "name")
    private String physicianInCharge; //updatable max 45 char min 10,

    @Column(name = "name")
    private Set<Patient> patients;



    /*public void setPhysicianInCharge(String physicianInCharge) {
        this.physicianInCharge = physicianInCharge;*/
    }
}
