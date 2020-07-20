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

import co.espochpi3.Doctor;
import co.espochpi3.RecordNotFoundException;
import co.espochpi3.DoctorRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

	@Autowired
	DoctorRepository repo;

	public List<Doctor> getAll(){
		List<Doctor> doctorList = repo.findAll();
		if(doctorList.size() > 0) {
			return doctorList;
		} else {
			return new ArrayList<Doctor>();
		}
	}
     		
	public Doctor findByIdDoctor(Long idDoctor) throws RecordNotFoundException{
		Optional<Doctor> doctor = repo.findByIdDoctor(idDoctor);
		if(doctor.isPresent()) {
			return doctor.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public Doctor createDoctor(Doctor doctor){
		return repo.save(doctor);
	}

	public Doctor updateDoctor(Doctor doctor) throws RecordNotFoundException {
		Optional<Doctor> doctorTemp = repo.findByIdDoctor(doctor.getIdDoctor());
	
		if(doctorTemp.isPresent()){
			return repo.save(doctor);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deleteDoctorByIdDoctor(Long idDoctor) throws RecordNotFoundException{
		Optional<Doctor> doctor = repo.findByIdDoctor(idDoctor);
		if(doctor.isPresent()) {
		repo.deleteByIdDoctor(idDoctor);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
