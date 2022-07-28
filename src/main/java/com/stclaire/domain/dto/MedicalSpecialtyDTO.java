package com.stclaire.domain.dto;

import com.stclaire.domain.model.Patient;
import lombok.Data;

import java.util.Set;

@Data
public class MedicalSpecialtyDTO {
    private String specialtyName;
    private String name;
    private String physicianInCharge;
    private Set<Patient> patients;

}
