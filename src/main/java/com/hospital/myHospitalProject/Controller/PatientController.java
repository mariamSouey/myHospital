package com.hospital.myHospitalProject.Controller;

import com.hospital.myHospitalProject.Entity.Patient;
import com.hospital.myHospitalProject.Service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class PatientController {
    private PatientService patientService;
    @GetMapping("/Patient")
    public List<Patient> getPatient(){
        return patientService.getPatient();
    }
}
