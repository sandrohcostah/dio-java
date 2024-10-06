package dio.CollectionsJava.SetInterface.OperacoesBasicas;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
  
  private Set<Convidado> convidadoSet;

  public ConjuntoConvidados() {
    this.convidadoSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite){
    convidadoSet.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidadoPorCodigoConvite(int codigoConvite){
    Convidado convidadoParaRemover = null;
    for(Convidado c : convidadoSet){
      if(c.getCodigoConvite() == codigoConvite){
        convidadoParaRemover = c;
        break;
      }
    }
    convidadoSet.remove(convidadoParaRemover);
  }

  public int contarConvidados(){
    return convidadoSet.size();
  }

  public void exebirConvidados(){
    System.out.println(convidadoSet);
  }

  public static void main(String[] args) {
    ConjuntoConvidados cC = new ConjuntoConvidados();
    System.out.println("Existem " + cC.contarConvidados() + " convidados dentro do set de Convidados");

    cC.adicionarConvidado("Convidado 1", 1);
    cC.adicionarConvidado("Convidado 2", 2);
    cC.adicionarConvidado("Convidado 3", 3);
    cC.adicionarConvidado("Convidado 4", 4);
    
    System.out.println("Existem " + cC.contarConvidados() + " convidados dentro do set de Convidados");

    cC.removerConvidadoPorCodigoConvite(2);

    System.out.println("Existem " + cC.contarConvidados() + " convidados dentro do set de Convidados");

    cC.exebirConvidados();

  }
}
