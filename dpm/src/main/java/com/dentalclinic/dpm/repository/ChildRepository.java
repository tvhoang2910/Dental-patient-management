package com.dentalclinic.dpm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dentalclinic.dpm.entity.Child;

public interface ChildRepository extends JpaRepository<Child, Long> {
    List<Child> findByNameContainingAndAddressContainingAndPhoneContainingAndGuardianContaining(
            String name, String address,
            String phone, String guardian);

    void deleteByIdIn(List<Long> childIds);
}
