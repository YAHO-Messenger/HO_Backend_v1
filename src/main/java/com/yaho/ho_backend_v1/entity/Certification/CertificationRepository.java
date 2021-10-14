package com.yaho.ho_backend_v1.entity.Certification;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CertificationRepository extends CrudRepository<Certification, String> {
    Optional<Certification> findByPhoneNumber(String phoneNumber);
}
