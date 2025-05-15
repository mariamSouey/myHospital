package com.hospital.myHospitalProject.Controller;

import com.hospital.myHospitalProject.Entity.Room;
import com.hospital.myHospitalProject.Entity.User;
import com.hospital.myHospitalProject.Service.RoomService;
import com.hospital.myHospitalProject.Service.UserService;
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
public class UserController {
    private UserService userService;
    @GetMapping("/User")
    public List<User> getUser(){
        return userService.getUser();
    }
}
