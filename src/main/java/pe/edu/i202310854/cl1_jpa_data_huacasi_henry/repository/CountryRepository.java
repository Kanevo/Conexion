package pe.edu.i202310854.cl1_jpa_data_huacasi_henry.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.i202310854.cl1_jpa_data_huacasi_henry.entity.Country;

import java.util.Optional;

public interface CountryRepository extends CrudRepository<Country, String> {
}

