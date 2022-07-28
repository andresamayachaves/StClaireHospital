package com.stclaire.domain.service;

import com.stclaire.domain.dto.MedicalSpecialtyDTO;
import com.stclaire.domain.dto.PatientDTO;
import com.stclaire.domain.model.AttributeCategory;
import com.stclaire.domain.model.Medical_Specialty;
import com.stclaire.domain.model.Patient;
import com.stclaire.persistence.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Specialty_Service {

    @Autowired
    private SpecialtyRepository specialtyRepository;

    public List<MedicalSpecialtyDTO> getAllPatients(){
        return specialtyRepository.findAll().stream().
                map(this::convertEntityToDto).collect(Collectors.toList());
    }

    private MedicalSpecialtyDTO convertEntityToDto(Medical_Specialty specialty){
        MedicalSpecialtyDTO specialty_DTO = new MedicalSpecialtyDTO();
        specialty_DTO.setSpecialtyName(specialty.);
        specialty_DTO.setPhysicianInCharge(specialty.getPhysicianInCharge());
        specialty_DTO.setPatients(specialty.getPatients());

        return specialty_DTO;
    }
/*
   public void setName(String name) {        //name comes from de Front-end
        Specialty_Service.verifyLimits(AttributeCategory.SPECIALTY_NAME, name);
        this.name = name;
    }*/

    }

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
