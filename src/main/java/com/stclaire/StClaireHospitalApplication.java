package com.stclaire;

import com.stclaire.domain.model.MedicalSpecialty;
import com.stclaire.domain.model.PatientRegistry;
import com.stclaire.persistence.repository.PatientRepository;
import com.stclaire.persistence.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@SpringBootApplication
@RestController
public class StClaireHospitalApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(StClaireHospitalApplication.class, args);
		System.out.println("Hello World");
		hello();

	}
	@GetMapping
	public static String hello(){return "Running in LocalHost. :D";}


	@Autowired
	private SpecialtyRepository specialtyRepository;

	@Autowired
	private PatientRepository patientRepository;



	@Override
	public void run(String... args) throws Exception {

		PatientRegistry patient1 = new PatientRegistry();
		patient1.setIdentification_number(100000000);
		patient1.setName("Travis Cornell");
		patient1.setAge(30);
		//patient1.setDates_of_appointments(List.of("Not a Date"));

		PatientRegistry patient2 = new PatientRegistry();
		patient2.setIdentification_number(100000001);
		patient2.setName("Mike Lander");
		patient2.setAge(10);
		//patient2.setDates_of_appointments(List.of("Not a Date"));

		MedicalSpecialty specialty1 = new MedicalSpecialty();
		specialty1.setSpecialtyName("General Medicine");
		specialty1.setPhysicianInCharge("Carl Huge");
		specialty1.setPatientRegistry(patient1);
		specialty1.setPatientRegistry(patient2);


	}
}
