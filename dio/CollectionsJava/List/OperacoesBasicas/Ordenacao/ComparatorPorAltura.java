package dio.CollectionsJava.List.OperacoesBasicas.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorPorAltura implements Comparator<Pessoa> {
  private List<Pessoa> pessoaList;

  public int compare(Pessoa p1, Pessoa p2) {
    return Double.compare(p1.getAltura(), p2.getAltura());
  }
  
}
