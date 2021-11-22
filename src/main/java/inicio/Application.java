package inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages = {"controller","dao","service","inicio"})
@EntityScan(basePackages = {"model"})
@EnableJpaRepositories(basePackages = {"dao"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


//Arrancamos y vamos a un navegador y escribimos http://localhost:8080/swagger-ui.html
//Arrancamos y vamos a un navegador y escribimos http://localhost:8080/swagger-ui.html#/contactos-controller/eliminarPorIdUsingDELETE
//Según vamos añadiendo y abriendo las pestañas de la página