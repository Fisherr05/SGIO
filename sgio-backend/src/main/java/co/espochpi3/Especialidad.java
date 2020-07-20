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
@Table(name = "Especialidad")
public class Especialidad {
	@Id
	@Column(name="id_especialidad")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEspecialidad;
	
	@Column(name="id_doctor", nullable=false)
	private Long idDoctor;
	
	@Column(name="Espacialidad", nullable=false, length=50)
	private String Especialidad;
	
	public Long getIdEspecialidad() {
		return idEspecialidad;
	}
	
	public void setIdEspecialidad(Long idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	
	public Long getIdDoctor() {
		return idDoctor;
	}
	
	public void setIdDoctor(Long idDoctor) {
		this.idDoctor = idDoctor;
	}
	
	public String getEspecialidad() {
		return Especialidad;
	}
	
	public void setEspecialidad(String Especialidad) {
		this.Especialidad = Especialidad;
	}
	
}
