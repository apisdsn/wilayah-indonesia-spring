package com.example.wilayahindonesia.controller;

import com.example.wilayahindonesia.model.CityResponse;
import com.example.wilayahindonesia.model.WebResponse;
import com.example.wilayahindonesia.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/wilayah-indonesia")
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping(path = "/city", produces = MediaType.APPLICATION_JSON_VALUE)
    public WebResponse<List<CityResponse>> getCityByProvinceId(@RequestParam(name = "province_id") Long idProvince) {
        List<CityResponse> cities = cityService.getCityByProvinceId(idProvince);
        if (!cities.isEmpty()) {
            return WebResponse.<List<CityResponse>>builder()
                    .status(true)
                    .data(cities)
                    .message("SUCCESS")
                    .build();
        } else {
            return WebResponse.<List<CityResponse>>builder()
                    .status(false)
                    .data(cities)
                    .message("FAILED")
                    .build();
        }
    }
}
