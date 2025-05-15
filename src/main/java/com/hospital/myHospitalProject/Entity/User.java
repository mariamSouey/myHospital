package com.hospital.myHospitalProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="User_Ky",unique = true)
    private long User_Ky ;
    private  String User_Name ;
    private String User_Pswr;
    private String User_frstNm ;
    @OneToOne( targetEntity = GroupUser.class ,cascade = CascadeType.ALL)
    @JoinColumn (name="User_GroupUser_Ky",referencedColumnName = "GroupUser_Ky")
    private long User_GroupUser_Ky ;

}
