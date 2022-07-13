package it.develhope.Swagger1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *Esercizio - Stivale a molla - Spavalderia 1
 * scrivere un'applicazione Spring Boot che utilizzi le seguenti dipendenze:
 *  `Lombok`
 *  `Strumenti di sviluppo di avvio primaverile`
 *  `Web primaverile`
 * aggiungi solo 1 dipendenza necessaria a `pom.xml` per` springfox`:
 *  `Springfox-boot-starter`
 * in `application.yml` aggiungi la seguente configurazione:
 *  `spring.mvc.pathmatch.matching-strategy = ant_path_matcher`
 *    ricorda di [convertire] (http://mageddo.com/tools/yaml-converter) da `properties` a` yaml`
 *
 * @author Alessandro Canulli
 */

@SpringBootApplication
public class ExerciseSpringBootSwagger1Application {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseSpringBootSwagger1Application.class, args);
	}
}