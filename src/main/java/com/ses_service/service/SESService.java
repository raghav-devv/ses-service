package com.ses_service.service;

import com.ses_service.entity.ServiceEntrySheet;
import com.ses_service.exception.SESNotFoundException;
import com.ses_service.repository.SESRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SESService {

    private final SESRepo sesRepo;

    public SESService(SESRepo sesRepo) {
        this.sesRepo = sesRepo;
    }

    public ServiceEntrySheet save(ServiceEntrySheet serviceEntrySheet){
       return sesRepo.save(serviceEntrySheet);

    }

    public ServiceEntrySheet getById(Long id) {
       return sesRepo.findById(id).orElseThrow(()->new SESNotFoundException("Ses not found for the id:"+ id));
    }

    public List<ServiceEntrySheet> getAll() {
       return sesRepo.findAll();
    }

    public ServiceEntrySheet updateSheet(Long id, ServiceEntrySheet updateSes) {
    ServiceEntrySheet existingSheet = sesRepo.findById(id).orElseThrow(()-> new SESNotFoundException("Ses not foud for the id:"+id));

    existingSheet.setSupplierId(updateSes.getSupplierId());
    existingSheet.setBuyerId(updateSes.getBuyerId());
    existingSheet.setStatus(updateSes.getStatus());
    existingSheet.setDescription(updateSes.getDescription());
    existingSheet.setAmount(updateSes.getAmount());
    return  sesRepo.save(existingSheet);


    }

    public void  deleteSes(Long id) {
       ServiceEntrySheet ses =  sesRepo.findById(id).orElseThrow(()-> new SESNotFoundException("ses not found for this id:"+id));

       sesRepo.delete(ses);

    }
}
