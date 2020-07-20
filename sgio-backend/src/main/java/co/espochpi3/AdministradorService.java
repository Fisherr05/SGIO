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

import co.espochpi3.Administrador;
import co.espochpi3.RecordNotFoundException;
import co.espochpi3.AdministradorRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AdministradorService {

	@Autowired
	AdministradorRepository repo;

	public List<Administrador> getAll(){
		List<Administrador> administradorList = repo.findAll();
		if(administradorList.size() > 0) {
			return administradorList;
		} else {
			return new ArrayList<Administrador>();
		}
	}
     		
	public Administrador findByIdAdministrador(Long idAdministrador) throws RecordNotFoundException{
		Optional<Administrador> administrador = repo.findByIdAdministrador(idAdministrador);
		if(administrador.isPresent()) {
			return administrador.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public Administrador createAdministrador(Administrador administrador){
		return repo.save(administrador);
	}

	public Administrador updateAdministrador(Administrador administrador) throws RecordNotFoundException {
		Optional<Administrador> administradorTemp = repo.findByIdAdministrador(administrador.getIdAdministrador());
	
		if(administradorTemp.isPresent()){
			return repo.save(administrador);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deleteAdministradorByIdAdministrador(Long idAdministrador) throws RecordNotFoundException{
		Optional<Administrador> administrador = repo.findByIdAdministrador(idAdministrador);
		if(administrador.isPresent()) {
		repo.deleteByIdAdministrador(idAdministrador);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
