package com.hospital.myHospitalProject.Repository;

import com.hospital.myHospitalProject.Entity.ServiceArea;
import com.hospital.myHospitalProject.Entity.Service_Hop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceAreaRepository  extends JpaRepository<ServiceArea, Long> {
}
