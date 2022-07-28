package com.stclaire.persistence.repository;

import com.stclaire.domain.model.MedicalSpecialty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialtyRepository extends JpaRepository<MedicalSpecialty, String>{
    //Arrays findAllPatients();  //TODO check type and method
}
