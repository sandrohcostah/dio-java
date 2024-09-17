package dio.StreamApi;

import java.util.ArrayList;
import java.util.List;

import dio.CollectionsJava.List.OperacoesBasicas.Item;

public class CarrinhoComprasSemLambda {
  //atributos
  private List<Item> itemList;
  //construtor
  public CarrinhoComprasSemLambda() {
    this.itemList = new ArrayList<>();
  }
  
  //método para calcular valor total dos itens sem utilizar o Stream API
  public double calcularValorTotal() {
    double valorTotal = 0d;
    if (!itemList.isEmpty()) {
      for (Item item : itemList) {
        double valorItem = item.getPreco() * item.getQuant();
        valorTotal += valorItem;
      }
      return valorTotal;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }
}
