package com.mongo.crud.repository;

import com.mongo.crud.model.Relationship;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RelRepo extends MongoRepository<Relationship,String> {

    List<Relationship> findByConnPartyName(String connPartyName);
}
