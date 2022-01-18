package com.mindex.challenge.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mindex.challenge.data.ReportingStructure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReportingStructureController {
    private static final Logger LOG = LoggerFactory.getLogger(ReportingStructureController.class);

    @GetMapping("/reportingStructure/{id}")
    public ReportingStructure compute(@PathVariable String id){
        LOG.debug("Recieved request for reporting structure for id [{}]", id);
        ReportingStructure rs = new ReportingStructure(id);
        return rs;
    }
}
