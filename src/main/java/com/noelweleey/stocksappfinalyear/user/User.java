package com.noelweleey.stocksappfinalyear.user;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private Long userID;

    private String FirstName;

    private String LastName
}
