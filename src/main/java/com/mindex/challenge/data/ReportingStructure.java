package com.mindex.challenge.data;


import java.util.List;

import com.mindex.challenge.dao.EmployeeRepository;
// import org.springframework.beans.factory.annotation.Autowired;

public class ReportingStructure {
    private String employeeId;
    private int directReports;

    public ReportingStructure(String id, EmployeeRepository employeeRepository){
        this.employeeId = id;
        List<Employee> reportingEmployees = employeeRepository.findByEmployeeId(id).getDirectReports();
        directReports = reportingEmployees.size();

    }

    public String getId(){
        return employeeId;
    }
    public int getDirectReports(){
        return directReports;
    }
}
