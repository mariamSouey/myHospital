package com.hospital.myHospitalProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="P_Ky", unique = true)
    private long p_ky ;
    private String P_Name ;
    private String P_FirstName ;
    private Date P_birthDate ;
    private long P_Adress;
    private long P_Tel ;

}
