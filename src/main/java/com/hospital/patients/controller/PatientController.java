package com.hospital.patients.controller;

import com.hospital.patients.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @GetMapping("/print-name-log")
    public void printPatientName(){
        //this logs it in the console
        System.out.println("My name is Montassar");

    }


    @Autowired
    //Autowired is used to implement Dependency Injection
    private PatientService patientService; //Bean
    @GetMapping("/print-name")
    public String printPatientNameStr(){
        return patientService.printName("montassar");
    }
}
