package dio.CollectionsJava.SetInterface.PesquisaSet;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  
  private Set<Contato> contatoSet;

  public AgendaContatos() {
    this.contatoSet = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero){
    contatoSet.add(new Contato(nome, numero));
  }

  public void exibirContatos(){
    System.out.println(contatoSet);
  }

  public Set<Contato> pesquisarPorNome(String nome){
    Set<Contato> contatoPorNome = new HashSet<>();
    for(Contato c : contatoSet){
      if(c.getNome().startsWith(nome)){
        contatoPorNome.add(c);
      }
    }
    return contatoPorNome;
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero){
    Contato contatoAtualizado = null;
    for(Contato c : contatoSet){
      //equalsIgnoreCase pega o nome exato que está procurando
      if(c.getNome().equalsIgnoreCase(nome)){
        c.setNumero(novoNumero);
        contatoAtualizado = c;
        break;
      }
    }
    return contatoAtualizado;
  }

  public static void main(String[] args) {
    AgendaContatos aC = new AgendaContatos();

    aC.exibirContatos();

    aC.adicionarContato("Teste 1", 111111);
    aC.adicionarContato("Teste 2", 222222);
    aC.adicionarContato("Teste 3", 333333);
    aC.adicionarContato("Teste 4", 444444);

    aC.exibirContatos();

    System.out.println(aC.pesquisarPorNome("Teste"));

    System.out.println("Contato atualizado " + 
    aC.atualizarNumeroContato("Teste 1", 123456));

  }
}
