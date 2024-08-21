package dio.EstruturasRepeticao;

public class ExemploForArray {
  public static void main(String[] args) {
    String alunos[] = {"Felipe","Jonas","Julia","Marcos"};
    //enquanto o indice for menor do que o tamanho do array de alunos
    //incremente mais um na variável x
    for(int x=0; x<alunos.length; x++){
      System.out.println("O Aluno no indice x=" + x + " é " + alunos[x]);
    }
  }
}
