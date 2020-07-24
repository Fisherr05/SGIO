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
@Table(name = "paciente_table")
public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPaciente;
	
	private String cedPaciente;
	private String nombresPaciente;
	private String apellidosPaciente;
	private String direccionPaciente;
	private String emailPaciente;
	private String telefonoPaciente;
	private String alergiasPaciente;
	private String edadPaciente;
	private String observacionesPaciente;
	
	public Long getIdPaciente() {
		return idPaciente;
	}
	
	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	public String getCedPaciente() {
		return cedPaciente;
	}
	
	public void setCedPaciente(String cedPaciente) {
		this.cedPaciente = cedPaciente;
	}
	
	public String getNombresPaciente() {
		return nombresPaciente;
	}
	
	public void setNombresPaciente(String nombresPaciente) {
		this.nombresPaciente = nombresPaciente;
	}
	
	public String getApellidosPaciente() {
		return apellidosPaciente;
	}
	
	public void setApellidosPaciente(String apellidosPaciente) {
		this.apellidosPaciente = apellidosPaciente;
	}
	
	public String getDireccionPaciente() {
		return direccionPaciente;
	}
	
	public void setDireccionPaciente(String direccionPaciente) {
		this.direccionPaciente = direccionPaciente;
	}
	
	public String getEmailPaciente() {
		return emailPaciente;
	}
	
	public void setEmailPaciente(String emailPaciente) {
		this.emailPaciente = emailPaciente;
	}
	
	public String getTelefonoPaciente() {
		return telefonoPaciente;
	}
	
	public void setTelefonoPaciente(String telefonoPaciente) {
		this.telefonoPaciente = telefonoPaciente;
	}
	
	public String getAlergiasPaciente() {
		return alergiasPaciente;
	}
	
	public void setAlergiasPaciente(String alergiasPaciente) {
		this.alergiasPaciente = alergiasPaciente;
	}
	
	public String getEdadPaciente() {
		return edadPaciente;
	}
	
	public void setEdadPaciente(String edadPaciente) {
		this.edadPaciente = edadPaciente;
	}
	
	public String getObservacionesPaciente() {
		return observacionesPaciente;
	}
	
	public void setObservacionesPaciente(String observacionesPaciente) {
		this.observacionesPaciente = observacionesPaciente;
	}
	
}
