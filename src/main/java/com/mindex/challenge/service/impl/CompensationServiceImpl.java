package com.mindex.challenge.service.impl;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.service.CompensationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompensationServiceImpl implements CompensationService {
    private static final Logger LOG = LoggerFactory.getLogger(CompensationServiceImpl.class);

    @Override
    public Compensation create(Compensation compensation){
        
        return new Compensation();
    }

    @Override
    public Compensation read(String id){
        return new Compensation();
    }
    
}
