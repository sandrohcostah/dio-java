package dio.ProgramacaoOrientadaObjetos.FundamentosPOO.lanchonete.atendimento.cozinha;

import dio.ProgramacaoOrientadaObjetos.FundamentosPOO.lanchonete.atendimento.Atendente;

public class Cozinheiro {
  
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATURAL");
    }

    public void adicionarSucoNoBalcao(){
      System.out.println("ADICIONANDO SUCO NO BALCAO");
    }

    public void adicionarComboNoBalcao(){
      adicionarLancheNoBalcao();
      adicionarSucoNoBalcao();
    }

    public void prepararLanche(){
      System.out.println("PREPARANDO LANCHE");
    }

    public void prepararVitamina(){
      System.out.println("PREPARANDO VITAMINA");
    }

    public void prepararCombo(){
      prepararLanche();
      prepararVitamina();
    }

    public void selecioneIngredientesParaLanche(){
      System.out.println("SELECIONANDO");
    }

    public void pedirParaTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }

}
