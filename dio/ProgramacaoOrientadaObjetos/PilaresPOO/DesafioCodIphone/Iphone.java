package dio.ProgramacaoOrientadaObjetos.PilaresPOO.DesafioCodIphone;

import dio.ProgramacaoOrientadaObjetos.PilaresPOO.DesafioCodIphone.AparelhoTelefonico.Celular;
import dio.ProgramacaoOrientadaObjetos.PilaresPOO.DesafioCodIphone.NavegadorInternet.Navegador;
import dio.ProgramacaoOrientadaObjetos.PilaresPOO.DesafioCodIphone.ReprodutorMusical.Ipod;

public class Iphone implements Ipod, Celular, Navegador {

  public void tocar() {
    System.out.println("Tocando musica");
  }

  public void pausar() {
    System.out.println("Pause");
  }

  public void selecionarMusica(String musica) {
    System.out.println("Selecionando musica: " + musica);
  }

  public void ligar(String numero) {
    verificaSinal();
    System.out.println("Ligando para " + numero);
  }

  public void atender() {
    System.out.println("Atendeu chamada");
  }

  public void iniciarCorreioVoz() {
    System.out.println("Ouvindo correio de voz");
  }

  public void exibirPagina(String url) {
    verificaPacoteDados();
    System.out.println("http://" +url);
  }

  public void adicionarNovaAba() {
    System.out.println("Nova aba");
  }

  public void atualizarPagina() {
    verificaPacoteDados();
    System.out.println("Atualizando página");
  }

  private void verificaSinal(){
    System.out.println("Verificando sinal...");
  }

  private void verificaPacoteDados(){
    System.out.println("Verificando Se tem dados disponiveis...");
  }
}
