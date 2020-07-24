																/*
 -------------------------------------------------------------------
|
| CRUDyLeaf	- A Domain Specific Language for generating Spring Boot 
|			REST resources from entity CRUD operations.
| Author: Omar S. Gómez (2020)
| File Date: Mon Jul 20 10:02:21 COT 2020
| 
 -------------------------------------------------------------------
																*/
package co.espochpi3.sgiobackend;

import co.espochpi3.sgiobackend.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Long> {

	Optional <Administrador> findByIdAdministrador(Long idAdministrador);
	
	void deleteByIdAdministrador(Long idAdministrador);
	
}
