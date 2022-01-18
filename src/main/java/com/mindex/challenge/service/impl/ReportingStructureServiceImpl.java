package com.mindex.challenge.service.impl;

import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.ReportingStructureService;
import org.springframework.stereotype.Service;

@Service
public class ReportingStructureServiceImpl implements ReportingStructureService{
    

    public ReportingStructure compute(String id){
        ReportingStructure rs = new ReportingStructure("no id");
        return rs;
    }
}
