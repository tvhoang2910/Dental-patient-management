package com.dentalclinic.dpm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "child")
public class Child extends BaseEntity {
    @Column(name = "guardian")
    private String guardian;
}
