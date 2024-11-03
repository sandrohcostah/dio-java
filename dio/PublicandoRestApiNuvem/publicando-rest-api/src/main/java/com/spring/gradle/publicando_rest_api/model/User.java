package com.spring.gradle.publicando_rest_api.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;

  //Quando usuário for deletado, a conta é deletada junto
  //OneToOne = relacionamento um pra um
  @OneToOne(cascade = CascadeType.ALL)
  private Account account;

  @OneToOne(cascade = CascadeType.ALL)
  private Card card;

  //Relacionamento um pra muitos @OneToMany
  //Fetchtype.EAGER = Toda vez que buscar um usuário no banco,
  //trazer todas as festures dele, porque sempre vou precisar delas
  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private List<Feature> features;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private List<News> news;
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public Account getAccount() {
    return account;
  }
  public void setAccount(Account account) {
    this.account = account;
  }
  public Card getCard() {
    return card;
  }
  public void setCard(Card card) {
    this.card = card;
  }
  public List<Feature> getFeatures() {
    return features;
  }
  public void setFeatures(List<Feature> features) {
    this.features = features;
  }
  public List<News> getNews() {
    return news;
  }
  public void setNews(List<News> news) {
    this.news = news;
  }

}
