package com.example.activite3.web;

import com.example.activite3.entities.Patient;
import com.example.activite3.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {

    private PatientRepository patientRepository;

    @GetMapping("/index")
    public String index(Model model,
                        @RequestParam(name = "keyword", defaultValue = "") String keyword) {
        List<Patient> patients = patientRepository.findByNomContainsIgnoreCase(keyword);
        model.addAttribute("listePatients", patients);
        model.addAttribute("keyword", keyword);
        return "patients"; // nom du template Thymeleaf (patients.html)
    }
}
