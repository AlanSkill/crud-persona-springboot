package com.springboot.app.persona.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.app.persona.models.entity.Persona;
/**
 * Interface que extiende las operaciones CRUD del patron repository utilizado por Spring Data
 */
public interface PersonaDao extends CrudRepository<Persona, Long> {

}
