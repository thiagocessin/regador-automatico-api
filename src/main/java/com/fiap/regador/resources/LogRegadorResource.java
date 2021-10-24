package com.fiap.regador.resources;

import java.net.URI;
import java.util.List;

import com.fiap.regador.domain.Regador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fiap.regador.domain.LogRegador;
import com.fiap.regador.dto.LogRegadorDTO;
import com.fiap.regador.services.LogRegadorService;

@RestController
@RequestMapping(value = "/log")
@CrossOrigin("*")
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

	@RequestMapping(value = "{id}/regador/{regadorID}", method = RequestMethod.GET)
	public ResponseEntity<List<LogRegador>> findByDevice(@PathVariable String id, @PathVariable String regadorID) {
		List<LogRegador> byDevice = logRegadorService.findByDevice(id, regadorID);
		return ResponseEntity.ok(byDevice);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> detele(@PathVariable String id) {
		logRegadorService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
