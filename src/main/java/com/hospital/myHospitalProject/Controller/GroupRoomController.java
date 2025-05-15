package com.hospital.myHospitalProject.Controller;

import com.hospital.myHospitalProject.Entity.GroupRoom;
import com.hospital.myHospitalProject.Service.GroupRoomService;
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
public class GroupRoomController {
    private GroupRoomService groupRoomService;
    @GetMapping("/GroupRoom")
    private List<GroupRoom>getGroupRoom(){
        return groupRoomService.getGroupRoom();
    }
}
