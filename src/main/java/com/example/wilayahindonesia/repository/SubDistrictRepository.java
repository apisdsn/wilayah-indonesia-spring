package com.example.wilayahindonesia.repository;

import com.example.wilayahindonesia.entity.SubDistrict;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubDistrictRepository extends JpaRepository<SubDistrict, Long> {

    List<SubDistrict> findByDistrictId(Long districtId);
}
