package com.fiap.regador.repository;

import com.fiap.regador.domain.Regador;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.fiap.regador.domain.LogRegador;

import java.util.Optional;

@Repository
public interface LogRegadorRepository extends MongoRepository<LogRegador, String> {
    @Query("{ 'deviceUUID': ?0, 'regadorID': ?1}")
    Iterable<LogRegador> findByDeviceUUIDAAndRegadorID(String deviceUUID, String regadorID);
}
