package com.fiap.regador.dto;

import java.io.Serializable;

import com.fiap.regador.domain.Planta;

public class RegadorDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String deviceUUID;

	private Integer contador;

	private Planta planta;
	
	

	public String getDeviceUUID() {
		return deviceUUID;
	}

	public void setDeviceUUID(String deviceUUID) {
		this.deviceUUID = deviceUUID;
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

}
