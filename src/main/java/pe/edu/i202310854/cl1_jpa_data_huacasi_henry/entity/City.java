package pe.edu.i202310854.cl1_jpa_data_huacasi_henry.entity;

import lombok.*;
import jakarta.persistence.*;


@Data
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    private String name;

    @Column(name = "countrycode", length = 3)
    private String countryCode;

    private String district;

    private Long population;

    @ManyToOne
    @JoinColumn(name = "countrycode", insertable = false, updatable = false)
    private Country country;
}
