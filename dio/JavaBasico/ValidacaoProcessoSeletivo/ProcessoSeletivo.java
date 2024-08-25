package dio.JavaBasico.ValidacaoProcessoSeletivo;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"};
    for(String candidato: candidatos){
      entrandoEmContato(candidato);
    }
    //imprimirSelecionados();
    //analisarCandidato(1900.0);
    //analisarCandidato(2200.0);
  }

  static void entrandoEmContato(String candidato){
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu=false;

    do {
      atendeu = atender();
      continuarTentando = !atendeu;
      if(continuarTentando){
        tentativasRealizadas++;
      }else{
        System.out.println("Contato realizado com sucesso");
      }
    }while(continuarTentando && tentativasRealizadas<3);

    if(atendeu){
      System.out.println("Conseguimos contato com " +candidato+
      " na " + tentativasRealizadas +" Tentativa");
    } else {
      System.out.println("Não conseguimos contato com " +candidato+
      "número máximo de tentativas" +tentativasRealizadas+ " Realizadas");
    }
  }

  static boolean atender(){
    return new Random().nextInt(3)==1;
  }

  static void imprimirSelecionados(){
    String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"};
    //Imprimi lista informando o indice do elemento
    System.out.println("Imprimindo a lista de candidatos");

    for(int indice=0; indice < candidatos.length; indice++){
      System.out.println("O candidato de nº " +(indice+1)+ " é " +candidatos[indice]);
    }
    //forma abreviada for each
    //nesse caso não tem o indice
    for(String candidato: candidatos){
      System.out.println("O candidato selecionado foi " + candidato);
    }

  }

  static void selecaoCandidatos(){
    String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniela","Jorge"};

    int candidatosSelecionados = 0;
    int candidatoAtual=0;
    double salarioBase=2000.0;

    while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
      String candidato = candidatos[candidatoAtual];
      double salarioPretenido = valorPretendido();

      System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretenido);
      if(salarioBase >= salarioPretenido){
        System.out.println("O candidato " +candidato+ " foi selecionado para a vaga");
        candidatosSelecionados++;
      }
      candidatoAtual++;

    }
  }

  static double valorPretendido(){
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static void analisarCandidato(double salarioPretenido){
    double salarioBase = 2000.0;
    if(salarioBase > salarioPretenido){
      System.out.println("Ligar para o candidato");
    }else if(salarioBase == salarioPretenido){
      System.out.println("Ligar para o candidato com contra proposta");
    } else {
      System.out.println("Aguardando demais candidatos");
    }
  }
}
