package com.ses_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ServiceEntrySheets")
public class ServiceEntrySheet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String buyerId;
    private String supplierId;
    private String description;
    private String status;
    private long amount;

    public ServiceEntrySheet(){
    }
    public ServiceEntrySheet(String buyerId, String supplierId, String description, String status, long amount){
        this.buyerId=buyerId;
        this.supplierId=supplierId;
        this.description=description;
        this.status=status;
        this.amount=amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
