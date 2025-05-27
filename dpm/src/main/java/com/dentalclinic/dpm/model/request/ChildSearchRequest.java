package com.dentalclinic.dpm.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChildSearchRequest {
    private String name;

    private String address;

    private String phone;

    private String guardian;

}
