package pe.edu.i202310854.cl1_jpa_data_huacasi_henry.entity;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Data
@Table(name = "countrylanguage")
public class CountryLanguage {
    @EmbeddedId
    private CountryLanguageId id;

    @ManyToOne
    @MapsId("countryCode")
    @JoinColumn(name = "countrycode")
    private Country country;

    @Column(name = "isofficial")
    private boolean isOfficial;

    private Double percentage;
}
