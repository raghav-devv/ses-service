package com.ses_service.service;

import com.ses_service.entity.ServiceEntrySheet;
import com.ses_service.repository.SESRepo;
import org.springframework.stereotype.Service;

@Service
public class SESService {

    private final SESRepo sesRepo;

    public SESService(SESRepo sesRepo) {
        this.sesRepo = sesRepo;
    }

    public ServiceEntrySheet save(ServiceEntrySheet serviceEntrySheet){
       return sesRepo.save(serviceEntrySheet);

    }
}
