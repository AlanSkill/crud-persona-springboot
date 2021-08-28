package com.springboot.app.persona.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.persona.models.entity.Persona;
import com.springboot.app.persona.models.service.IPersonaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	private IPersonaService personaService;
	//Trae Todos los registros
	@GetMapping("/")
	public List<Persona> listar(){
		return personaService.findAll();
	}
	//Trae Uno por id
	@GetMapping("/{id}")
	public Persona detalle(@PathVariable("id") Long id) {
		return personaService.findById(id);
	}
	//Elimina Uno por id
	@DeleteMapping("/{id}")
	public void deleteUsuario(@PathVariable("id") Long id) {  
		personaService.delete(id); 
	} 
	//Crea o modifica Uno
	@PostMapping("/")  
	private Long savePersona(@RequestBody Persona persona)   
	{  
		personaService.saveOrUpdate(persona);  
		return persona.getId();  
	} 
}
