package com.uca.ejemplo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(schema="public", name="estudiante")
public class Estudiante {
	
	@Id
	@Column(name="c_usuario")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cUsuario;
	
	@Column(name="nombre")
	@Size(max=20, message="No se puede exceder de 20 caracteres")
	@NotEmpty(message="Debes ingresar algo")
	private String nombre;
	
	@Column(name="apellido")
	@Size(max=20, message="No se puede exceder de 20 caracteres")
	@NotEmpty(message="Debes ingresar algo")
	private String apellido;
	
	@Column(name="carne")
	@Size(min=8, max=8, message="El carnet debe tener 8 caracteres")
	@NotEmpty(message="Debes ingresar algo")
	private String carne;
	
	@Column(name="carrera")
	@Size(max=50, message="No se puede exceder de 50 caracteres")
	@NotEmpty(message="Debes ingresar algo")
	private String carrera;
	
	public Estudiante(){
		
	}

	public Integer getcUsuario() {
		return cUsuario;
	}

	public void setcUsuario(Integer cUsuario) {
		this.cUsuario = cUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCarne() {
		return carne;
	}

	public void setCarne(String carne) {
		this.carne = carne;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
	
	/*@Id
	@Column(name="id_estudiante")
	private Integer codigoEstudiante;
	
	@Column(name="nombre")
	private String Nombre;
	
	@Column(name="apellido")
	private String Apellido;
	
	@Column(name="edad")
	private Integer Edad;
	
	@Column(name="estado")
	private Boolean Estado;
	
	public Estudiante() {
		
	}
	
	public Integer getCodigoEstudiante() {
		return codigoEstudiante;
	}
	public void setCodigoEstudiante(Integer codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public Integer getEdad() {
		return Edad;
	}
	public void setEdad(Integer edad) {
		Edad = edad;
	}
	public Boolean getEstado() {
		return Estado;
	}
	public void setEstado(Boolean estado) {
		Estado = estado;
	}
	public String getEstadoDelegate() {
		if(this.Estado == null)return "";
		else {
			return Estado == true ?"Activo":"Inactivo";
		}
	}*/
	
	

}
