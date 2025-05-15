package com.hospital.myHospitalProject.Controller;

import com.hospital.myHospitalProject.Entity.Service_Hop;
import com.hospital.myHospitalProject.Service.Service_HopService;
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
public class Service_HopController {
    private Service_HopService serviceHopService;
    @GetMapping("/service")
    public List<Service_Hop> getService(){
        return serviceHopService.getService();
    }
}
