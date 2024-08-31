package dio.ProgramacaoOrientadaObjetos.FundamentosPOO.ExVisibilidadeRecursos;

import dio.ProgramacaoOrientadaObjetos.FundamentosPOO.ExVisibilidadeRecursos.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
      Cozinheiro cozinheiro = new Cozinheiro();

      cozinheiro.prepararLanche();
      cozinheiro.adicionarLancheNoBalcao();
    }
}
