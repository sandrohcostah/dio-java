package dio.ValidacaoProcessoSeletivo;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    analisarCandidato(1900.0);
    analisarCandidato(2200.0);
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
