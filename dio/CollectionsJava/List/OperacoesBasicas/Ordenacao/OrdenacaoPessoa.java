package dio.CollectionsJava.List.OperacoesBasicas.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa extends ComparatorPorAltura{
  
  private List<Pessoa> pessoaList;

  public OrdenacaoPessoa() {
    this.pessoaList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura){
    pessoaList.add(new Pessoa(nome, idade, altura));
  }
  
  public List<Pessoa> ordenarPorIdade(){
    List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoaPorIdade);
    return pessoaPorIdade;
  }

  public List<Pessoa> ordenarPorAltura(){
    List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
    return pessoaPorAltura;
  }

  public static void main(String[] args) {
    OrdenacaoPessoa op = new OrdenacaoPessoa();

    op.adicionarPessoa("Pessoa 1", 25, 1.80);
    op.adicionarPessoa("Pessoa 2", 23, 1.60);
    op.adicionarPessoa("Pessoa 3", 24, 1.70);
    op.adicionarPessoa("Pessoa 4", 22, 1.85);
    op.adicionarPessoa("Pessoa 5", 21, 1.90);

    System.out.println(op.ordenarPorIdade());
    System.out.println(op.ordenarPorAltura());
  }
}

