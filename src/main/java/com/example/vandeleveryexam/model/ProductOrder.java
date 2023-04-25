package com.example.vandeleveryexam.model;

import jakarta.persistence.*;

@Entity
public class ProductOrder {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private int quantity;


  @ManyToOne
  @JoinColumn(name="prodId", referencedColumnName = "productId")
  private Product product;

  @ManyToOne
  @JoinColumn(name="DelId", referencedColumnName = "deleveryId")
  private Delevery delevery;

}
