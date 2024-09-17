package dio.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import dio.CollectionsJava.List.OperacoesBasicas.Ordenacao.Pessoa;

public class OrdenacaoPessoaReference {
  //atributo
  private List<Pessoa> pessoaList;

  //construtor
  public OrdenacaoPessoaReference() {
    this.pessoaList = new ArrayList<>();
  }

  public List<Pessoa> ordenarPorAltura() {
    if (!pessoaList.isEmpty()) {
      List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
      pessoasPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
      return pessoasPorAltura;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }
}