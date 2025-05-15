package com.hospital.myHospitalProject.Controller;

import com.hospital.myHospitalProject.Entity.MedExamR;
import com.hospital.myHospitalProject.Service.MedExamRService;
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

public class MedExamRController {
    private MedExamRService medExamRService;
    @GetMapping("/MedExam")
    private List<MedExamR> getMedExamR(){
        return medExamRService.getMedExamR();
    }
}
