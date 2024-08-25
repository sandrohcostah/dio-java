package dio.JavaBasico.EstruturasCondicionais.ExemploCondicaoTernaria;

public class ResultadoEscolar {
  public static void main(String[] args) {
    int nota = 7;
    //Se nota for menor ou igual a 7
    //? = Então "Aprovado"
    //: = Senão "Reprovado"
    String resutado = nota >=7 ? "Aprovado" : "Reprovado";

    //Exemplo com else if
    //String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
    System.out.println(resutado);
  }
}
