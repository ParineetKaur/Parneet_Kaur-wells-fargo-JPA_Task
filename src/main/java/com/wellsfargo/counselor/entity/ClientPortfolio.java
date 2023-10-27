package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class ClientPortfolio { // Corrected class name with an uppercase 'C'
    @Id
    @GeneratedValue
    private Long portfolioID; // Missing field for the primary key

    @ManyToOne
    @JoinColumn(name = "clientID")
    private Client client; // Client referenced as a foreign key

    @Column(nullable = false)
    private Date creationDate;

    public ClientPortfolio() {} // Default constructor

    public ClientPortfolio(Client client, Date creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}

  