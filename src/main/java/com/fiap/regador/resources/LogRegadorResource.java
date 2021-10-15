package com.fiap.regador.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.regador.domain.LogRegador;
import com.fiap.regador.services.LogRegadorService;

@RestController
@RequestMapping(value = "/log")
public class LogRegadorResource {

	@Autowired
	private LogRegadorService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<LogRegador>> findAll() {

		List<LogRegador> list = service.findAll();

		return ResponseEntity.ok(list);
	}
	
	

}
