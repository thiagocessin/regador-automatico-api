package com.fiap.regador.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.regador.domain.LogRegador;
import com.fiap.regador.dto.LogRegadorDTO;
import com.fiap.regador.repository.LogRegadorRepository;
import com.fiap.regador.services.exception.ObjectNotFoundException;

@Service
public class LogRegadorService {

	@Autowired
	private LogRegadorRepository logRegadorRepo;

	public List<LogRegador> findAll() {
		return logRegadorRepo.findAll();
	}

	public LogRegador fromDTO(LogRegadorDTO objDto) {

		return new LogRegador(objDto.getInfo(), objDto.getPorcentagem(), objDto.getHorario(), objDto.getDeviceUUID());
	}

	public LogRegador insert(LogRegador obj) {
		obj.setId(null);
		return logRegadorRepo.save(obj);
	}
	
	public LogRegador find(String id) {
		Optional<LogRegador> obj = logRegadorRepo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + LogRegador.class.getName()));
	}

}
