package com.dentalclinic.dpm.service;

import com.dentalclinic.dpm.model.dto.AdultDTO;
import com.dentalclinic.dpm.model.request.AdultSearchRequest;
import com.dentalclinic.dpm.model.response.AdultSearchResponse;
import java.util.List;

public interface AdultService {
    void createAdult(AdultDTO adultDTO);

    void deleteAdult(List<Long> adultIds);

    List<AdultSearchResponse> findAllAdults(AdultSearchRequest adultSearchRequest);

    void updateAdult(AdultDTO adultDTO);
}
