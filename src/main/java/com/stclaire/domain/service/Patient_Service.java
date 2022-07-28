package com.stclaire.domain.service;

import com.stclaire.domain.dto.PatientDTO;
import com.stclaire.domain.model.Patient;
import com.stclaire.persistence.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Patient_Service {
    @Autowired
    private PatientRepository patientRepository;

    private PatientDTO convertEntityToDto(Patient patient){
        PatientDTO patient_DTO = new PatientDTO();
        patient_DTO.setIdentification_number(patient.getIdentification_number());
        patient_DTO.setName(patient.getName());
        patient_DTO.setDates_of_appointments(patient.getDates_of_appointments());
        patient_DTO.setNumber_of_appointments(patient.getNumber_of_appointments());

        return patient_DTO;
    }

}
