package com.crud.clinic;

import com.crud.clinic.doctor.domain.DoctorDto;
import com.crud.clinic.patient.domain.PatientDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClinicApplication {

	public static void main(String[] args) { SpringApplication.run(ClinicApplication.class, args); }

}
