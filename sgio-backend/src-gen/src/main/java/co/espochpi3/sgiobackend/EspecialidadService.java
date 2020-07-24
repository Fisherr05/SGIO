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

import co.espochpi3.sgiobackend.Especialidad;
import co.espochpi3.sgiobackend.RecordNotFoundException;
import co.espochpi3.sgiobackend.EspecialidadRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EspecialidadService {

	@Autowired
	EspecialidadRepository repo;

	public List<Especialidad> getAll(){
		List<Especialidad> especialidadList = repo.findAll();
		if(especialidadList.size() > 0) {
			return especialidadList;
		} else {
			return new ArrayList<Especialidad>();
		}
	}
     		
	public Especialidad findByIdEspecialidad(Long idEspecialidad) throws RecordNotFoundException{
		Optional<Especialidad> especialidad = repo.findByIdEspecialidad(idEspecialidad);
		if(especialidad.isPresent()) {
			return especialidad.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public Especialidad createEspecialidad(Especialidad especialidad){
		return repo.save(especialidad);
	}

	public Especialidad updateEspecialidad(Especialidad especialidad) throws RecordNotFoundException {
		Optional<Especialidad> especialidadTemp = repo.findByIdEspecialidad(especialidad.getIdEspecialidad());
	
		if(especialidadTemp.isPresent()){
			return repo.save(especialidad);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deleteEspecialidadByIdEspecialidad(Long idEspecialidad) throws RecordNotFoundException{
		Optional<Especialidad> especialidad = repo.findByIdEspecialidad(idEspecialidad);
		if(especialidad.isPresent()) {
		repo.deleteByIdEspecialidad(idEspecialidad);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
