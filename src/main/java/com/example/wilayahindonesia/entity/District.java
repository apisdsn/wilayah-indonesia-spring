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
@Entity
@Table(name = "district")
public class District {
    @Id
    @Column(name = "id_district")
    private Long id;

    @Column(name = "name_district")
    private String nama;

    @ManyToOne
    @JoinColumn(name = "id_city", referencedColumnName = "id_city")
    private City city;
}

