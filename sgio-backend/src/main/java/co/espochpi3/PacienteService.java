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

import co.espochpi3.Paciente;
import co.espochpi3.RecordNotFoundException;
import co.espochpi3.PacienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

	@Autowired
	PacienteRepository repo;

	public List<Paciente> getAll(){
		List<Paciente> pacienteList = repo.findAll();
		if(pacienteList.size() > 0) {
			return pacienteList;
		} else {
			return new ArrayList<Paciente>();
		}
	}
     		
	public Paciente findByIdPaciente(Long idPaciente) throws RecordNotFoundException{
		Optional<Paciente> paciente = repo.findByIdPaciente(idPaciente);
		if(paciente.isPresent()) {
			return paciente.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public Paciente createPaciente(Paciente paciente){
		return repo.save(paciente);
	}

	public Paciente updatePaciente(Paciente paciente) throws RecordNotFoundException {
		Optional<Paciente> pacienteTemp = repo.findByIdPaciente(paciente.getIdPaciente());
	
		if(pacienteTemp.isPresent()){
			return repo.save(paciente);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deletePacienteByIdPaciente(Long idPaciente) throws RecordNotFoundException{
		Optional<Paciente> paciente = repo.findByIdPaciente(idPaciente);
		if(paciente.isPresent()) {
		repo.deleteByIdPaciente(idPaciente);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
