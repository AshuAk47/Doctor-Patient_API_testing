package com.ashu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.entity.Patient;

@Repository
public interface PatientDoa extends JpaRepository<Patient,Integer> {
}
