package dio.JavaBasico.DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o primeiro número");
    int numeroUm = scan.nextInt();

    System.out.println("Digite o segundo número");
    int numeroDois = scan.nextInt();

    try{
      contar(numeroUm, numeroDois);

    }catch(ParametrosInvalidosException e){
        System.out.println("O segundo número deve ser maior do que o primeiro");
    }
  }
  static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException{
    if(numeroUm > numeroDois){
      throw new ParametrosInvalidosException();
    }
    
    int contagem = numeroDois - numeroUm;
      for(int contador = 1; contador <= contagem; contador++){
        System.out.println("Imprmindo o número " + contador);
      }
  }
}
