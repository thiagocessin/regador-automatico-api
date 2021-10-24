package com.fiap.regador.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class LogRegadorDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	private String deviceUUID;
	private String regadorID;
	private String info;
	private BigDecimal porcentagem;
	private String horario;
	
	public LogRegadorDTO() {
	}

	public LogRegadorDTO(String deviceUUID, String regadorID, String info, BigDecimal porcentagem, String horario) {
		super();
		this.deviceUUID = deviceUUID;
		this.regadorID = regadorID;
		this.info = info;
		this.porcentagem = porcentagem;
		this.horario = horario;
	}

	public String getDeviceUUID() {
		return deviceUUID;
	}

	public void setDeviceUUID(String deviceUUID) {
		this.deviceUUID = deviceUUID;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public BigDecimal getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(BigDecimal porcentagem) {
		this.porcentagem = porcentagem;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getRegadorID() {
		return regadorID;
	}

	public void setRegadorID(String regadorID) {
		this.regadorID = regadorID;
	}
}
