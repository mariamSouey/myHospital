package com.hospital.myHospitalProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MedExamStep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MedExamstp_Ky", unique = true)
    private  long MedExamstp_Ky ;
    private String MedExamstp_Name;
    @OneToOne( targetEntity = MedExam.class ,cascade = CascadeType.ALL)
    @JoinColumn (name="MedExamstp_MedExamKy",referencedColumnName = "MedExam_Ky")
    private long MedExamstp_MedExamKy;
    @CreationTimestamp
    private Timestamp MedExamstp_TimeStampBegin;
    @CreationTimestamp
    private Timestamp MedExamstp_TimeStampEnd;

}
