package com.example.wilayahindonesia.controller;

import com.example.wilayahindonesia.model.ProvinceResponse;
import com.example.wilayahindonesia.model.WebResponse;
import com.example.wilayahindonesia.service.ProvinceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path = "/api/wilayah-indonesia")
public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;


    @GetMapping(value = "/province", produces = MediaType.APPLICATION_JSON_VALUE)
    public WebResponse<List<ProvinceResponse>> getAllProvinces() {
        List<ProvinceResponse> provinces = provinceService.getAllProvinces();
        return WebResponse.<List<ProvinceResponse>>builder()
                .status(true)
                .data(provinces)
                .message("SUCCESS")
                .build();
    }
}

