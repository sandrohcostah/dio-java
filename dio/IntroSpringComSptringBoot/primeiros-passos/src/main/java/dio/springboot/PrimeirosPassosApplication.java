package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
		/*
		//Não se usa mais o new para instânciar um objeto
		Calculadora c = new Calculadora();

		System.out.println("O resultado é: " + c.somar(7, 7));
	*/
		}

		@Bean
		public CommandLineRunner run(SistemaMensagem sistema) throws Exception {
			return args ->{
				sistema.enviarConfirmacaoCadastro();
				sistema.enviarMensagemBoasVindas();
				sistema.enviarConfirmacaoCadastro();
			};
		};

}
