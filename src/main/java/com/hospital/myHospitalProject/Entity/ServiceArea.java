package com.hospital.myHospitalProject.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.lang.annotation.Target;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ServiceArea {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="ServiceArea_Ky")
    private long ServiceArea_Ky;
    private String ServiceArea_Name;
    @OneToOne( targetEntity = Service_Hop.class ,cascade = CascadeType.ALL)
    @JoinColumn (name="serviceArea_Service_Ky",referencedColumnName = "Service_Ky")
    private long serviceArea_Service_Ky;

}
