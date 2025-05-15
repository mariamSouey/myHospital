package com.hospital.myHospitalProject.Controller;

import com.hospital.myHospitalProject.Entity.GroupRoom;
import com.hospital.myHospitalProject.Entity.MedExam;
import com.hospital.myHospitalProject.Service.GroupRoomService;
import com.hospital.myHospitalProject.Service.MedExamService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class MedExamController {
    private MedExamService medExamService;
    @GetMapping("/MedExam")
    private List<MedExam> getMedExam(){
        return medExamService.getMedExam();
    }
}
