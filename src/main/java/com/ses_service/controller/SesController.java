package com.ses_service.controller;

import com.ses_service.entity.ServiceEntrySheet;
import com.ses_service.service.SESService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SesController {

    private final SESService sesService;

    public SesController(SESService sesService) {
        this.sesService = sesService;
    }

    @PostMapping("/save")
    public ResponseEntity<ServiceEntrySheet> saveSES(@RequestBody ServiceEntrySheet serviceEntrySheet){
       ServiceEntrySheet serviceEntrySheet1 = sesService.save(serviceEntrySheet);
       return new ResponseEntity<>(serviceEntrySheet1,HttpStatus.CREATED);
    }
}
