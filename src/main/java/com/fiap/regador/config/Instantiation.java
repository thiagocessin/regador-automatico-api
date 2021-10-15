package com.fiap.regador.config;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.fiap.regador.domain.LogRegador;
import com.fiap.regador.repository.LogRegadorRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private LogRegadorRepository infoRepository;
	
	@Override
	public void run(String... args) throws Exception {

		cargaInicial();
	}

	private void cargaInicial() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

		//infoRepository.deleteAll();

		LogRegador info = new LogRegador("Regando planta 1", new BigDecimal(30),new Date());

		infoRepository.saveAll(Arrays.asList(info));

		

	}

}
