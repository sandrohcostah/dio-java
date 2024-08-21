package dio.EstruturasCondicionais;

public class EstruturasCondicionais {
    public static void main(String[] args) {
      
    }
/*
Estruturas Condicionais
  if-else, switch-case
Estruturas de repetição
  for, while, do-while
Estruturas de exceções
  try-catch-finally

Condicional Simples
  Só há um fluxo, true ou false
  if(valorSolicitado < saldo) Só há fluxo se o valorSolicitado for menor que o saldo
      saldo = saldo - valorSolicitado;

Condicional Composta
  Segue mais de um fluxo,
  Se for true segue um fluxo, se for false segue outro
  if(nota >= 7)
      System.out.println("Aprovado");
    else
      System.out.println("Reprovado");

Condicional Encadeada
  Não se limita a apenas uma condição
  int nota = 6;

    if(nota >= 7)
    System.out.println("Aprovado");

      else if(nota >5 && nota <7)
        System.out.println("Recuperação");

    else
      System.out.println("Reprovado");

Condição Ternária
  Abreviação dos controles de fluxo
  int nota = 7;
    //Se nota for menor ou igual a 7
    //? = Então "Aprovado"
    //: = Senão "Reprovado"
    String resutado = nota >=7 ? "Aprovado" : "Reprovado";

    //Exemplo com else if
    String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
    System.out.println(resutado);

*/
}
