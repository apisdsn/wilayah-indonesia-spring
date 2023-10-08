package com.example.wilayahindonesia.repository;

import com.example.wilayahindonesia.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProvinceRepository extends JpaRepository<Province, Long> {

}
