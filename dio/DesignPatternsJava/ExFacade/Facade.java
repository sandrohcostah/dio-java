package ExFacade;

import ExFacade.Subsistema1.CrmService;
import ExFacade.Subsistema2.CepApi;

public class Facade {
  
  public void migrarCliente(String nome, String cep){
    String cidade = CepApi.getInstancia().recuperarCidade(cep);
    String estado = CepApi.getInstancia().recuperarEstado(cep);

    CrmService.gravarCliente(nome, cep, cidade, estado);
    System.out.println("Cliente salvo no sistema");
    System.out.println(nome);
    System.out.println(cep);
    System.out.println(cidade);
    System.out.println(estado);
  }
}
