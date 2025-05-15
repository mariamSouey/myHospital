package com.hospital.myHospitalProject.Service;

import com.hospital.myHospitalProject.Entity.Room;
import com.hospital.myHospitalProject.Repository.RoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoomService {
    private RoomRepository roomRepository;
    public List<Room> getRoom(){
        return  roomRepository.findAll();
    }

}
