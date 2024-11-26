package pe.edu.i202310854.cl1_jpa_data_huacasi_henry.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConexionesConfig {

    @Bean
    public HikariDataSource dataSource() {
        HikariConfig config = new HikariConfig();

        String dbWorldUrl = System.getenv("DB_WORLD_URL");
        String dbWorldUser = System.getenv("DB_WORLD_USER");
        String dbWorldPass = System.getenv("DB_WORLD_PASS");
        String dbWorldDriver = System.getenv("DB_WORLD_DRIVER");

        if (dbWorldUrl == null || dbWorldUser == null || dbWorldPass == null || dbWorldDriver == null) {
            throw new IllegalStateException("Las variables de entorno de la base de datos no están establecidas correctamente.");
        }

        config.setJdbcUrl(dbWorldUrl);
        config.setUsername(dbWorldUser);
        config.setPassword(dbWorldPass);
        config.setDriverClassName(dbWorldDriver);

        config.setMaximumPoolSize(30);
        config.setMinimumIdle(4);
        config.setIdleTimeout(4 * 60 * 1000);
        config.setConnectionTimeout(45 * 1000);

        System.out.println("###### HikariCP initialized ######");
        return new HikariDataSource(config);
    }
}
