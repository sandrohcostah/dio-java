package dio.ProgramacaoOrientadaObjetos.PilaresPOO.ExInterface;

import dio.ProgramacaoOrientadaObjetos.PilaresPOO.ExInterface.Equipamentos.Copiadora.Copiadora;
import dio.ProgramacaoOrientadaObjetos.PilaresPOO.ExInterface.Equipamentos.Digitalizadora.Digitalizadora;
import dio.ProgramacaoOrientadaObjetos.PilaresPOO.ExInterface.Equipamentos.Impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

  public void imprimir() {
    System.out.println("Imprimindo via multifuncional");
  }

  public void digitalizar() {
    System.out.println("Digitalizando via multifuncional");
  }

  public void copiar() {
    System.out.println("Copiando via multifuncional");
  }
  
}
