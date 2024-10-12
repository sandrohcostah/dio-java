import static org.junit.Assert.*;

public class AssertionsTeste {
  
  @Test
  void validarLancamento(){

    int[] primeiroLancamento = {10,20,30,40,50};
    int[] segundoLancamento = {5,20,30,40,50};

    Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
  }
}
