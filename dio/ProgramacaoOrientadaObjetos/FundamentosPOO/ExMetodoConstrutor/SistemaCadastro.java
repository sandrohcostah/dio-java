package dio.ProgramacaoOrientadaObjetos.FundamentosPOO.ExMetodoConstrutor;

public class SistemaCadastro {
  public static void main(String[] args) {
    //Cria pessoa marcos obrigando a passar dois parametros (nome e cpf)
    Pessoa marcos = new Pessoa("marcos", "123");

    //Define endereco da pessoa marcos
    marcos.setEndereco("Rua x");

    //Como não tem opção de chamar os atributos após criação do objeto
    //Marcos apresentará nome e cpf nulos
    System.out.println(marcos.getNome() +" - "+ marcos.getCpf());
  }
}
