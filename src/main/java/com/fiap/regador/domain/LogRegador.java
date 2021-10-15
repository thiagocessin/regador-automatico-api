package com.fiap.regador.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class LogRegador implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String info;

	private BigDecimal porcentagem;

	private Date horario;

	public LogRegador() {

	}

	public LogRegador(String info, BigDecimal porcentagem, Date horario) {
		super();
		this.info = info;
		this.porcentagem = porcentagem;
		this.horario = horario;
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

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

}
