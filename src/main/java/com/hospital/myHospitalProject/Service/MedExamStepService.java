package com.hospital.myHospitalProject.Service;

import com.hospital.myHospitalProject.Entity.MedExamStep;
import com.hospital.myHospitalProject.Repository.MedExamRepository;
import com.hospital.myHospitalProject.Repository.MedExamStepRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedExamStepService {
    private MedExamStepRepository medExamStepRepository;
    public List<MedExamStep>getMedExamStep(){
      return   medExamStepRepository.findAll();
    }

}
