package com.dentalclinic.dpm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dentalclinic.dpm.converter.AdultConverter;
import com.dentalclinic.dpm.entity.Adult;
import com.dentalclinic.dpm.model.dto.AdultDTO;
import com.dentalclinic.dpm.model.request.AdultSearchRequest;
import com.dentalclinic.dpm.model.response.AdultSearchResponse;
import com.dentalclinic.dpm.repository.AdultRepository;

@Service
public class AdultServiceImpl implements com.dentalclinic.dpm.service.AdultService {
    private final AdultRepository adultRepository;
    private final AdultConverter adultConverter;

    public AdultServiceImpl(AdultRepository adultRepository, AdultConverter adultConverter) {
        this.adultRepository = adultRepository;
        this.adultConverter = adultConverter;
    }

    @Override
    public void createAdult(AdultDTO adultDTO) {
        adultRepository.save(adultConverter.convertToEntity(adultDTO));
    }

    @Override
    public void deleteAdult(List<Long> adultIds) {
        adultRepository.deleteAllById(adultIds);
    }

    @Override
    public List<AdultSearchResponse> findAllAdults(AdultSearchRequest adultSearchRequest) {
        List<Adult> adults = adultRepository.findByNameContainingAndAddressContainingAndPhoneContaining(
                Optional.ofNullable(adultSearchRequest.getName()).orElse(""),
                Optional.ofNullable(adultSearchRequest.getAddress()).orElse(""),
                Optional.ofNullable(adultSearchRequest.getPhone()).orElse(""));
        return adults.stream()
                .map(adult -> adultConverter.convertToResponse(adult))
                .toList();
    }

    @Override
    public void updateAdult(AdultDTO adultDTO) {
        adultRepository.save(adultConverter.convertToEntity(adultDTO));
    }
}
