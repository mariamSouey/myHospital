package com.hospital.myHospitalProject.Repository;

import com.hospital.myHospitalProject.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
