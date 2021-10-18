package com.fiap.regador.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fiap.regador.domain.LogRegador;
import com.fiap.regador.domain.Regador;
import com.fiap.regador.dto.RegadorDTO;
import com.fiap.regador.services.RegadorService;

@RestController
@RequestMapping(value = "/regador")
public class RegadorResource {

	@Autowired
	private RegadorService regadorService;

	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody RegadorDTO objDto) {
		
		Regador obj = regadorService.fromDTO(objDto);
		
		obj = regadorService.insert(obj);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Regador>> findAll() {

		List<Regador> list = regadorService.findAll();

		return ResponseEntity.ok(list);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Regador> find(@PathVariable String id) {
		Regador obj = regadorService.find(id);
		return ResponseEntity.ok(obj);
	}
	
	
	

	
	

}
