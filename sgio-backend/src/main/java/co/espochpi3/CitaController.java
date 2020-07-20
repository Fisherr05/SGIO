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

import co.espochpi3.Cita;
import co.espochpi3.RecordNotFoundException;
import co.espochpi3.CitaService;
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
public class CitaController {
	@Autowired
	CitaService service;
	
	@GetMapping("/cita")
	public ResponseEntity<List<Cita>> getAll() {
		List<Cita> list = service.getAll();
		return new ResponseEntity<List<Cita>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/cita/{id}")
	public ResponseEntity<Cita> getCitaByIdCita(@PathVariable("id") Long idCita) throws RecordNotFoundException {
		Cita entity = service.findByIdCita(idCita);
		return new ResponseEntity<Cita>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/cita")
	public ResponseEntity<Cita> createCita(@RequestBody Cita cita){
		service.createCita(cita);
		return new ResponseEntity<Cita>(cita, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/cita")
	public ResponseEntity<Cita> updateCita(@RequestBody Cita cita) throws RecordNotFoundException{
		service.updateCita(cita);
		return new ResponseEntity<Cita>(cita, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/cita/{id}")
	public HttpStatus deleteCitaByIdCita(@PathVariable("id") Long idCita) throws RecordNotFoundException {
		service.deleteCitaByIdCita(idCita);
		return HttpStatus.OK;
	}
}				
