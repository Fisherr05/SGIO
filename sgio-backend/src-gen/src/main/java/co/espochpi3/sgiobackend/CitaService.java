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

import co.espochpi3.sgiobackend.Cita;
import co.espochpi3.sgiobackend.RecordNotFoundException;
import co.espochpi3.sgiobackend.CitaRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CitaService {

	@Autowired
	CitaRepository repo;

	public List<Cita> getAll(){
		List<Cita> citaList = repo.findAll();
		if(citaList.size() > 0) {
			return citaList;
		} else {
			return new ArrayList<Cita>();
		}
	}
     		
	public Cita findByIdCita(Long idCita) throws RecordNotFoundException{
		Optional<Cita> cita = repo.findByIdCita(idCita);
		if(cita.isPresent()) {
			return cita.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public Cita createCita(Cita cita){
		return repo.save(cita);
	}

	public Cita updateCita(Cita cita) throws RecordNotFoundException {
		Optional<Cita> citaTemp = repo.findByIdCita(cita.getIdCita());
	
		if(citaTemp.isPresent()){
			return repo.save(cita);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deleteCitaByIdCita(Long idCita) throws RecordNotFoundException{
		Optional<Cita> cita = repo.findByIdCita(idCita);
		if(cita.isPresent()) {
		repo.deleteByIdCita(idCita);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
