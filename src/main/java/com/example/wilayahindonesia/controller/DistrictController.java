package com.example.wilayahindonesia.controller;

import com.example.wilayahindonesia.model.DistrictResponse;
import com.example.wilayahindonesia.model.WebResponse;
import com.example.wilayahindonesia.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/wilayah-indonesia")
public class DistrictController {
    @Autowired
    private DistrictService districtService;

    @GetMapping(path = "/district", produces = MediaType.APPLICATION_JSON_VALUE)
    public WebResponse<List<DistrictResponse>> getCityByProvinceId(@RequestParam(name = "city_id") Long cityId) {
        List<DistrictResponse> district = districtService.getDistrictByCityId(cityId);
        if (!district.isEmpty()) {
            return WebResponse.<List<DistrictResponse>>builder()
                    .data(district)
                    .message("SUCCESS")
                    .build();
        } else {
            return WebResponse.<List<DistrictResponse>>builder()
                    .data(district)
                    .status(false)
                    .message("FAILED")
                    .build();
        }
    }
}
