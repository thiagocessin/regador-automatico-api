package com.fiap.regador.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Regador implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private Integer contador;

	private Planta planta;

	public Regador(Integer contador, Planta planta) {
		super();
		this.contador = contador;
		this.planta = planta;
	}

	public Integer getContador() {
		return contador;
	}

	public void setContador(Integer contador) {
		this.contador = contador;
	}

	public Planta getPlanta() {
		return planta;
	}

	public void setPlanta(Planta planta) {
		this.planta = planta;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
