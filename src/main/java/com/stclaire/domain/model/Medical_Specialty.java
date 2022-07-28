package com.stclaire.domain.model;

import com.stclaire.domain.service.Specialty_Service;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Specialty")
public class Medical_Specialty {

    private String name;    //updatable max 100char min 5char,
    private String physicianInCharge; //updatable max 45 char min 10,
    private Set<Patient> patients;

    public void setName(String name) {        //name comes from de Front-end
        Specialty_Service.verifyLimits(AttributeCategory.SPECIALTY_NAME, name);
        this.name = name;
    }

    public void setPhysicianInCharge(String physicianInCharge) {
        this.physicianInCharge = physicianInCharge;
    }
}
