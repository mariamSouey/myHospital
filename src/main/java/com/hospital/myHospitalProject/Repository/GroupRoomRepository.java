package com.hospital.myHospitalProject.Repository;

import com.hospital.myHospitalProject.Entity.GroupRoom;
import com.hospital.myHospitalProject.Entity.Service_Hop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRoomRepository  extends JpaRepository<GroupRoom, Long> {
}
