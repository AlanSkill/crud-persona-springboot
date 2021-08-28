package com.springboot.app.persona.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {
	
	private static final long serialVersionUID = 809877920074973999L;
	
	@Id
	@Column(name="id",updatable=false,nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	@Pattern(regexp = "^[A-Z]([a-zA-Z]|\\.| |)+$", message = "El nombre debe tener caracteres A-Z, a-z y espacios, siempre empezando con mayuscula")
	@Size(min = 1,max = 100, message ="El nombre debe tener de 1 a 100 caracteres máximo")
	private String nombre;
	
	@Column(name="primer_apellido")
	@Pattern(regexp = "^[A-Z]([a-zA-Z]|\\.| |)+$", message = "El A. paterno debe tener caracteres A-Z, a-z y espacios, siempre empezando con mayuscula")
	@Size(min = 1, max = 100, message ="El apellido paterno debe tener de 1 a 100 caracteres máximo")
	private String primerApellido;
	
	@Column(name="segundo_apellido")
	@Pattern(regexp = "^[A-Z]([a-zA-Z]|\\.| |)+$", message = "El A. materno debe tener caracteres A-Z, a-z y espacios, siempre empezando con mayuscula")
	@Size(min = 1, max = 100, message ="El apellido materno debe tener de 1 a 100 caracteres máximo")
	private String segundoApellido;
	
	@Column(name="telefono")
	@Pattern(regexp = "^[2-9]{2}\\d{8}+$", message = "El telefono solo debe llevar numeros")
	@Size(min = 10, max = 10, message ="El telefono debe ser una cadena de 10 digitos")
	private String telefono;
	
	@Column(name="estatus")
	private String estatus;
	
	public Persona (){
		
	}
	/**
	 * Constructor que recibe el objeto
	 * @param persona - El objeto de entidad
	 */
	public Persona(Persona persona){
		this.id = persona.getId();
		this.nombre = persona.getNombre();
		this.primerApellido = persona.getPrimer_apellido();
		this.segundoApellido = persona.getSegundo_apellido();
		this.telefono =persona.getTelefono();
		this.estatus = persona.getEstatus();
		
	}
	/**
	 * Constructor que recibe los valores por separados
	 * @param id - El id de la entidad
	 * @param nombre - El nombre de la entidad
	 */
	public Persona(Long id, String nombre, String primer_apellido, String segundo_apellido, String telefono, String estatus){
		this.id = id;
		this.nombre = nombre;
		this.primerApellido = primer_apellido;
		this.segundoApellido = segundo_apellido;
		this.telefono = telefono;
		this.estatus = estatus;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimer_apellido() {
		return primerApellido;
	}
	public void setPrimer_apellido(String primer_apellido) {
		this.primerApellido = primer_apellido;
	}
	public String getSegundo_apellido() {
		return segundoApellido;
	}
	public void setSegundo_apellido(String segundo_apellido) {
		this.segundoApellido = segundo_apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id +  
						", nombre=" + nombre + 
						", primer_apellido=" + primerApellido +
						", segundo_apellido=" + segundoApellido +
						", estatus=" + estatus +
						", telefono=" + telefono  +"]";
	}
	
}
