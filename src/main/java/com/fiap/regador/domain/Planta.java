package com.fiap.regador.domain;

import java.io.Serializable;

public class Planta implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;

	public Planta() {
		super();
	}

	public Planta(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
