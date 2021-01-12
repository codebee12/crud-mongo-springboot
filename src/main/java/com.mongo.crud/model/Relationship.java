package com.mongo.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Relationship")
public class Relationship {

    @Id
    private String id;

    private String connPartyName;

    public Relationship(String id, String connPartyName) {
        this.id = id;
        this.connPartyName = connPartyName;
    }

    public Relationship() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConnPartyName() {
        return connPartyName;
    }

    public void setConnPartyName(String connPartyName) {
        this.connPartyName = connPartyName;
    }

    @Override
    public String toString() {
        return "Relationship{" +
                "id='" + id + '\'' +
                ", connPartyName='" + connPartyName + '\'' +
                '}';
    }
}
