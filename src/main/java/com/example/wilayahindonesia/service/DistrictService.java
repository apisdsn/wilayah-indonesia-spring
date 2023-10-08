package com.example.wilayahindonesia.service;

import com.example.wilayahindonesia.entity.District;
import com.example.wilayahindonesia.model.DistrictResponse;
import com.example.wilayahindonesia.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DistrictService {

    @Autowired
    private DistrictRepository districtRepository;

    public List<DistrictResponse> getDistrictByCityId(Long cityId) {
        List<District> districts = districtRepository.findByCityId(cityId);
        return districts.stream()
                .map(district -> DistrictResponse.builder()
                        .id(district.getId())
                        .nama(district.getNama())
                        .build())
                .collect(Collectors.toList());
    }
}
