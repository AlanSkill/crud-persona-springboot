package com.springboot.app.persona.models.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.persona.models.dao.PersonaDao;
import com.springboot.app.persona.models.entity.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private PersonaDao personaDao; 
	
	@Override
	@Transactional(readOnly = true)
	public List<Persona> findAll() {
		List<Persona> personas = new ArrayList<>();
		personaDao.findAll().forEach(persona -> personas.add(persona));
		return personas;
	}

	@Override
	@Transactional(readOnly = true)
	public Persona findById(Long id) {
		return personaDao.findById(id).orElse(null);
	}

	@Override
	public void saveOrUpdate(Persona persona) {
		personaDao.save(persona);
		
	}

	@Override
	public void delete(Long id) {
		personaDao.deleteById(id);
		
	}

}
