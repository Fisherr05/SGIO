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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;	
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
	
@Entity
@Table(name = "Doctor")
public class Doctor {
	@Id
	@Column(name="id_doctor")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDoctor;
	
	@Column(name="Ced_doctor", nullable=false, length=10)
	private String cedDoctor;
	
	@Column(name="Nombres", nullable=false, length=50)
	private String nombresDoctor;
	
	@Column(name="Apellidos", nullable=false, length=50)
	private String apellidosDoctor;
	
	@Column(name="Especialidad", nullable=false, length=50)
	private String especialidadDoctor;
	
	@Column(name="Direccion", nullable=false, length=80)
	private String direccionDoctor;
	
	@Column(name="Telefono", nullable=false, length=50)
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
