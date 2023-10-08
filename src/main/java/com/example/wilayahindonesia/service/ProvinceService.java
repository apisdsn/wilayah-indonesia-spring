package com.example.wilayahindonesia.service;

import com.example.wilayahindonesia.entity.Province;
import com.example.wilayahindonesia.model.ProvinceResponse;
import com.example.wilayahindonesia.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    public List<ProvinceResponse> getAllProvinces() {
        List<ProvinceResponse> provinceResponses = new ArrayList<>();

        List<Province> provinces = provinceRepository.findAll();


        for (Province province : provinces) {
            ProvinceResponse response = ProvinceResponse.builder()
                    .id(province.getId())
                    .nama(province.getNama())
                    .build();
            provinceResponses.add(response);
        }

        return provinceResponses;
    }

}

