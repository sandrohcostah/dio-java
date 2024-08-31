package dio.ProgramacaoOrientadaObjetos.PilaresPOO.ExAbstracao;

//Veículo é a classe pai
//Evita que eu precise criar atributos redundantes entre as classe que são filhos
//Por exemplo, eu teria que criar um atriuto chassi para o carro e a moto se não tivesse a classe Veiculo

//Um veículo não sabe como é ligado,
//  mas todos os veículos precisam ter a capacidade de se ligar
//É abstrata porque a classe não sabe como algumas coisas acontecem
public abstract class Veiculo {
    private String chassi;

    public String getChassi() {
      return chassi;
    }

    public void setChassi(String chassi) {
      this.chassi = chassi;
    }
    //Todo objeto se for veículo, precisará ligar
    public abstract void ligar();

}
