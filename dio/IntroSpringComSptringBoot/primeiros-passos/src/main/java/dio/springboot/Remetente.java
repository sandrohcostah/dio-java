package dio.springboot;

public class Remetente {
  private String nome;
  private String email;
  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Remetente{");
        sb.append("nome=").append(nome);
        sb.append(", email=").append(email);
        sb.append('}');
        return sb.toString();
    }

  
}
