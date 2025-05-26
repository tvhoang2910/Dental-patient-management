package com.dentalclinic.dpm.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "first_visit")
    private LocalDateTime firstVisit;

    @Column(name = "total_amount")
    private Long totalAmount;

    @Column(name = "paid_amount")
    private Long paidAmount;

    @Column(name = "payment_status")
    private Boolean paymentStatus;
}
