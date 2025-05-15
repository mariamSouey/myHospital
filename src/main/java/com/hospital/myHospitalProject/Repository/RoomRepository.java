package com.hospital.myHospitalProject.Repository;

import com.hospital.myHospitalProject.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
