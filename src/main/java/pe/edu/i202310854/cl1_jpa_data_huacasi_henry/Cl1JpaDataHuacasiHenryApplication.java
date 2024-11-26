package pe.edu.i202310854.cl1_jpa_data_huacasi_henry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.i202310854.cl1_jpa_data_huacasi_henry.entity.Country;
import pe.edu.i202310854.cl1_jpa_data_huacasi_henry.repository.CountryRepository;

import java.util.List;
import java.util.Optional;


@SpringBootApplication
public class Cl1JpaDataHuacasiHenryApplication implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataHuacasiHenryApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {


	}
}
