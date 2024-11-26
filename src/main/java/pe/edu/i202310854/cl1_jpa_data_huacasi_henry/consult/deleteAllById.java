package pe.edu.i202310854.cl1_jpa_data_huacasi_henry.consult;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.i202310854.cl1_jpa_data_huacasi_henry.Cl1JpaDataHuacasiHenryApplication;
import pe.edu.i202310854.cl1_jpa_data_huacasi_henry.repository.CountryRepository;


import java.util.List;
@Order(2)
@SpringBootApplication
public class deleteAllById implements CommandLineRunner {

    @Autowired
    private CountryRepository countryRepository;

    public static void main(String[] args) {
        SpringApplication.run(Cl1JpaDataHuacasiHenryApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        countryRepository.deleteAllById(List.of("COL", "ARG"));

    }
}
