package dio.CollectionsJava.SetInterface.OperacoesBasicas;
import java.util.Objects;

public class Convidado {
  private String nome;
  private int codigoConvite;
  
  public Convidado(String nome, int codigoConvite) {
    this.nome = nome;
    this.codigoConvite = codigoConvite;
  }

  public String getNome() {
    return nome;
  }

  public int getCodigoConvite() {
    return codigoConvite;
  }
  //Não mostrar o código do caminho onde está o objeto na memória
  public String toString() {
    return "Convidado [nome=" + 
    nome + ", codigoConvite=" + 
    codigoConvite + "]";
  }

  public int hashCode() {
    return Objects.hash(getCodigoConvite());
  }

  //evita que sejam salvos convites com o mesmo codigo
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Convidado convidado))
      return false;
    return getCodigoConvite() == convidado.getCodigoConvite();
  }

  
}
