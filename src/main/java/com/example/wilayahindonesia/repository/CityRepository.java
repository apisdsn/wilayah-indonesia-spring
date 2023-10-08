package com.example.wilayahindonesia.repository;

import com.example.wilayahindonesia.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface CityRepository extends JpaRepository<City, Long>, JpaSpecificationExecutor<City> {
    Optional<City> findByProvinceId(Long ProvinceId);
}
