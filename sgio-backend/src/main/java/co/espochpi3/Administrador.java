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
@Table(name = "administrador_table")
public class Administrador {
	@Id
	@Column(name="id_administrador")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAdministrador;
	
	@Column(name="Usuario", nullable=false, length=50)
	private String usuario;
	
	@Column(name="Contraseña", nullable=false, length=50)
	private String password;
	
	public Long getIdAdministrador() {
		return idAdministrador;
	}
	
	public void setIdAdministrador(Long idAdministrador) {
		this.idAdministrador = idAdministrador;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
