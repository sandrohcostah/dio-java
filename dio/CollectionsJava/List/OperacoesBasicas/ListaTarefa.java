package dio.CollectionsJava.List.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefa {
  
  //Sempre que criar um objeto ListaTarefa já vai ter um atributo tarefaList
  private List<Tarefa> tarefaList;
  //Sempre que chamar um objeto do tipo Lista tarefa ele já me retorne uma lista vazia
  //Para poder adicionar elemetos para manipular, remover, etc
  public ListaTarefa(){
    this.tarefaList = new ArrayList<>();
  }
  
  public void adicionarTarefa(String descricao){
    tarefaList.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao){
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for(Tarefa t : tarefaList){
      if(t.getDescricao().equalsIgnoreCase(descricao)){
        tarefasParaRemover.add(t);
      }
    }
    tarefaList.removeAll(tarefasParaRemover);
  }

  public int obterNumeroTotalTarefas(){
    return tarefaList.size();
  }

  public void obterDescricoesTarefas(){
    System.out.println(tarefaList);
  }

  //---
  public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();
      System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 2");
    System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.removerTarefa("Tarefa 1");
    System.out.println("O número total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.obterDescricoesTarefas();
  }
}
