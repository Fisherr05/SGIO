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

import co.espochpi3.Doctor;
import co.espochpi3.RecordNotFoundException;
import co.espochpi3.DoctorService;
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
public class DoctorController {
	@Autowired
	DoctorService service;
	
	@GetMapping("/doctor")
	public ResponseEntity<List<Doctor>> getAll() {
		List<Doctor> list = service.getAll();
		return new ResponseEntity<List<Doctor>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/doctor/{id}")
	public ResponseEntity<Doctor> getDoctorByIdDoctor(@PathVariable("id") Long idDoctor) throws RecordNotFoundException {
		Doctor entity = service.findByIdDoctor(idDoctor);
		return new ResponseEntity<Doctor>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/doctor")
	public ResponseEntity<Doctor> createDoctor(@RequestBody Doctor doctor){
		service.createDoctor(doctor);
		return new ResponseEntity<Doctor>(doctor, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/doctor")
	public ResponseEntity<Doctor> updateDoctor(@RequestBody Doctor doctor) throws RecordNotFoundException{
		service.updateDoctor(doctor);
		return new ResponseEntity<Doctor>(doctor, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/doctor/{id}")
	public HttpStatus deleteDoctorByIdDoctor(@PathVariable("id") Long idDoctor) throws RecordNotFoundException {
		service.deleteDoctorByIdDoctor(idDoctor);
		return HttpStatus.OK;
	}
}				
