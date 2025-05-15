package com.hospital.myHospitalProject.Service;

import com.hospital.myHospitalProject.Entity.MedExamR;
import com.hospital.myHospitalProject.Repository.MedExamRsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MedExamRService {
    private MedExamRsRepository medExamRessourceRepository;
    public List<MedExamR>getMedExamR(){
      return  medExamRessourceRepository.findAll();
    }
}
