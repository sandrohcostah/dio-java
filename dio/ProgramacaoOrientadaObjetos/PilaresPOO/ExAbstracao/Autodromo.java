package dio.ProgramacaoOrientadaObjetos.PilaresPOO.ExAbstracao;

public class Autodromo {
  public static void main(String[] args) {
    Carro jeep = new Carro();
    jeep.setChassi("1234");
    jeep.ligar();

    Moto cg = new Moto();
    cg.setChassi("123456");

    Veiculo conringa = jeep;

    conringa.ligar();
  }
}
