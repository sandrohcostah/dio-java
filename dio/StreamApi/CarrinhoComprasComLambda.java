package dio.StreamApi;

import java.util.ArrayList;
import java.util.List;

import dio.CollectionsJava.List.OperacoesBasicas.Item;

public class CarrinhoComprasComLambda {
  //atributos
  private List<Item> itemList;
  //construtor
  public CarrinhoComprasComLambda() {
    this.itemList = new ArrayList<>();
  }
  
  //método para calcular valor total dos itens utilizando o Stream API
  public double calcularValorTotal() {
    if (itemList.isEmpty()) {
      throw new RuntimeException("A lista está vazia!");
    }
    return itemList.stream()
        .mapToDouble(item -> item.getPreco() * item.getQuant())
        .sum();
  }
}
