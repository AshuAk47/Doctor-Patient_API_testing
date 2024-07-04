package com.ashu.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import com.ashu.entity.Doctor;
import com.ashu.service.ClinicService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    private final ClinicService clinicService;

    public DoctorController(ClinicService clinicService) {
        this.clinicService = clinicService;
    }


    @PostMapping("/save")
    public Doctor saveDoctor(@RequestBody Doctor doctor) throws Exception {
        if (doctor.getCity().equalsIgnoreCase("NOIDA") || doctor.getCity().equalsIgnoreCase("FARIDABAD") || doctor.getCity().equalsIgnoreCase("DELHI")) {
            return clinicService.saveDoctor(doctor);
        } else {
//            throw new Exception("CITY SHOULD BE IN NOIDA, FARIDABAD, DELHI");
        	throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CITY SHOULD BE IN NOIDA, FARIDABAD, DELHI");
        }
    }

    @GetMapping("/{doctorId}")
    public Doctor getDoctor(@PathVariable Integer doctorId) {
        return clinicService.getDoctor(doctorId);
    }

    @DeleteMapping("/{doctorId}")
    public void deleteDoctor(@PathVariable Integer doctorId) {
        clinicService.deleteDoctor(doctorId);
    }

}
