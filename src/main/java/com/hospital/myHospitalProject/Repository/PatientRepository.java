package com.hospital.myHospitalProject.Repository;

import com.hospital.myHospitalProject.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
