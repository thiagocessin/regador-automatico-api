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
import com.fiap.regador.dto.LogRegadorDTO;
import com.fiap.regador.services.LogRegadorService;

@RestController
@RequestMapping(value = "/log")
public class LogRegadorResource {

	@Autowired
	private LogRegadorService logRegadorService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<LogRegador>> findAll() {

		List<LogRegador> list = logRegadorService.findAll();

		return ResponseEntity.ok(list);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<LogRegador> find(@PathVariable String id) {
		LogRegador obj = logRegadorService.find(id);
		return ResponseEntity.ok(obj);
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody LogRegadorDTO objDto) {
		
		LogRegador obj = logRegadorService.fromDTO(objDto);
		
		obj = logRegadorService.insert(obj);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}
	

}
