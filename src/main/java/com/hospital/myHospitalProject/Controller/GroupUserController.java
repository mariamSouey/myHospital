package com.hospital.myHospitalProject.Controller;

import com.hospital.myHospitalProject.Entity.GroupRoom;
import com.hospital.myHospitalProject.Entity.GroupUser;
import com.hospital.myHospitalProject.Service.GroupUserService;
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
public class GroupUserController {
    private GroupUserService groupUserService;
    @GetMapping("/GroupUser")
    public List<GroupUser> getGroupUser(){
     return   groupUserService.getGroupUser();
    }
}
