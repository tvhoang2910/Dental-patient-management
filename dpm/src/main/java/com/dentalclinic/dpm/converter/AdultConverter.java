package com.dentalclinic.dpm.converter;

import com.dentalclinic.dpm.entity.Adult;
import com.dentalclinic.dpm.model.dto.AdultDTO;
import com.dentalclinic.dpm.model.response.AdultSearchResponse;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AdultConverter {
    private final ModelMapper modelMapper;

    public AdultConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Adult convertToEntity(AdultDTO adultDTO) {
        return modelMapper.map(adultDTO, Adult.class);
    }

    public AdultSearchResponse convertToResponse(Adult adult) {
        return modelMapper.map(adult, AdultSearchResponse.class);
    }
}
