package dio.EstruturasCondicionais.ExemploSwitchCase;

public class PlanoOperadora {
  public static void main(String[] args) {
    String plano = "M";
    /*Exemplo sem o break
     * Ele começa na primeira verdadeira
     * e continua a executar o restante, em cascata
     * Nesse caso, ele vai executar o texto do case M e B
     * Com o break, ele executaria apenas o texto do M
     */
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
    }
  }
}
