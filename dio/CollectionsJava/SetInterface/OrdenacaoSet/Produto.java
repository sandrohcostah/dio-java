package dio.CollectionsJava.SetInterface.OrdenacaoSet;
//import java.util.Comparator;
//import java.util.HashSet;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
  private long codigo;
  private String nome;
  private double preco;
  private int quantidade;
  
  public Produto(long codigo, String nome, double preco, int quantidade) {
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }
  //Vai fazer a comparação e analisar se o próximo 
  //produto é maior ou menor do que o produto atual
  public int compareTo(Produto p){
    return nome.compareToIgnoreCase(p.getNome());
  }

  public long getCodigo() {
    return codigo;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public boolean equals(Object o){
    if(this == o) return true;
    if(!(o instanceof Produto produto)) return false;
    return getCodigo() == produto.getCodigo();
  }

  public int HashCode(){
    return Objects.hash(getCodigo());
  }

  @Override
  public String toString() {
    return "Produto [codigo=" + codigo + 
      ", nome=" + nome + 
      ", preco=" + preco + 
      ", quantidade=" + quantidade + "]";
  }


}
