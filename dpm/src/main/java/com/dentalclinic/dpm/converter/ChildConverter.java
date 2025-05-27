package com.dentalclinic.dpm.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.dentalclinic.dpm.entity.Child;
import com.dentalclinic.dpm.model.dto.ChildDTO;
import com.dentalclinic.dpm.model.response.ChildSearchResponse;

@Component
public class ChildConverter {
    private final ModelMapper modelMapper;

    public ChildConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public ChildSearchResponse convertToResponse(Child child) {
        if (child == null) {
            return null;
        }
        return modelMapper.map(child, ChildSearchResponse.class);
    }

    public Child convertToEntity(ChildDTO childDTO) {
        if (childDTO == null) {
            return null;
        }
        return modelMapper.map(childDTO, Child.class);
    }

}
