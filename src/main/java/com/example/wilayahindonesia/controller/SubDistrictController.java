package com.example.wilayahindonesia.controller;

import com.example.wilayahindonesia.model.SubDistrictResponse;
import com.example.wilayahindonesia.model.WebResponse;
import com.example.wilayahindonesia.service.SubDistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/wilayah-indonesia")

public class SubDistrictController {
    @Autowired
    private SubDistrictService subDistrictService;

    @GetMapping(path = "/sub-district", produces = MediaType.APPLICATION_JSON_VALUE)
    public WebResponse<List<SubDistrictResponse>> getCityByProvinceId(@RequestParam(name = "district_id") Long districtId) {
        List<SubDistrictResponse> subDistrict = subDistrictService.getSubDistrictByDistrictId(districtId);

        if (!subDistrict.isEmpty()) {
            return WebResponse.<List<SubDistrictResponse>>builder()
                    .status(true)
                    .data(subDistrict)
                    .message("SUCCESS")
                    .build();
        } else {
            return WebResponse.<List<SubDistrictResponse>>builder()
                    .status(false)
                    .data(subDistrict)
                    .message("FAILED")
                    .build();
        }
    }
}
