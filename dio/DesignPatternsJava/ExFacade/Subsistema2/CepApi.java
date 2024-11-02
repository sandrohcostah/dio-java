package ExFacade.Subsistema2;

public class CepApi {
  
  public static CepApi instancia = new CepApi();

  private CepApi(){
    super();
  }

  public static CepApi getInstancia(){
    return instancia;
  }

  public String recuperarCidade(String cep){
    return "Florianópolis";
  }

  public String recuperarEstado(String cep){
    return "SC";
  }
}
