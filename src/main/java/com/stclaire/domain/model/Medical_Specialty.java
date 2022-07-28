package com.stclaire.domain.model;

import java.util.Set;

public class Medical_Specialty {

    private String name;    //updatable max 100char min 5char,
    private String physicianInCharge; //updatable max 45 char min 10,
    private Set<Patient> patients;


}
