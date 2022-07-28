package com.stclaire.domain.controller;

import com.stclaire.domain.dto.PatientDTO;
import com.stclaire.domain.service.Specialty_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpecialtyController {

    @Autowired
    private Specialty_Service specialtyService;

    @GetMapping("/specialty-patients")
    public List<PatientDTO> getAllPatients() {
        return Specialty_Service.getAllPatients();
    }
}
