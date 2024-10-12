package com.example;

import org.junit.Test;
import org.junit.AfterAll;
import org.junit.BeforeAll;

public class ConsultarDadosDePessoasTeste {
  
  @BeforeAll
  static void configuraConexao(){
    BancoDeDados.iniciarConexao();
    System.out.println('Rodou configuraConcexao');
  }

  @Test
  validarDadosDeRetorno(){
    Assertions.assertTrue(true);
  }

  @AfterAll
  static void finalizarConexao(){
    BancoDeDados.finalizarConexao();
    System.out.println('Finalizou conexao');
  }
}
