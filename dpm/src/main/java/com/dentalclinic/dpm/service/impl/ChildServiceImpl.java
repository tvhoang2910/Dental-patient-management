package com.dentalclinic.dpm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dentalclinic.dpm.converter.ChildConverter;
import com.dentalclinic.dpm.entity.Child;
import com.dentalclinic.dpm.model.dto.ChildDTO;
import com.dentalclinic.dpm.model.request.ChildSearchRequest;
import com.dentalclinic.dpm.model.response.ChildSearchResponse;
import com.dentalclinic.dpm.repository.ChildRepository;
import com.dentalclinic.dpm.service.ChildService;

@Service
public class ChildServiceImpl implements ChildService {
    private final ChildRepository childRepository;
    private final ChildConverter childConverter;

    public ChildServiceImpl(ChildRepository childRepository, ChildConverter childConverter) {
        this.childRepository = childRepository;
        this.childConverter = childConverter;
    }

    @Override
    public void createChild(ChildDTO childDTO) {
        childRepository.save(childConverter.convertToEntity(childDTO));
    }

    @Override
    public void deleteChild(List<Long> childIds) {
        childRepository.deleteByIdIn(childIds);
    }

    @Override
    public List<ChildSearchResponse> findAllChildren(ChildSearchRequest childSearchRequest) {

        List<Child> children = childRepository
                .findByNameContainingAndAddressContainingAndPhoneContainingAndGuardianContaining(
                        Optional.ofNullable(childSearchRequest.getName()).orElse(""),
                        Optional.ofNullable(childSearchRequest.getAddress()).orElse(""),
                        Optional.ofNullable(childSearchRequest.getPhone()).orElse(""),
                        Optional.ofNullable(childSearchRequest.getGuardian()).orElse(""));
        return children.stream()
                .map(child -> childConverter.convertToResponse(child))
                .toList();
    }

    @Override
    public void updateChild(ChildDTO childDTO) {
        childRepository.save(childConverter.convertToEntity(childDTO));

    }

}