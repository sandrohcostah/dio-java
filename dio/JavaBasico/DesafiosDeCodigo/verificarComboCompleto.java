package dio.JavaBasico.DesafiosDeCodigo;
import java.util.Scanner;
/*
Descrição
Implemente um sistema que verifique se um cliente de uma empresa de telecomunicações
contratou um combo completo de serviços. Um combo completo inclui
os três serviços principais oferecidos pela empresa: telefonia móvel,
banda larga e TV por assinatura. O sistema deve ler uma lista de serviços contratados
pelo cliente e determinar se todos os serviços necessários estão incluídos.
Caso todos os três serviços estejam presentes, o sistema deve retornar "Combo Completo".
Se faltar qualquer um dos serviços, o sistema deve retornar "Combo Incompleto".

Entrada
  A entrada consiste em uma string contendo uma lista de serviços contratados pelo cliente,
  separados por vírgula. Os serviços possíveis são "movel" para telefonia móvel,
  "banda larga" para serviços de internet e "tv" para TV por assinatura.

Saída
  A saída do programa deve ser uma única linha contendo:
  "Combo Completo" se o cliente contratou todos os três serviços.
  "Combo Incompleto" caso contrário.

Exemplos
  A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas.
  Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada              | Saída
movel,banda larga,tv | Combo Completo
movel,tv             | Combo Incompleto
banda larga,tv,movel | Combo Completo
 */
public class verificarComboCompleto {
  // Função para verificar se o cliente contratou um combo completo
  public static String verificarCombo(String[] servicosContratados) {
    // Variáveis booleanas para verificar a contratação de cada serviço
    boolean movelContratado = false;
    boolean bandaLargaContratada = false;
    boolean tvContratada = false;

    // TODO: Itere sobre os serviços contratados
    for (int contador=0; contador < servicosContratados.length; contador++) {
      if(servicosContratados[contador].equals("tv")){
        tvContratada = true;
      }else if(servicosContratados[contador].equals("movel")){
        movelContratado = true;
      }else if(servicosContratados[contador].equals("banda larga")){
        bandaLargaContratada = true;
      }
    }

    // TODO: Verifique se todos os serviços foram contratados
    if (movelContratado == true && bandaLargaContratada == true && tvContratada == true) {
        return "Combo Completo";
    } else {
        return "Combo Incompleto";
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicitando ao usuário a lista de serviços contratados
    String input = scanner.nextLine();

    // Convertendo a entrada em uma lista de strings
    String[] servicosContratados = input.split(",");

    // Verificando se o cliente contratou um combo completo
    String resultado = verificarCombo(servicosContratados);

    // Exibindo o resultado
    System.out.println(resultado);

    // Fechando o scanner
    scanner.close();
}
}
