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
@Table(name = "cita_table")
public class Cita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCita;
	
	private Long idPaciente;
	private Long idDoctor;
	private String fechaCita;
	private String horaCita;
	
	public Long getIdCita() {
		return idCita;
	}
	
	public void setIdCita(Long idCita) {
		this.idCita = idCita;
	}
	
	public Long getIdPaciente() {
		return idPaciente;
	}
	
	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	public Long getIdDoctor() {
		return idDoctor;
	}
	
	public void setIdDoctor(Long idDoctor) {
		this.idDoctor = idDoctor;
	}
	
	public String getFechaCita() {
		return fechaCita;
	}
	
	public void setFechaCita(String fechaCita) {
		this.fechaCita = fechaCita;
	}
	
	public String getHoraCita() {
		return horaCita;
	}
	
	public void setHoraCita(String horaCita) {
		this.horaCita = horaCita;
	}
	
}
