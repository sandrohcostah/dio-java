package dio.ProgramacaoOrientadaObjetos.PilaresPOO.ExAbstracao;
//Classe carro recebe a herança dos atributos da classe Veiculo (pai)
public class Carro extends Veiculo {
    public void ligar(){
      confereCombio();
      confereCombustivel();
      System.out.println("Carro ligado");
    }

    //Encapsulamento private será visto só pela classe Carro
    private void confereCombustivel(){
      System.out.println("Conferindo combustível");
    }

    private void confereCombio(){
      System.out.println("Conferindo Cambio em P");
    }
}
