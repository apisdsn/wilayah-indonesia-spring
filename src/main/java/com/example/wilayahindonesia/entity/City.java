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
@Table(name = "city")
public class City {
    @Id
    @Column(name = "id_city")
    private Long id;

    @Column(name = "name_city")
    private String nama;

    @ManyToOne
    @JoinColumn(name = "id_province", referencedColumnName = "id_province")
    private Province province;

}
