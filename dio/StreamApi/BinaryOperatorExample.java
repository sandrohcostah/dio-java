package dio.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
  public static void main(String[] args) {
  List<Integer> numeros = Arrays.asList(1,2,3,4,5);

  //Binary com lambda para somar inteiros
  BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

  //Binary somando numeros no stream
  int resultado = numeros
    .stream()
    .reduce(0, somar);

  //imprmir
  System.out.println("A soma dos números é: " + resultado);
  }
}

