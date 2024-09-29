package dio.Bootcamp.Dominio;

public abstract class Conteudo {
  //final = constante
  //static = acessar esse XP_PADRAO de fora da classe
  //protected = só os filhos da classe conteudo conseguirão acessar
  protected static final double XP_PADRAO = 10d;

  private String titulo;
  private String descricao;

  //Classes que extenderem do conteudo serão obrigadas a ter o método calculaXp
  public abstract double calcularXp();

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }


}
