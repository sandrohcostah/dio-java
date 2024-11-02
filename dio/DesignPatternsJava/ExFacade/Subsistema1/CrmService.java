package ExFacade.Subsistema1;

public class CrmService {
  
  private CrmService(){
    super();
  }

  public static void gravarCliente(String nome, String cep, String cidade, String estado){
    System.out.println("Cliente salva no sistema de CRM");
  }
}
