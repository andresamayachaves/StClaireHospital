package com.stclaire.domain.service;

import com.stclaire.domain.dto.MedicalSpecialtyDTO;
import com.stclaire.domain.dto.PatientDTO;
import com.stclaire.domain.model.AttributeCategory;
import com.stclaire.domain.model.MedicalSpecialty;
import com.stclaire.persistence.repository.PatientRepository;
import com.stclaire.persistence.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpecialtyService {

    @Autowired
    private SpecialtyRepository specialtyRepository;
    private PatientRepository patientRepository;

    public List<PatientDTO> getAllPatientsInSpecialty(){
        return patientRepository.findAll().stream().
                map(PatientService::convertEntityToDto).collect(Collectors.toList());
    }

    private MedicalSpecialtyDTO convertEntityToDto(MedicalSpecialty specialty){
        MedicalSpecialtyDTO specialty_DTO = new MedicalSpecialtyDTO();
        specialty_DTO.setSpecialtyName(specialty.getSpecialtyName());
        specialty_DTO.setPhysicianInCharge(specialty.getPhysicianInCharge());
        specialty_DTO.setPatients(specialty.getPatients());

        return specialty_DTO;
    }
/*
   public void setName(String name) {        //name comes from de Front-end
        Specialty_Service.verifyLimits(AttributeCategory.SPECIALTY_NAME, name);
        this.name = name;
    }*/

    //------------------------------------

    public static void verifyLimits(AttributeCategory category, String input) {
        boolean inLimits = false;
        if (category == AttributeCategory.PERSON_NAME) {
            if(isBetween(input.length(), 10, 45)) inLimits = true;

        } else if (category == AttributeCategory.SPECIALTY_NAME) {
            if(isBetween(input.length(), 5, 100)) inLimits = true;
        }
        else if(category == AttributeCategory.AGE && isInteger(input)){
            if(Integer.parseInt(input)>0) inLimits = true;
        }
    }

    private static boolean isBetween(int verify, int lowerLimit, int upperLimit){
        boolean ans = false;
        if(verify>=lowerLimit && verify<=upperLimit) ans = true;
        return ans;
    }

    public static boolean isInteger(String strNum) {
        boolean ans = true;

        if (strNum == null) ans = false;

        try {
            Integer i = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            ans = false;
        }
        return ans;
    }

}
