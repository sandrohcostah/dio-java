package dio.springboot.exemplo_value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
  @Value("${nome}")
  private String nome;
  @Value("${email}")
  private String email;
  @Value("${telefones}")
  private List<Long> telefones = 
    new ArrayList<>(Arrays.asList(new Long[]{4812345678L}));

  @Override
  public void run(String... args) throws Exception{
    System.out.println("Mensagem enviada por: " + nome
      + "\nEmail: " + email
      + "\nCom telefones: " + telefones);
    System.out.println("Seu contato foi aprovado");
  }
}
