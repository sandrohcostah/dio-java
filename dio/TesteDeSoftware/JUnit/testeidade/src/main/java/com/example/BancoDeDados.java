package com.example;

import java.util.logging.Logger;

public class BancoDeDados {
  
  private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

  public static void iniciarConexao(){
    LOGGER.into('Iniciou conexao');
  }

  public static void finalizarConexao(){
    LOGGER.into('Finalizou conexao');
  }

  
}
