package com.example.wilayahindonesia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "subdistrict")
public class SubDistrict {
    @Id
    @Column(name = "id_subdistrict")
    private Long id;

    @Column(name = "name_subdistrict")
    private String nama;

    @ManyToOne
    @JoinColumn(name = "id_district", referencedColumnName = "id_district")
    private District district;

}
