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
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;	
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
	
@Entity
@Table(name = "Cita")
public class Cita {
	@Id
	@Column(name="id_cita")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCita;
	
	@Column(name="id_paciente", nullable=false)
	private Long idPaciente;
	
	@Column(name="id_doctor", nullable=false)
	private Long idDoctor;
	
	@Column(name="Fecha_Cita", nullable=false)
	private LocalDate fechaCita;
	
	@Column(name="Hora_Cita", nullable=false)
	private LocalTime horaCita;
	
	public Long getIdCita() {
		return idCita;
	}
	
	public LocalDate getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDate fechaCita) {
		this.fechaCita = fechaCita;
	}

	public LocalTime getHoraCita() {
		return horaCita;
	}

	public void setHoraCita(LocalTime horaCita) {
		this.horaCita = horaCita;
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
	

	
}
