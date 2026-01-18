package com.ses_service.repository;

import com.ses_service.entity.ServiceEntrySheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SESRepo extends JpaRepository<ServiceEntrySheet , Long> {
}
