package dio.CollectionsJava.MapInterface.PesquisaMap;

import java.util.Map;
import java.util.HashMap;

public class EstoqueProdutos {
  private Map<Long, Produto> estoqueProtudosMap;

  public EstoqueProdutos() {
    this.estoqueProtudosMap = new HashMap<>();
  }

  public void adicionarProduto(long cod, String nome, int quantidade, double preco){
    estoqueProtudosMap.put(cod, new Produto(nome, preco, quantidade));
  }

  public void exibirProdutos(){
    System.out.println(estoqueProtudosMap);
  }

  public double calcularValorTotalEstoque(){
    double valorTotalEstoque = 0d;
    if(!estoqueProtudosMap.isEmpty()){
      for(Produto p : estoqueProtudosMap.values()){
        valorTotalEstoque = p.getQuantidade() * p.getPreco();
      }
    }
    return valorTotalEstoque;
  }

  public Produto obterProdutoMaisCaro(){
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    for(Produto p : estoqueProtudosMap.values()){
      if(p.getPreco() > maiorPreco){
        produtoMaisCaro = p;
      }
    }
    return produtoMaisCaro;
  }

  public static void main(String[] args) {
    EstoqueProdutos e = new EstoqueProdutos();

    e.exibirProdutos();

    e.adicionarProduto(1l, "Produto 1", 1, 1);
    e.adicionarProduto(2l, "Produto 2", 1, 2);
    e.adicionarProduto(3l, "Produto 3", 1, 3);
    e.adicionarProduto(4l, "Produto 4", 1, 4);

    System.out.println("Valor total do estoque " + e.calcularValorTotalEstoque());
    System.out.println("Produto mais caro " + e.obterProdutoMaisCaro());
  }
}
