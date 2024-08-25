package dio.JavaBasico.EstruturasExcepcionais;

public class EstruturasExcepcionais{
  public static void main(String[] args) {
    
  }
/*
Tratamento de exceções
  Exceções são um fluxo não pevisto pela aplicação,
  que evita a aplição parar
  Dev precisa prever esses casos e fazer o tratamento de exceções
  Try =
    bloco de código que vai ser testado
  Catch =
    define o bloco de código a ser executado,
  caso ocorra o erro no bloco try
  Finally =
    Define um código a ser excutado independente de ocorrer erro ou não
    Esse é opcional
  
  Try {
    código conforme esperado
  }
    catch(Exception e){
      Precisamos saber qual a exceção
      Bloco captura  as exceções que podem acontecer
      Em caso de um fluxo não previsto
    }

Hierarquia das exceções e exceções customizadas
  Java dispõe de uma variedade de classes de exceções
  São organizadas por:
    Checked and Unchecked Exceptions
    Exceções Checadas e não checadas
    O que determina uma exceção checada ou não checada?
      É o risco dela ser disparada logo você precisa tratá-la
      RuntimeException
        O erro pode acontecer mas não precisa de tratamento prévio
      Exception
        Precisa de um tratamento de erros imediatamente
      
*/
}