package com.hospital.myHospitalProject.Service;

import com.hospital.myHospitalProject.Entity.MedExam;
import com.hospital.myHospitalProject.Repository.MedExamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedExamService {
    private MedExamRepository medExamRepository;
    public List<MedExam>getMedExam(){
      return  medExamRepository.findAll();
    }
}
