package dio.CollectionsJava.MapInterface.OrdenacaoMap;

import java.time.LocalDate;
import java.time.Month;
import java.util.Map;
//import java.util.Set;
import java.util.TreeMap;
//import java.util.Collection;
import java.util.HashMap;

public class AgendaEventos {
  private Map<LocalDate, Evento> eventosMap;

  public AgendaEventos(){
    this.eventosMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nome, String atracao){
    //Evento evento = new Evento(nome, atracao);
    eventosMap.put(data, new Evento(nome, atracao));
  }
  
  public void exebirAgenda(){
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    System.out.println(eventosTreeMap);
  }
  //entrySet() retornar um valor do tipo set com chave e valor vinculados
  public void obterProximoEvento() {
    LocalDate dataAtual = LocalDate.now();
    LocalDate proximaData = null;
    Evento proximoEvento = null;
    for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
      LocalDate dataEvento = entry.getKey();
      if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
        proximaData = dataEvento;
        proximoEvento = entry.getValue();
        break;
      }
    }
    if (proximoEvento != null) {
      System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
    } else {
      System.out.println("Não há eventos futuros na agenda.");
    }
  }

  public static void main(String[] args) {
    AgendaEventos aE = new AgendaEventos();

    aE.adicionarEvento(LocalDate.of(2024, Month.MARCH, 31), "Evento 1", "Atração 1");
    aE.adicionarEvento(LocalDate.of(2024, Month.JANUARY, 20), "Evento 2", "Atração 2");
    aE.adicionarEvento(LocalDate.of(2024, Month.DECEMBER, 20), "Evento 3", "Atração 3");
    aE.adicionarEvento(LocalDate.of(2024, Month.FEBRUARY, 20), "Evento 4", "Atração 4");

    //aE.exebirAgenda();

    aE.obterProximoEvento();
  }
}
