package com.fiap.regador.repository;

import com.fiap.regador.domain.LogRegador;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.fiap.regador.domain.Regador;

import java.util.Optional;

@Repository
public interface RegadorRepository extends MongoRepository<Regador, String> { }
