package com.dentalclinic.dpm.model.response;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdultSearchResponse {
    private String name;

    private String address;

    private String phone;

    private LocalDateTime firstVisit;

    private Long totalAmount;

    private Long paidAmount;

    private Boolean paymentStatus;

}
