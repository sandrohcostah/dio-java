package dio.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {
  public static void main(String[] args) {
    List<String> palavras = Arrays.asList("java","kotlin","python","javascript","c","go","ruby");

    Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

    //Stream vai filtrar as palavras com mais de 5 caracteres
    //E vai imprimir cada palavra
    palavras
    .stream()
    .filter(maisDeCincoCaracteres)
    .forEach(System.out::println);

    /*Ou com lambda
    palavras.stream()
    .filter(p -> p.lengh() >5)
    .forEach(System.out::println);
     */
  }
}
