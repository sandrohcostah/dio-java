package com.spring.gradle.publicando_rest_api.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name= "tb_account")
public class Account {
  
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;

  //Numero da conta será unique
  @Column(unique=true)
  private String number;
  
  private String agency;
  
  //13 = 11 inteiros e 2 = duas casas decimais de escala (00000000000.00)
  @Column(precision= 13, scale= 2)
  private BigDecimal balance;

  //limit pode ser palavra reservada, então name = "additional_limit" altera o nome
  //nullable = false (Se quiser evitar que vá um valor nulo para tabela)
  @Column(name = "additional_limit", precision= 13, scale= 2)
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
  public String getAgency() {
    return agency;
  }
  public void setAgency(String agency) {
    this.agency = agency;
  }
  public BigDecimal getBalance() {
    return balance;
  }
  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }
  public BigDecimal getLimit() {
    return limit;
  }
  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

}
