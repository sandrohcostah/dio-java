package dio.EstruturasExcepcionais.ExemploExcecaoCep;

public class FormatadorCepExemplo {
  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("23765064");
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      System.out.println("O cep não está no tamanho do cep");
    }
  }
  //Método formatar cep
  static String formatarCep(String cep) throws CepInvalidoException{
    if(cep.length() != 8) //Se o cep for diferente de 8 numeros
      throw new CepInvalidoException(); //Ele vai lançar essa exceeption

      //simula um cep formatado
      return "23.765-064";
  }
}
