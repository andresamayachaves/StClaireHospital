package com.stclaire.domain.dto;

import lombok.Data;

/*import javax.persistence.Column;*/
import java.util.List;

@Data
public class PatientDTO {
    private long identification_number;
    private String name;
    private Integer age;
    private List<String> dates_of_appointments;
    private long number_of_appointments;

}
