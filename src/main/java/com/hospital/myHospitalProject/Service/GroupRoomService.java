package com.hospital.myHospitalProject.Service;

import com.hospital.myHospitalProject.Entity.GroupRoom;
import com.hospital.myHospitalProject.Repository.GroupRoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GroupRoomService {
    private GroupRoomRepository groupRoomRepository;
    public List<GroupRoom> getGroupRoom(){
        return groupRoomRepository.findAll();

    }

}

