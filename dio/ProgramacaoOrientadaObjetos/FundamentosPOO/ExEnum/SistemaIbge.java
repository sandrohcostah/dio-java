package dio.ProgramacaoOrientadaObjetos.FundamentosPOO.ExEnum;

public class SistemaIbge {
  public static void main(String[] args) {
    for(EstadoBrasileiro e: EstadoBrasileiro.values()){
      System.out.println(e.getNome() +" - "+ e.getSigla());
    }

    /*Selecionar um estado brasileiro em especifico
    Atribui nome de variável "eb" do enum EstadoBRasileiro,
      do estado SAO_PAULO
    */
    EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;

    System.out.println(eb.getNome());
    System.out.println(eb.getSigla());
    System.out.println(eb.getNomeMaiusculo());
  }
}
