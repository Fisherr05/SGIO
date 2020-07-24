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
import co.espochpi3.AdministradorService;
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
public class AdministradorController {
	@Autowired
	AdministradorService service;
	
	@GetMapping("/administrador")
	public ResponseEntity<List<Administrador>> getAll() {
		List<Administrador> list = service.getAll();
		return new ResponseEntity<List<Administrador>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/administrador/{id}")
	public ResponseEntity<Administrador> getAdministradorByIdAdministrador(@PathVariable("id") Long idAdministrador) throws RecordNotFoundException {
		Administrador entity = service.findByIdAdministrador(idAdministrador);
		return new ResponseEntity<Administrador>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/administrador")
	public ResponseEntity<Administrador> createAdministrador(@RequestBody Administrador administrador){
		service.createAdministrador(administrador);
		return new ResponseEntity<Administrador>(administrador, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/administrador")
	public ResponseEntity<Administrador> updateAdministrador(@RequestBody Administrador administrador) throws RecordNotFoundException{
		service.updateAdministrador(administrador);
		return new ResponseEntity<Administrador>(administrador, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/administrador/{id}")
	public HttpStatus deleteAdministradorByIdAdministrador(@PathVariable("id") Long idAdministrador) throws RecordNotFoundException {
		service.deleteAdministradorByIdAdministrador(idAdministrador);
		return HttpStatus.OK;
	}
}				
