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

import co.espochpi3.Especialidad;
import co.espochpi3.RecordNotFoundException;
import co.espochpi3.EspecialidadService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;	
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
@RestController
@RequestMapping("/api/sgio")
public class EspecialidadController {
	@Autowired
	EspecialidadService service;
	
	@GetMapping("/especialidad")
	public ResponseEntity<List<Especialidad>> getAll() {
		List<Especialidad> list = service.getAll();
		return new ResponseEntity<List<Especialidad>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/especialidad/{id}")
	public ResponseEntity<Especialidad> getEspecialidadByIdEspecialidad(@PathVariable("id") Long idEspecialidad) throws RecordNotFoundException {
		Especialidad entity = service.findByIdEspecialidad(idEspecialidad);
		return new ResponseEntity<Especialidad>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/especialidad")
	public ResponseEntity<Especialidad> createEspecialidad(@RequestBody Especialidad especialidad){
		service.createEspecialidad(especialidad);
		return new ResponseEntity<Especialidad>(especialidad, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/especialidad")
	public ResponseEntity<Especialidad> updateEspecialidad(@RequestBody Especialidad especialidad) throws RecordNotFoundException{
		service.updateEspecialidad(especialidad);
		return new ResponseEntity<Especialidad>(especialidad, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/especialidad/{id}")
	public HttpStatus deleteEspecialidadByIdEspecialidad(@PathVariable("id") Long idEspecialidad) throws RecordNotFoundException {
		service.deleteEspecialidadByIdEspecialidad(idEspecialidad);
		return HttpStatus.OK;
	}
}				
