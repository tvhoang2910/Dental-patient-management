package com.dentalclinic.dpm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dentalclinic.dpm.entity.Adult;

public interface AdultRepository extends JpaRepository<Adult, Long> {
    List<Adult> findByNameContainingAndAddressContainingAndPhoneContaining(
            String name, String address,
            String phone);

    void deleteByIdIn(List<Long> adultIds);
}
