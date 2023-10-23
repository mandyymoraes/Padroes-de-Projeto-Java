

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
 * Projeto Spring Boot gerado pelo Spring Initializr
 * Dependencias: Spring Data JPA, Spring Web, H2 Database, OpenFeign
 */

@EnableFeignClients
@SpringBootApplication
public class PadraoProjetosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadraoProjetosApplication.class, args);
	}

}
