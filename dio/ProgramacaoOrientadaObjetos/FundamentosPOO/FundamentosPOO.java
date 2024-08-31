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
  Formas de organizar o projeto
  Pacotes são subdiretórios na pasta src do projeto
  Nomenclaturas de pacotes
    Comercial: com.nomeempresa
    Governamental: gov.nomeempresa
    Código aberto: org.nomeempresa
    Dentro dessas pastas, criar pastas de acordo com a finalidade de cada classe
    Ex: Considere a classe Usuario que está endereçada no pacote com.controle.acesso.model, o nome qualificado desta classe é com.controle.acesso.model.Usuario
    É importante colocar nomes qualificados e em pacotes, pois pode acontecer de termos classes iguais no projeto, mas em pacotes diferentes
  Package = Será o pacote onde a classe atual, que se está trabalhando está localizada
  Se precisar de outra classe, ai terá que usar o comando import

Visibilidade dos recursos
  Modificadores de acesso
    Public
      Qualquer outra classe em qualquer outro pacote pode visualizar tais recursos
      public void
    Default
      void()
      Faz com que só os que estão no mesmo pacote enxergue
    Private
      private void()
      Faz com que não apareça as ações que a classe pode fazer
      É vista apenas pela própria classe apenas

Getters e Setters
  São usados para buscar valores de atributos ou definir novos valores
  Elas protegem os valores da classe que estarão como private,
    sendo vistos apenas por ela mesma
  Getter
    Retorna  o valor do atributo especificado
  Setter
    Define novo valor ou modifica o valor do atributo especificado
  EX: Ver ExGettersSetters no pacote

Construtores
  Construção, inicialização e instanciação de objetos, é básicamente a mesma coisa
  Padrão de criação de objetos:
    Classe novoObjeto = new Classe();
  Método construtor
    Eu obrigo a pessoa a criar o novo objeto já com os dados que eu definir
    No caso, quando eu não coloco os Setters de algum atributo,
      a pessoa é obrigada a definir os atributos no momento da criação do objeto
      EX: Ver Classe Pessoa e SistemaCadastro
  Não abusar dos parametros
    Pode criar vários construtores, mas não é recomendado criar vários

Enums
  É um tipo especial de classe onde os objetos são previamente criados,
    imutáveis e disponíveis por toda aplicação
  São criados para valores que não sofrem alterações frequentes

UML
  Linguagem de Modelagem Unificada
  É uma representação do projeto em forma gráfica (Parecido com DER no SQL)
  Diagramas, Elementos, Relacionamentos
  Dividida em duas categorias de diagramas (Estrutural e Comportamental)
    Estrutural
      Diagrama de Classe:
        É usado paara fazer representação de estruturas de classes de negócio,
          interfaces e outros componentes do sistema.
        É considerado o mais importante para a UML,
          pois auxilia a maioria dos demais diagramas.
        Ilustra graficamente como classes serão estruturadas e interligadas
          entre si diante da proposta do nosso software.
        Em diagrama a estrutura das classes é constituída por:
          Identificação: Nome e/ou finalidade da classe
          Atributos: Propriedades e/ou características
          Operações: Ações e/ou métodos
      Diagrama de objetos:
        Representa os objetos existentes em um determinado instante ou fato da aplicação
      Relacionamentos:
        Relação de uma classe com a outra
        Agregação:
          A classe pricipal contém uma relação com a outra classe,
            mas pode existir sem que a classe agregadora.
            Ex: Classe Candidato,
            podemos ter candidatos cadastratos que ainda não possuam profissão definida.
        Composição:
          Tem uma dependência existencial entre a classe principal e a classe associada.
          Ex: Admissão só pode existir se tiver a composição de sum candidato selecionado.
        Multiplicidade:
          1. Representa uma associação contendo um elemento.
          *. Representa uma associação contendo uma lista de elementos.
          0..1 Representa uma associação contendo zero ou um elemento.
          0..* Representa uma associação contendo zero ou uma lista de elementos.
      Visibilidade:
        Niveis de visibilidade de os atributos ou métodos de uma classe tem.
        + Visibilidade pública
        # Visibilidade protegida (muito usada com herança)
        - Visibilidade privada

*/
}
