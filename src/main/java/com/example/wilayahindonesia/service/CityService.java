package com.example.wilayahindonesia.service;

import com.example.wilayahindonesia.entity.City;
import com.example.wilayahindonesia.model.CityResponse;
import com.example.wilayahindonesia.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public List<CityResponse> getCityByProvinceId(Long provinceId) {
        Optional<City> cities = Optional.ofNullable(cityRepository.findByProvinceId(provinceId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Province id is not found")));
        return cities.stream()
                .map(city -> CityResponse.builder()
                        .id(city.getId())
                        .nama(city.getNama())
                        .build())
                .collect(Collectors.toList());
    }
}
