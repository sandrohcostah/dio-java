package dio.ProgramacaoOrientadaObjetos.PilaresPOO.DesafioCodIphone;

public class Usuario {
  public static void main(String[] args) {
    Iphone iphone = new Iphone();

    System.out.println("-----------------------");
    iphone.ligar("48 1234-5678");
    iphone.atender();
    iphone.iniciarCorreioVoz();

    System.out.println("-----------------------");
    iphone.adicionarNovaAba();
    iphone.atualizarPagina();
    iphone.exibirPagina("dio.com");

    System.out.println("-----------------------");
    iphone.tocar();
    iphone.pausar();
    iphone.selecionarMusica("Tempo perdido - Legião urbana");
  }
}
