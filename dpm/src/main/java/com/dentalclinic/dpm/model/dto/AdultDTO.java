package com.dentalclinic.dpm.model.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdultDTO {
    private Long id;

    @NotBlank(message = "Tên người lớn không được để trống")
    private String name;

    @NotBlank(message = "Địa chỉ không được để trống")
    private String address;

    @NotBlank(message = "Số điện thoại không được để trống")
    private String phone;

    @NotBlank(message = "Ngày đến đầu tiên không được để trống")
    private LocalDateTime firstVisit;

    @NotBlank(message = "Thành tiền không được để trống")
    private Long totalAmount;

    @NotBlank(message = "Số tiền đã thanh toán không được để trống")
    private Long paidAmount;

    private Boolean paymentStatus;
}
