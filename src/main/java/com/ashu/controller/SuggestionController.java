package com.ashu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashu.entity.Doctor;
import com.ashu.service.ClinicService;

import java.util.List;

@RestController
@RequestMapping("/suggestion")
public class SuggestionController {

    private final ClinicService clinicService;

    public SuggestionController(ClinicService clinicService) {
        this.clinicService = clinicService;
    }

    @GetMapping("/{patientId}")
    public List<Doctor> getDocList(@PathVariable Integer patientId) throws Exception {
        return clinicService.suggestDoc(patientId);
    }
}
