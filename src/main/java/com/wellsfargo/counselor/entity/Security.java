package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class Security {
    @Id
    @GeneratedValue

    @ManyToOne
    @JoinColumn(name = "clientID")
    private ClientPortfolio portfolio; // clientPortfolio referenced as a foreign key

    @ManyToOne
    @JoinColumn(name = "advisorID")
    private Advisor advisor; // Advisor referenced as a foreign key

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private String category;

    protected Security() {

    }

    public Security(ClientPortfolio portfolio, Advisor advisor, String name, String category, double purchasePrice, Date purchaseDate, int quantity) {
        this.portfolio = portfolio;
        this.advisor = advisor;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
    }
  }




