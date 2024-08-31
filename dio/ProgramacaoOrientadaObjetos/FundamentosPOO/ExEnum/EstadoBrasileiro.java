package dio.ProgramacaoOrientadaObjetos.FundamentosPOO.ExEnum;

public enum EstadoBrasileiro {
  //cada estado é denominado uma constante de objeto
  SAO_PAULO ("São Paulo", "SP"),
  RIO_JANEIRO ("Rio de Janeiro", "RJ"),
  PIAUI ("Piauí", "PI"),
  MARANHAO ("Maranhão", "MA");

  private String nome;
  private String sigla;

  private EstadoBrasileiro(String nome, String sigla){
    this.nome = nome;
    this.sigla = sigla;
  }

  public String getSigla(){
    return sigla;
  }

  public String getNome(){
    return nome;
  }

  public String getNomeMaiusculo(){
    return nome.toUpperCase();
  }
}
