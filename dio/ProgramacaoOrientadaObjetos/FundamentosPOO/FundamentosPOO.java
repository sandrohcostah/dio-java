package dio.ProgramacaoOrientadaObjetos.FundamentosPOO;

public class FundamentosPOO {
  public static void main(String[] args) {
    
  }
/*
Conceito de POO
  Usa objetos do mundo real (posso entender como uma tabela de banco de dados)
Classes
  Classe é uma estrutura criada que o objeto deverá seguir
  Toda estrutura de código java é distribuido em arquios . java denominados de classe
  Todo código que a máquina vai interpretar depois de compilar será .class
  AS classe no nosso projeto são compostas por:
    Identificador, características e comportamentos
      Identificador (identity): Propósito existencial aos objetos que serão criados
        A Classe precisa ser bem identificada, por nomes claros
      Características (states): chamado também de atributos ou propriedades,
        é toda a informação que representa o estado do objeto.
        Ex: carro: atributos: cor, ano, modelo (igual de uma tabela de bd)
      Comportamentos (behavior): Também chamados de ações ou métodos,
        é toda a parte comportamental que um objeeto dispõe.
        ex: carro: acelera, para, acende farois, etc.
      Instanciar (new): ato de criar um novo objeto, ex:"new carro"
  
  Ex Classe:
    public class Student {
    String nome;
    int idade;
    String sex;

    void comendo(String food){
      //código
    }
    void correr(){
      //código
    }
  }
  //Exemplo de objeto estudante sendo criado:
    public static void main(String[] args) {
      Student estudante = new Student();
      estudante.nome = "John";
      estudante.idade = 19;
      estudante.sex = "Masculino";
    }
  Etapas:
    Primeiro cria o molde, depois construi os objetos com o molde prédefinido
  Classes são classificadas como:
    Classe de modelo (model):
      Classes que representem estrutura de dominio da aplicação,
      Ex: Cliente, Pedido, Nota Fiscal, etc.
    Classe de serviço (service):
      Classes que contém a regra de negócio de validação de nosso sistema.
    Classe de repositório (repository):
      Classes que contém uma integração com o banco de dados.
  Classe de controle (control):
    Possuem a finalidade de disponibilizar alguma comunicação externa a nosso app,
    tipo http web ou webservices
  Classe utilitária (util):
    Contém recursos comuns à toda nossa aplicação

Pacotes
  
*/
}
