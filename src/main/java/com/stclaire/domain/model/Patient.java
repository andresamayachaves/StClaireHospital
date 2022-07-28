package com.stclaire.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "registry")  //TODO verfy table name

public class Patient {
    /*@Id
    * @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private long identification_number;     //not updatable

    @Column(name = "name")
    private String name;                             //not updatable max 45 shr min 10 char

    @Column(name = "age")
    private Integer age;                              //[in years], not updatable, age>0
    private List<String> dates_of_appointments;
                                                                //the individual date can’t be updated,
    private long number_of_appointments; //Updatable

     //--- "NOTE: A baby un his/her first year must be registered with age = 1 year"
    //TODO {FirstName, LastName} instead of ''name'

}