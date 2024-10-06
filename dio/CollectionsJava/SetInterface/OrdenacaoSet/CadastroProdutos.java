package dio.CollectionsJava.SetInterface.OrdenacaoSet;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
  private Set<Produto> produtoSet;

  public CadastroProdutos() {
    this.produtoSet = new HashSet<>();
  }

  public void adicionarProduto(long cod, String nome, double preco, int quantidade){
    produtoSet.add(new Produto(cod, nome, preco, quantidade));
  }

  public Set<Produto> exibirProdutosPorNome(){
    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
    return produtosPorNome;
  }

  public Set<Produto> exibirProdutosPorPreco(){
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtosPorPreco.addAll(produtoSet);
    return produtosPorPreco;
  }

  public static void main(String[] args) {
    CadastroProdutos cP = new CadastroProdutos();
    cP.adicionarProduto(1, "Produto 5", 10, 1);
    cP.adicionarProduto(1, "Produto 2", 2, 1);
    cP.adicionarProduto(1, "Produto 1", 3, 1);
    cP.adicionarProduto(1, "Produto 4", 5, 1);
  
    //System.out.println(cP.produtoSet);

    //System.out.println(cP.exibirProdutosPorNome());
    System.out.println(cP.exibirProdutosPorPreco());
  }
}
