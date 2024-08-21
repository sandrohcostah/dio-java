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

Switch case
  Compara o valor de uma variável e para quando encontrar
  String sigla = "M";
    /* 
    if(sigla == "P")
      System.out.println("Pequeno");
    else if(sigla == "M")
      System.out.println("Médio");
    else if(sigla == "G")
      System.out.println("Grande");
    else
      System.out.println("Indefinido");

    //Exemplo do if acima em Switch-Case
    switch (sigla){
      case "P":{
        System.out.println("Pequeno");
        break;
      }
      case "M":{
        System.out.println("Médio");
        break;
      }
      case "G":{
        System.out.println("Grande");
        break;
      }
      default:
        System.out.println("Indefinido");
    }
        Sempre analisar se necessita de um switch-case,
        ou um if seria melhor... há casos e casos..
            String plano = "M";
    
            Exemplo sem o break
     * Ele começa na primeira verdadeira
     * e continua a executar o restante, em cascata
     * Nesse caso, ele vai executar o texto do case M e B
    
    switch(plano){
      case "T": {
        System.out.println("5Gb Youtube");
      }
      case "M": {
        System.out.println("Whats e instagram grátis");
      }
      case "B": {
        System.out.println("100 minutos de ligação");
      }

*/
}
