package com.mindex.challenge.service.impl;

import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.service.ReportingStructureService;

import java.util.List;
import java.util.Objects;
import java.util.HashSet;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportingStructureServiceImpl implements ReportingStructureService{

    @Autowired
    EmployeeRepository employeeRepository;

    public ReportingStructure compute(String id){
        ReportingStructure rs = new ReportingStructure(id);
        rs.setDirectReports(getCountDistinctReports(id));
        return rs;
    }

    private int getCountDistinctReports(String id){
        List<Employee> directReports = employeeRepository.findByEmployeeId(id).getDirectReports();

        for(int i = 0; i < directReports.size(); i++){
            Employee curEmp = employeeRepository.findByEmployeeId(directReports.get(i).getEmployeeId());
            List<Employee> curEmpReports = curEmp.getDirectReports();

            if(!Objects.isNull(curEmpReports) && curEmpReports.size() > 0){
                //potential for halting problem exists here
                directReports.addAll(curEmpReports);
                //if the graph of the reporting structure contains a cycle (eg john reports to ringo reports tojohn), this will lead to an infinite loop.

            }
        }

        List<String> employeeIdList = new ArrayList<>(); //convert list of employee objects to list of Strings for more stable comparison
        for(Employee e : directReports){
            employeeIdList.add(e.getEmployeeId());
        }

        List<String> extendedReportsNoDuplicates = new ArrayList<>(new HashSet<>(employeeIdList)); // Cast to hashset to remove dupes.

        return extendedReportsNoDuplicates.size();
    }
}
