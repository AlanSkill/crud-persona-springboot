package com.springboot.app.persona.models.service;

import java.util.List;

import com.springboot.app.persona.models.entity.Persona;
/**
 * 
 * Interfaz publica para las operaciones de negocio de la entidad Persona
 */
public interface IPersonaService {
	public List<Persona> findAll();
	public Persona findById(Long id);
	public void saveOrUpdate(Persona persona);
	public void delete(Long id);
}
