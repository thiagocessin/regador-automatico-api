package com.fiap.regador.services;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.fiap.regador.domain.LogRegador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.regador.domain.Regador;
import com.fiap.regador.dto.RegadorDTO;
import com.fiap.regador.repository.RegadorRepository;
import com.fiap.regador.services.exception.ObjectNotFoundException;

@Service
public class RegadorService {

	@Autowired
	private RegadorRepository regadorRepositorio;

	
	public Regador insert(Regador obj) {
		obj.setId(null);
		return regadorRepositorio.save(obj);
	}
	
	public List<Regador> findAll() {
		return regadorRepositorio.findAll();
	}
	
	public Regador update(Regador obj) {
		Regador newObj = find(obj.getId());
		updateData(newObj, obj);
		return regadorRepositorio.save(newObj);
	}
	
	private void updateData(Regador newObj, Regador obj) {
		newObj.setContador(obj.getContador()+1);
	}
	
	public Optional<Regador> findById(String id) {
		return regadorRepositorio.findById(id);
	}
	
	public Regador find(String id) {
		Optional<Regador> obj = regadorRepositorio.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Regador.class.getName()));
	}
	
	public Regador fromDTO(RegadorDTO dto) {
		return new Regador(dto.getDeviceUUID(), dto.getContador(), dto.getPlanta());
		
	}
}
