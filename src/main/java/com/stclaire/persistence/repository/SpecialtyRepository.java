package com.stclaire.persistence.repository;

import com.stclaire.domain.model.Medical_Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialtyRepository extends JpaRepository<Medical_Specialty, String>{
}
