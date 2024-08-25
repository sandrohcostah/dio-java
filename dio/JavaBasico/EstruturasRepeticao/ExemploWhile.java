package dio.JavaBasico.EstruturasRepeticao;
import java.util.concurrent.ThreadLocalRandom;;

public class ExemploWhile {
  public static void main(String[] args) {
    double mesada = 50.0;

    while(mesada>0){
      double valorDoce = valorAleatorio();
      /* parte criada apenas para não dar uma vlaor negativo...
      if(valorDoce > mesada)
          valorDoce = mesada;
      */
      System.out.println("Doce do valor: " + valorDoce + "Adicionado no carrinho");
      mesada = mesada - valorDoce;
    }
    System.out.println("Mesada: " + mesada);
    System.out.println("Joãozinho gastou toda a dua mesada em doces");
  }

  //Método retorna um valor entre 2 e 8
  private static double valorAleatorio(){
    return ThreadLocalRandom.current().nextDouble(2,8);
  }
}
