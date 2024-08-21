package dio.EstruturasRepeticao;

import java.util.concurrent.ThreadLocalRandom;

public class EstruturasRepeticao {
  public static void main(String[] args) {
    
  }
/*
Laços de repetição = loops
Permitem que o bloco seja repetido várias vezes
For = para
  Permite que uma variável contadora seja testada e incrementada a cada iteração
  for(int carneirinhos = 1; carneirinhos <=20; carneirinhos++){
      System.out.println("Contando carneirinhos " + carneirinhos);
    }

For em arrays
  String alunos[] = {"Felipe","Jonas","Julia","Marcos"};

    for(int x=0; x<alunos.length; x++){
      System.out.println("O Aluno no indice x=" + x + " é " + alunos[x]);
    }

For each
  É o for com código resumido,
  Exemplo acima escrito com for resumido:
  String alunos[] = {"Felipe","Jonas","Julia","Marcos"};

    for(String aluno : alunos){
      System.out.println("O Aluno no indice x=" + x + " é " + alunos[x]);
    }

Break e continue
  Break interrompe o laço
  Continue continua o laço
  for(int numero = 1; numero <=5; numero ++){
      if(numero==3)
        break; //ao chegar no número 3, ele para o fluxo
        //continue; // Ao chegar no número 3,
        //ele desconsidera o 3 e continua os outros

      System.out.println(numero);
    }

While
  Enquanto uma condição for valida, o codigo será executado
  double mesada = 50.0;

    while(mesada>0){
      double valorDoce = valorAleatorio();
      /* parte criada apenas para não dar uma vlaor negativo...
      if(valorDoce > mesada)
          valorDoce = mesada;
      
      System.out.println("Doce do valor: " + valorDoce + "Adicionado no carrinho");
      mesada = mesada - valorDoce;
    }
    System.out.println("Mesada: " + mesada);
    System.out.println("Joãozinho gastou toda a dua mesada em doces");
  }

  //Método retorna um valor entre 2 e 8
  private static double valorAleatorio(){
    return ThreadLocalRandom.current().nextDouble(2,8);

Do While
  Faça... Enquanto...
  Testa após executar o código
  Se a condição for falsa, ele vai executar e depois ver se é falsa ou true
  public static void main(String[] args) {
    System.out.println("Discando...");
    do{
      //Executando até atender
      System.out.println("Telefone tocando");
    }while(tocando());

    System.out.println("Alô!!!");
  }

  private static boolean tocando(){
    //Método, o random vai retornar um valor entre 1 e 3
    //Se o valor for igual a 1 ele atendeu
    boolean atendeu = new Random().nextInt(3)==1;
    System.out.println("Atendeu: " + atendeu);
    //negano o ato de continuar tocando
    return ! atendeu; //Se atendeu, ele não está mais tocando
  }
*/
}
