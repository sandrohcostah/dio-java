package dio.ProgramacaoOrientadaObjetos.PilaresPOO.ExHeranca;

//Veículo é a classe pai
//Evita que eu precise criar atributos redundantes entre as classe que são filhos
//Por exemplo, eu teria que criar um atriuto chassi para o carro e a moto se não tivesse a classe Veiculo
public class Veiculo {
    private String chassi;

    public String getChassi() {
      return chassi;
    }

    public void setChassi(String chassi) {
      this.chassi = chassi;
    }
    
}
