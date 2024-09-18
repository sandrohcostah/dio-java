package dio.StreamApi;

import java.util.Arrays;
import java.util.List;

public class PredicateExample3 {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    //Lambda do exemplo acima
    numeros.stream()
    .filter(n -> n % 2 ==0)
    .forEach(System.out::println);
  }
}