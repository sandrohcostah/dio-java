public class BancoDeDadosRelacionais {
/*
Introdução a Banco de dados relacionais
  Funcionalidades básicas:
    CRUD (Creat, Read, Update, Delete)
  Tupla = Linhas, registros
  Transações ACID (Garante que as operações sejam executadas de modo seguro):
    Atomicidade
      Garante que todas operações sejam executadas com sucesso 
      ou nenhuma seja executada caso tenha algum problema.
    Consistência
      Garante que o banco de dados saia de um estado consistênte para outro estado consistênte.
    Isolamento
      Cada transação é executada de forma isolada, não interferindo em outras transações.
    Durabilidade
      Garante que após a transação, essa alteração de informações seja permanente.

SQL é uma linguagem de consulta padronizada
  DQL - Linguagem de consulta de dados
    SELECT
  DML - Linguagem de manipulação de dados
    INSERT, UPDATE, DELETE
  DDL - Linguagem de definição de dados
    CREATE, ALTER, DROP
  DCL - Linguagem de controle de dados
    GRANT, REVOKE
  DTL - Linguagem de transação de dados
    BEGIN, COMMIT, ROLLBACK
  Site: sqltutorial.org

MER e DER: Modelagem de dados
  MER é um modelo usado para representar a estrutura geral de um banco de dados
  DER é uma representação gráfica do modelo MER
  Entidade = tabela
  Atributos = Colunas (Caracteristicas e propriedades das entidades)
  Site usado para criar diagramas: app.creately.com
  Relacionamentos
    Importante marcar o nome dos relacionamentos
    Cardinalidades
      Indicam o grau de relação que as entidades podem ter umas com as outras
      Relacionamento 1..1 (um pra um)
      Relacionamento 1..n (um pra muitos)
      Relacionamentos n..n (muitos pra muitos)
  app.quickdatabasediagrams.com

Modelagens de dados relacionais
  COMENT para comentar os dados da coluna
  Passar dados de uma tabela para outra
    INSERT INTO tabela_nova (coluna1, coluna2)
    SELECT coluna1, coluna2 FROM tabela_antiga

Normalização de dados (Formas normais)
  Processo feito ainda na fase inicial da criação do banco de dados
  Busca eliminar redundâncias e anomalias, garantindo a consistência e integridade dos dados

Indices
  Permite analisar as operações executadas
  Importante para identificar possíveis melhorias de desempenho
    EXPLAIN SELECT * FROM TABELA
  Criar um indice
    CREATE INDEX nome_index_criado ON tabela (coluna);

*/
}
