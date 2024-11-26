package pe.edu.i202310854.cl1_jpa_data_huacasi_henry.entity;

import lombok.*;
import jakarta.persistence.*;

import java.io.Serializable;


@Embeddable
@Data
public class CountryLanguageId implements Serializable {
    private String countryCode;
    private String language;
}