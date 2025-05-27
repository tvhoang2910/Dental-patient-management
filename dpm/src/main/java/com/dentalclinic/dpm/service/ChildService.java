package com.dentalclinic.dpm.service;

import java.util.List;

import com.dentalclinic.dpm.model.dto.ChildDTO;
import com.dentalclinic.dpm.model.request.ChildSearchRequest;
import com.dentalclinic.dpm.model.response.ChildSearchResponse;

public interface ChildService {
    void createChild(ChildDTO childDTO);

    void deleteChild(List<Long> childIds);

    List<ChildSearchResponse> findAllChildren(ChildSearchRequest childSearchRequest);

    void updateChild(ChildDTO childDTO);
}
