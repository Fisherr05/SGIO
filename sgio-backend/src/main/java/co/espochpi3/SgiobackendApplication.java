																/*
 -------------------------------------------------------------------
|
| CRUDyLeaf	- A Domain Specific Language for generating Spring Boot 
|			REST resources from entity CRUD operations.
| Author: Omar S. Gómez (2020)
| File Date: Fri Jul 17 12:32:07 COT 2020
| 
 -------------------------------------------------------------------
																*/
package co.espochpi3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.TimeZone;
import javax.annotation.PostConstruct;					

@SpringBootApplication
public class SgiobackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(SgiobackendApplication.class, args);
		System.out.println("Active resources for Paciente entity");
		System.out.println("GET");
		System.out.println("/api/sgio/paciente");
		System.out.println("/api/sgio/paciente/{id}");
		System.out.println("POST");
		System.out.println("/api/sgio/paciente");
		System.out.println("PUT");
		System.out.println("/api/sgio/paciente");
		System.out.println("DELETE");
		System.out.println("/api/sgio/paciente/{id}");
		System.out.println("Active resources for Doctor entity");
		System.out.println("GET");
		System.out.println("/api/sgio/doctor");
		System.out.println("/api/sgio/doctor/{id}");
		System.out.println("POST");
		System.out.println("/api/sgio/doctor");
		System.out.println("PUT");
		System.out.println("/api/sgio/doctor");
		System.out.println("DELETE");
		System.out.println("/api/sgio/doctor/{id}");
		System.out.println("Active resources for Especialidad entity");
		System.out.println("GET");
		System.out.println("/api/sgio/especialidad");
		System.out.println("/api/sgio/especialidad/{id}");
		System.out.println("POST");
		System.out.println("/api/sgio/especialidad");
		System.out.println("PUT");
		System.out.println("/api/sgio/especialidad");
		System.out.println("DELETE");
		System.out.println("/api/sgio/especialidad/{id}");
		System.out.println("Active resources for Cita entity");
		System.out.println("GET");
		System.out.println("/api/sgio/cita");
		System.out.println("/api/sgio/cita/{id}");
		System.out.println("POST");
		System.out.println("/api/sgio/cita");
		System.out.println("PUT");
		System.out.println("/api/sgio/cita");
		System.out.println("DELETE");
		System.out.println("/api/sgio/cita/{id}");
		System.out.println("Active resources for Administrador entity");
		System.out.println("GET");
		System.out.println("/api/sgio/administrador");
		System.out.println("/api/sgio/administrador/{id}");
		System.out.println("POST");
		System.out.println("/api/sgio/administrador");
		System.out.println("PUT");
		System.out.println("/api/sgio/administrador");
		System.out.println("DELETE");
		System.out.println("/api/sgio/administrador/{id}");
	}
	
	@PostConstruct
	public void init(){
		TimeZone.setDefault(TimeZone.getTimeZone("America/Guayaquil"));
	}						
}
