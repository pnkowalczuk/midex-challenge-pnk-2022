package com.mindex.challenge.service.impl;

import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.ReportingStructureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportingStructureServiceImpl implements ReportingStructureService{

    @Autowired
    EmployeeRepository employeeRepository;

    public ReportingStructure compute(String id){
        ReportingStructure rs = new ReportingStructure(id, employeeRepository);
        return rs;
    }
}
