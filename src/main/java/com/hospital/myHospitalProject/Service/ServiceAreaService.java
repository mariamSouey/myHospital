package com.hospital.myHospitalProject.Service;

import com.hospital.myHospitalProject.Entity.ServiceArea;
import com.hospital.myHospitalProject.Entity.Service_Hop;
import com.hospital.myHospitalProject.Repository.ServiceAreaRepository;
import com.hospital.myHospitalProject.Repository.Service_HopRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceAreaService {
    private ServiceAreaRepository serviceAreaRepository;
    public List<ServiceArea> getServiceArea(){
        return serviceAreaRepository.findAll();
    }
}
