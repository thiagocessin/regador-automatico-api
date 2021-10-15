package com.fiap.regador.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.regador.domain.LogRegador;
import com.fiap.regador.repository.LogRegadorRepository;

@Service
public class LogRegadorService {

	@Autowired
	private LogRegadorRepository logRegadorRepo;
	

	public List<LogRegador> findAll() {
		return logRegadorRepo.findAll();
	}
	
	
}
