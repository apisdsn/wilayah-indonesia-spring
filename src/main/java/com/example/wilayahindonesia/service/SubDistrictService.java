package com.example.wilayahindonesia.service;


import com.example.wilayahindonesia.entity.SubDistrict;
import com.example.wilayahindonesia.model.SubDistrictResponse;
import com.example.wilayahindonesia.repository.SubDistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SubDistrictService {
    @Autowired
    private SubDistrictRepository subDistrictRepository;

    public List<SubDistrictResponse> getSubDistrictByDistrictId(Long districtId) {
        List<SubDistrict> subDistricts = subDistrictRepository.findByDistrictId(districtId);
        return subDistricts.stream()
                .map(subDistrict -> SubDistrictResponse.builder()
                        .id(subDistrict.getId())
                        .nama(subDistrict.getNama())
                        .build())
                .collect(Collectors.toList());
    }
}
