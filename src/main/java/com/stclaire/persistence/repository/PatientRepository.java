package com.stclaire.persistence.repository;

import com.stclaire.domain.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
