package com.mindex.challenge.controller;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.service.EmployeeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompensationController {
    private static final Logger LOG  = LoggerFactory.getLogger(CompensationController.class);

    @Autowired
    private EmployeeService employeeService;



    @PostMapping("/compensation")
    public Compensation create(@RequestBody Compensation compensation){
        return compensation;
    }

    @GetMapping("/compensation/{id}")
    public Compensation read(@PathVariable String id){
        return new Compensation();
    }

}
