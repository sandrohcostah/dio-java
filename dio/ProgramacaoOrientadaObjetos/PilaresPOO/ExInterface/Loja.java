package dio.ProgramacaoOrientadaObjetos.PilaresPOO.ExInterface;

import dio.ProgramacaoOrientadaObjetos.PilaresPOO.ExInterface.Equipamentos.Copiadora.Copiadora;
import dio.ProgramacaoOrientadaObjetos.PilaresPOO.ExInterface.Equipamentos.Digitalizadora.Digitalizadora;
import dio.ProgramacaoOrientadaObjetos.PilaresPOO.ExInterface.Equipamentos.Impressora.Impressora;

public class Loja {
  public static void main(String[] args) {
    EquipamentoMultifuncional em = new EquipamentoMultifuncional();
    Impressora impressora = em;
    Digitalizadora digitalizadora = em;
    Copiadora copiadora = em;

    impressora.imprimir();
    digitalizadora.digitalizar();
    copiadora.copiar();
  }
}
