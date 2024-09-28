package dio.BancoDigital.DesafioCodigo;

public class TesteCodigo {
  
  public static void main(String[] args) {
    Cliente Sandroh = new Cliente();
    Sandroh.setNome("Sandroh");
    
    Conta cc = new ContaCorrente(Sandroh);
    Conta cp = new ContaPoupanca(Sandroh);
    cc.depositar(100);

    cc.imprimirExtrato();
    cp.imprimirExtrato();

    //Transferir de uma conta pra outra
    cc.transferir(100, cp);
  }
}
