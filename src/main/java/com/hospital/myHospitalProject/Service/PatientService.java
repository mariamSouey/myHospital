package com.hospital.myHospitalProject.Service;

import com.hospital.myHospitalProject.Entity.Patient;
import com.hospital.myHospitalProject.Repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PatientService {
    private PatientRepository patientRepository;
    public List<Patient>getPatient(){
      return   patientRepository.findAll();
    }
}
