package com.hospital.myHospitalProject.Controller;

import com.hospital.myHospitalProject.Entity.MedExam;
import com.hospital.myHospitalProject.Entity.MedExamStep;
import com.hospital.myHospitalProject.Service.MedExamService;
import com.hospital.myHospitalProject.Service.MedExamStepService;
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
public class MedExamstepController {
    private MedExamStepService medExamStepService;
    @GetMapping("/MedExamStep")
    private List<MedExamStep> getMedExamStep(){
        return medExamStepService.getMedExamStep();
    }
}
