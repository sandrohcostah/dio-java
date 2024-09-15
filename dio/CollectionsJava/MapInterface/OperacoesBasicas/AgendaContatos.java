package dio.CollectionsJava.MapInterface.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  
  private Map<String, Integer> agendaContatoMap;

  public AgendaContatos() {
    this.agendaContatoMap = new HashMap<>();
  }

  public void adicionarContato(String nome, Integer telefone){
    agendaContatoMap.put(nome, telefone);
  }

  public void removerContato(String nome){
    if(!agendaContatoMap.isEmpty()){
      agendaContatoMap.remove(nome);
    }
  }

  public void exibirContatos(){
    System.out.println(agendaContatoMap);
  }

  public Integer pesquisarPorNome(String nome){
    Integer numeroPorNome = null;
    if(!agendaContatoMap.isEmpty()){
      numeroPorNome = agendaContatoMap.get(nome);
    }
    return numeroPorNome;
  }

  public static void main(String[] args) {
    AgendaContatos aC = new AgendaContatos();

    aC.adicionarContato("Pessoa 1", 1111);
    aC.adicionarContato("Pessoa 2", 2222);
    aC.adicionarContato("Pessoa 3", 3333);
    aC.adicionarContato("Pessoa 4", 4444);
    aC.adicionarContato("Pessoa 5", 5555);
    aC.adicionarContato("Pessoa 6", 6666);

    aC.exibirContatos();

    aC.removerContato("Pessoa 2");
    aC.exibirContatos();

    System.out.println("O número é " + aC.pesquisarPorNome("Pessoa 4"));
  }
}
