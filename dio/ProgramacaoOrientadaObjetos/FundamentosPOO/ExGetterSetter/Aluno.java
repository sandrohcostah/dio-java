package dio.ProgramacaoOrientadaObjetos.FundamentosPOO.ExGetterSetter;

public class Aluno {
  private String nome;
  private int idade;

  public String GetNome(){
    return nome;
  }

  public void SetNome(String newNome){
    nome = newNome;
  }

  public int GetIdade(){
    return idade;
  }

  public void SetIdade(int newIdade){
    this.idade = newIdade;
  }
}