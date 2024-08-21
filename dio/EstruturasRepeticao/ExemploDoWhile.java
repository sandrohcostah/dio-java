package dio.EstruturasRepeticao;
import java.util.Random;


public class ExemploDoWhile {
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
}
