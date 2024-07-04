package com.ashu.enums;


import com.ashu.constants.SymptomsConstant;

public enum Speciality {


    ORTHOPEDIC(SymptomsConstant.ORTHOPEDIC),
    GYNECOLOGY(SymptomsConstant.GYNECOLOGY),
    DERMATOLOGY(SymptomsConstant.DERMATOLOGY),
    ENT(SymptomsConstant.ENT);


    private String[] symptoms;

    Speciality(String... symptoms) {
        this.symptoms = symptoms;
    }

    public String[] getSymptoms() {
        return symptoms;
    }


}

