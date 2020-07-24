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
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;	
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
	
@Entity
@Table(name = "doctor_table")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDoctor;
	
	private String cedDoctor;
	private String nombresDoctor;
	private String apellidosDoctor;
	private String especialidadDoctor;
	private String direccionDoctor;
	private String telefonoDoctor;
	
	public Long getIdDoctor() {
		return idDoctor;
	}
	
	public void setIdDoctor(Long idDoctor) {
		this.idDoctor = idDoctor;
	}
	
	public String getCedDoctor() {
		return cedDoctor;
	}
	
	public void setCedDoctor(String cedDoctor) {
		this.cedDoctor = cedDoctor;
	}
	
	public String getNombresDoctor() {
		return nombresDoctor;
	}
	
	public void setNombresDoctor(String nombresDoctor) {
		this.nombresDoctor = nombresDoctor;
	}
	
	public String getApellidosDoctor() {
		return apellidosDoctor;
	}
	
	public void setApellidosDoctor(String apellidosDoctor) {
		this.apellidosDoctor = apellidosDoctor;
	}
	
	public String getEspecialidadDoctor() {
		return especialidadDoctor;
	}
	
	public void setEspecialidadDoctor(String especialidadDoctor) {
		this.especialidadDoctor = especialidadDoctor;
	}
	
	public String getDireccionDoctor() {
		return direccionDoctor;
	}
	
	public void setDireccionDoctor(String direccionDoctor) {
		this.direccionDoctor = direccionDoctor;
	}
	
	public String getTelefonoDoctor() {
		return telefonoDoctor;
	}
	
	public void setTelefonoDoctor(String telefonoDoctor) {
		this.telefonoDoctor = telefonoDoctor;
	}
	
}
