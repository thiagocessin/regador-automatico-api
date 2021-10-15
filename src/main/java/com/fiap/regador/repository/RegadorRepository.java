package com.fiap.regador.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fiap.regador.domain.Regador;

@Repository
public interface RegadorRepository extends MongoRepository<Regador, String> {

}
