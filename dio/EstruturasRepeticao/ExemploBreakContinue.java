package dio.EstruturasRepeticao;

public class ExemploBreakContinue {
  public static void main(String[] args) {
    for(int numero = 1; numero <=5; numero ++){
      if(numero==3)
        break; //ao chegar no número 3, ele para o fluxo
        //continue; // Ao chegar no número 3, ele não para a aplicação
        //ele desconsidera o 3 e continua os outros

      System.out.println(numero);
    }
  }
}
