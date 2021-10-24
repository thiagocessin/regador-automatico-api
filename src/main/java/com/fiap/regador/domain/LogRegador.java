package com.fiap.regador.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class LogRegador implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String deviceUUID;
	private String regadorID;
	private String info;
	private BigDecimal porcentagem;
	private String horario;

	public LogRegador() {

	}

	public LogRegador(String info, BigDecimal porcentagem, String horario, String deviceUUID, String regadorID) {
		super();
		this.info = info;
		this.porcentagem = porcentagem;
		this.horario = horario;
		this.deviceUUID = deviceUUID;
		this.regadorID = regadorID;
	}

	public String getDeviceUUID() {
		return deviceUUID;
	}

	public void setDeviceUUID(String deviceUUID) {
		this.deviceUUID = deviceUUID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
