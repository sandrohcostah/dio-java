package dio.ProgramacaoOrientadaObjetos.FundamentosPOO.Escola;

public class Escola {
  public static void main(String[] args) {
    Aluno felipe = new Aluno();
    felipe.SetNome("Felipe");
    felipe.SetIdade(8);

    System.out.println("O aluno "
    +felipe.GetNome()+ " tem " +felipe.GetIdade()+ " anos");
  }
}