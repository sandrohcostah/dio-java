package dio.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Usar o Consumer com expressão lambda para imprimir números pares
    //numero é o argumento e após -> vem o corpo
    Consumer<Integer> imprimirNumeroPar = numero -> {
      if (numero % 2 == 0) {
        //"ln" no final do print pula pra próx linha,
        //sem ln ele imprime tudo na mesma linha"24"
        System.out.println(numero); 
      }
    };

    // Usar o Consumer para imprimir números pares no Stream
    numeros.stream().forEach(imprimirNumeroPar);
    /*OU
    for (Integer numero : numeros) {
      imprimirNumeroPar.accept(numero);
    }*/
    
    numeros.stream().filter(new Predicate<Integer>() {
      public boolean test(Integer n){
        return n % 2 == 0;
      }
    });

    //Lambda do exemplo acima
    numeros.stream()
    .filter(n -> n % 2 ==0)
    .forEach(System.out::println);
  }
}