																/*
 -------------------------------------------------------------------
|
| CRUDyLeaf	- A Domain Specific Language for generating Spring Boot 
|			REST resources from entity CRUD operations.
| Author: Omar S. Gómez (2020)
| File Date: Fri Jul 17 12:32:06 COT 2020
| 
 -------------------------------------------------------------------
																*/
package co.espochpi3;

import co.espochpi3.Especialidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, Long> {

	Optional <Especialidad> findByIdEspecialidad(Long idEspecialidad);
	@Transactional
	void deleteByIdEspecialidad(Long idEspecialidad);
	
}
