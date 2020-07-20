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

import co.espochpi3.sgiobackend.Paciente;
import co.espochpi3.sgiobackend.RecordNotFoundException;
import co.espochpi3.sgiobackend.PacienteService;
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
public class PacienteController {
	@Autowired
	PacienteService service;
	
	@GetMapping("/paciente")
	public ResponseEntity<List<Paciente>> getAll() {
		List<Paciente> list = service.getAll();
		return new ResponseEntity<List<Paciente>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/paciente/{id}")
	public ResponseEntity<Paciente> getPacienteByIdPaciente(@PathVariable("id") Long idPaciente) throws RecordNotFoundException {
		Paciente entity = service.findByIdPaciente(idPaciente);
		return new ResponseEntity<Paciente>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/paciente")
	public ResponseEntity<Paciente> createPaciente(@RequestBody Paciente paciente){
		service.createPaciente(paciente);
		return new ResponseEntity<Paciente>(paciente, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/paciente")
	public ResponseEntity<Paciente> updatePaciente(@RequestBody Paciente paciente) throws RecordNotFoundException{
		service.updatePaciente(paciente);
		return new ResponseEntity<Paciente>(paciente, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/paciente/{id}")
	public HttpStatus deletePacienteByIdPaciente(@PathVariable("id") Long idPaciente) throws RecordNotFoundException {
		service.deletePacienteByIdPaciente(idPaciente);
		return HttpStatus.OK;
	}
}				
