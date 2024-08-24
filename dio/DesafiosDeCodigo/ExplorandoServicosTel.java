package dio.DesafiosDeCodigo;

import java.util.Scanner;
/*Entrada
  A entrada deve receber duas linhas. A primeira linha contém o nome do serviço
  a ser verificado (por exemplo, "movel", "fixa", "banda larga", "tv").
  A segunda linha contém o nome do cliente seguido pelos serviços
  que ele contratou, todos separados por vírgulas (por exemplo, "Alice,movel,fixa").

Saída
  Deverá retornar "Sim" se o cliente contratou o serviço e "Nao" caso contrário.

Exemplos
  A tabela abaixo apresenta exemplos com alguns dados de entrada
  e suas respectivas saídas esperadas. Certifique-se de testar seu programa
  com esses exemplos e com outros casos possíveis.

Entrada          |	Saída
movel
Alice,movel,fixa |	Sim */
public class ExplorandoServicosTel {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Entrada do serviço a ser verificado
    System.out.println("Qual serviço cliente menciona?");
    String servico = scanner.nextLine().trim();
    
    // Entrada do nome do cliente e os serviços contratados
    System.out.println("Nome do cliente e serviços contratados:");
    String entradaCliente = scanner.nextLine().trim();
        
    // Separando o nome do cliente e os serviços contratados
    String[] partes = entradaCliente.split(",");
    String nomeCliente = partes[0];
    boolean contratado = false;
    
    if(nomeCliente != null){
    for(int contarDados=1; contarDados < partes.length; contarDados++){
      if(partes[contarDados].equals(servico)){
        contratado = true;
      }
    }
    if(contratado == true){
      System.out.println("Sim");
    }else{
      System.out.println("Não");
    }
  }
    scanner.close();
  }
}
