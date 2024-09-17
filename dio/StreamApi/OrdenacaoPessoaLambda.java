import java.util.ArrayList;
import java.util.List;

import dio.CollectionsJava.List.OperacoesBasicas.Ordenacao.Pessoa;

public class OrdenacaoPessoaLambda {
  //atributo
  private List<Pessoa> pessoaList;

  //construtor
  public OrdenacaoPessoaLambda() {
    this.pessoaList = new ArrayList<>();
  }

  public List<Pessoa> ordenarPorAltura() {
    if (!pessoaList.isEmpty()) {
      List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
      pessoasPorAltura.sort((p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
      return pessoasPorAltura;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }
}