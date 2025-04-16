package com.example.activite3;

import com.example.activite3.entities.Patient;
import com.example.activite3.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Activite3Application implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;


    @Override
    public void run(String... args) throws Exception {
        Patient patient = new Patient(null, "Mohammed", new Date(), false, 23);
        patientRepository.save(patient);
        //builder
        patientRepository.save(patient);
        patientRepository.save(new Patient(null,"Hanane",new Date(),false, 4321));
        patientRepository.save(new Patient(null,"Imane",new Date(),true, 34));
    }

    public static void main(String[] args) {
        SpringApplication.run(Activite3Application.class, args);
    }

}
