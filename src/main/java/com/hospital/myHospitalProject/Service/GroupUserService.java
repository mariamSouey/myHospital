package com.hospital.myHospitalProject.Service;

import com.hospital.myHospitalProject.Entity.GroupUser;
import com.hospital.myHospitalProject.Repository.GroupUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GroupUserService {
    private GroupUserRepository groupUserRepository;
    public List<GroupUser> getGroupUser(){
        return groupUserRepository.findAll();
    }
}
