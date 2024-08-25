package dio.JavaBasico.SintaxeBasica.metodos;

public class Usuario {
  public static void main(String[] args) {
    
    sistemaSmartTv smartTv = new sistemaSmartTv();
    
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();

    System.out.println("Canal atual: " + smartTv.canal);
    smartTv.mudarCanal(13);
    System.out.println("Canal atual: " + smartTv.canal);

    System.out.println("TV ligada? " + smartTv.ligada);
    System.out.println("Volume atual " + smartTv.volume);

    smartTv.ligar();
    System.out.println("TV ligada? " + smartTv.ligada);

  }
}
