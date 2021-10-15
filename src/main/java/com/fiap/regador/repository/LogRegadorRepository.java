package com.fiap.regador.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fiap.regador.domain.LogRegador;

@Repository
public interface LogRegadorRepository extends MongoRepository<LogRegador, String> {

}
