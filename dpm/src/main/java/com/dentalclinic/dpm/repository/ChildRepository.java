package com.dentalclinic.dpm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dentalclinic.dpm.entity.Child;

public interface ChildRepository extends JpaRepository<Child, Long> {
}
