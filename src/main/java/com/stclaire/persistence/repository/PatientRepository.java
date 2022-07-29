package com.stclaire.persistence.repository;

import com.stclaire.domain.model.PatientRegistry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientRegistry, Long> {

}
