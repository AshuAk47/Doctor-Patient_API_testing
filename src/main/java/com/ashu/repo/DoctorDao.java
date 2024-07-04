package com.ashu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.entity.Doctor;

import java.util.List;

@Repository
public interface DoctorDao extends JpaRepository<Doctor, Integer> {

    List<Doctor> findAllByCity(String currLoc);
}
