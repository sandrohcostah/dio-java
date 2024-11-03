package com.spring.gradle.publicando_rest_api.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_card")
public class Card {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;

  //Numeros do cartão unicos
  @Column(unique = true)
  private String number;

  //limit pode ser palavra reservada, então name = "availble_limit" altera o nome
  //13 = 11 inteiros e 2 = duas casas decimais de escala (00000000000.00)
  @Column(name = "availble_limit", precision=13, scale=2)
  private BigDecimal limit;
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }
  public BigDecimal getLimit() {
    return limit;
  }
  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }
}
