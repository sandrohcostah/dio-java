package dio.SintaxeBasica.metodos;
/*
Criar uma classe para representar uma smartTV
  1 Ela deve ter características:
    ligada (boolean)
    canal (int)
    volume (int)
  2 Nossa TV poderá ligar e desligar
  3 Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
  4 Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número corresp
 */
public class sistemaSmartTv {
  boolean ligada=false;
  int canal=1;
  int volume = 25;

  public void mudarCanal(int novoCanal){
    canal = novoCanal;
  }

  public void aumentarCanal(){
    canal++;
  }

  public void diminuirCanal(){
    canal--;
  }

  public void aumentarVolume(){
      volume++;
  }

  public void diminuirVolume(){
    volume--;
  }

  public void ligar(){
      ligada=true;
  }

  public void desligar(){
    ligada=false;
  }
}

