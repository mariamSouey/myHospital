package com.hospital.myHospitalProject.Controller;

import com.hospital.myHospitalProject.Entity.Room;
import com.hospital.myHospitalProject.Service.RoomService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@NoArgsConstructor
@RestController
@AllArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class RoomController {
    private RoomService roomService;
    @GetMapping("/Room")
    public List<Room> getRoom(){
        return roomService.getRoom();
    }
}
