package com.example.wilayahindonesia.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubDistrictResponse {
    private Long id;
    private String nama;
}
