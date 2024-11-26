package pe.edu.i202310854.cl1_jpa_data_huacasi_henry.entity;

import lombok.*;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
public class Country {
    @Id
    private String code;
    private String name;
    private String continent;
    private String region;

    @Column(name = "surfacearea")
    private double surfaceArea;

    @Column(name = "indepyear")
    private int indepYear;
    private int population;

    @Column(name = "lifeexpectancy")
    private double lifeExpectancy;
    private double gnp;

    @Column(name = "GNPOld")
    private double gnpOld;

    @Column(name = "localname")
    private String localName;

    @Column(name = "governmentform")
    private String governmentForm;

    @Column(name = "headofstate")
    private String headOfState;
    private int capital;
    private String code2;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<City> cities = new ArrayList<>();

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CountryLanguage> countryLanguages = new ArrayList<>();
}
