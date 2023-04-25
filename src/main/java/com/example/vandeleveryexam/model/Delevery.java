package com.example.vandeleveryexam.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Delevery {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int deleveryId;
  private LocalDate deleveryDate;
  private String wearhouse;
  private String destination;

  @OneToMany(mappedBy = "delevery")
  @JsonBackReference
  private Set<ProductOrder> productOrders = new HashSet<>();

  public int getDeleveryId() {
    return deleveryId;
  }

  public void setDeleveryId(int deleveryId) {
    this.deleveryId = deleveryId;
  }

  public LocalDate getDeleveryDate() {
    return deleveryDate;
  }

  public void setDeleveryDate(LocalDate deleveryDate) {
    this.deleveryDate = deleveryDate;
  }

  public String getWearhouse() {
    return wearhouse;
  }

  public void setWearhouse(String wearhouse) {
    this.wearhouse = wearhouse;
  }

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    destination = destination;
  }
}
