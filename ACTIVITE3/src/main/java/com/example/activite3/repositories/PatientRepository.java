package com.example.activite3.repositories;

import com.example.activite3.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PatientRepository extends JpaRepository<Patient, Long> {


    List<Patient> findByNomContainsIgnoreCase(String keyword);
}
