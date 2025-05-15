package com.hospital.myHospitalProject.Service;

import com.hospital.myHospitalProject.Entity.User;
import com.hospital.myHospitalProject.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository ;
    public List<User> getUser(){
        return userRepository.findAll()
;    }

}
