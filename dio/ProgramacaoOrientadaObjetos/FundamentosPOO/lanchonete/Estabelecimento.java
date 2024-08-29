package dio.ProgramacaoOrientadaObjetos.FundamentosPOO.lanchonete;

import dio.ProgramacaoOrientadaObjetos.FundamentosPOO.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
      Cozinheiro cozinheiro = new Cozinheiro();

      cozinheiro.prepararLanche();
      cozinheiro.adicionarLancheNoBalcao();
    }
}
