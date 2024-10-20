public class BancoDeDadosNoSql {
/*
Banco de dados orientado a Grafos (Neo4j)
Criar uma lable
  CREATE (:Client {name: "Bob Esponja", age: 28, hobbies: ['Caçar agua viva']})
Consultar o item
  MATCH (bob_esponja) RETURN bob_esponja;
Criar relacionamentos com os nós
  CREATE (:Client {name: "Lula Molusco", age 30, hobbies: ['Tocar clirinete']}) -[:Bloqueado]->(:Client {name: "Patrick", age: 28, hobbies: ['']})
Consultar todos itens
  MATCH (todos) RETURN todos;
Criar relacionamento em dois nós que já existem
  MATCH (lula:Client {name: "Lula molusco"}), (patrick:Client {name:"Patrick"}) CREATE (lula)-[:Bloqueado]->(patrick)
Excluir relacionamento
  MATCH (lula:Client {name: "Lula Molusco"})-[relaciona:Bloqueado]-() DELETE relaciona
Excluir um nó
  MATCH (lula:Client {name: "Lula Mollusco"}) DELETE lula;
Inserir informação no nó
  MATCH (patrick:Client {name: "Patrick"}) SET patrick.hobbies = ['Caçar agua viva'];
Atualizar lable
  MATCH (patrick:Client {name: "Patrick"}) SET patrick:Client_Premium;

Banco de dados baseado em colunas (Cassandra, linguagem CQL)
  Keyspace = database (Agrupamento de familia de colunas)
  Column Family/table = table (Agrupamento de colunas)
  Row key = Primary key (Chave que representa uma linha de coluna)
  Column = Representa uma valor contendo Name, Timestamp
Criar uma Keyspace
  CREATE KEYSPACE fenda_biquini WITH replication - ('class', 'SimpleStrategy', 'replication_factor', 1);
Selecionar Keyspace criada
  use fenda_biquini
Criar uma coluna
  CREATE COLUMNFAMILY cliente (name TEXT PRIMARY KEY, age int);
Consultar coluna criada (SELECT)
  SELECT * FROM cliente;
Inserir dados na coluna
  INSERT INTO cliente (name, age) VALUES ('Bob esponja', 28);
Consulta com where
  SELECT * FROM cliente WHERE name ='Bob esponja';
Consulta retornando em forma de JSON
  SELECT JSON * FROM cliente;
Atualizar dados
  UPDATE cliente SET age=28 WHERE name='Patrick';
Alterar dados, incluir coluna hobby
  ALTER COLUMNFAMILY cliente ADD hobby text;
Deletar registro
  DELETE FROM cliente WHERE name='Bob esponja';

Banco de dados baseado em chave-valor (Redis)
  Busca limitada, só consegue fazer buscas através dda chave dele
Criar usuário
  SET user1:name "Bob esponja"
Consultar registros (SELECT)
  GET user1:name
Adicionando um JSON a estrutura
  SET user '('name': "Patrick", 'age': 31)'
Verificar se registro existe
  EXISTS user1:name
Inserir dados em uma lista
  LPUSH user1:hobbies "Caçar agua vivas"
Acessar os dados da lista
  INDEX user1:hobbies 0 = Acessa o indice 0
Acessar intervalo de indices
  LRANGE user1:hobbies 0 1 = Acessa os valores de 0 a 1 do indice
Verificar tipo de dados de um registro
  TYPE user1:name
Remover o registro
  DEL user1:name

Banco de dados baseado em documentos (MongoDB)
MongoDB
  Código aberto
  Alta performance
  Schema-free (Dentro da mesma collection pode ter estruturas diferentes)
  Suporte a indices
  Tem Map-Reduce
  Document = Tupla/Registro
  Collection = Tabela
  Embedding/Linking = Join
  Quando usar MongoDB:
    Grande volume de dados
    Dados não necessariamente estruturado
  Quando não usar:
    Quando tiver necessidade de relacionamentos/Joins
    Quado propriedades ACID e transações são importante

  Docker Compose
  MongoDB Cloud

Schema design e boas práticas
  Embedding
    Documentos autocontidos
      Tudo que precisar vai estar dentro dele, sem precisar referenciar fora dele
      Prós de uso do Embedding
        Consulta informações em uma unica query
        Atualiza o registro em uma unica operação
      Contras do uso do Embedding
        Limite de 16mb por documento
  Referência
    Docmentos com depência de outros documentos ou collections
    Prós do uso de Referência
      Documentos pequenos
      Não duplica informações
      Usado quando os dados não são acessados em todas as consultas
    Contras do uso de referência
      Duas ou mais queries ou utilziação do $lookup
  https://www.mongodb.com/blog/post/building-with-patterns-a-summary

Boas práticas
  Evite documentos grandes
  Use nome campos objetivos e curtos
  Analise as suas queries utilizando explain()
  Atualiza apenas os campos alterados
  Evite negações em queries (Quando se usa negação, ele faz um scaneamento completo da collection, podendo prejudicar o desempenho)
  Listas/Arrays dentro dos documentos não podem crescer sem limite

Alguns conceitos na prática
  Mostrar databases
    show databases;
  Criar novo database
    use nome_novo_database (Se o database já existir ele muda pra esse, se não, ele cria esse e muda após criar)
  Criar uma collection de forma explicita
    db.createcollection("teste", {cappod: true, max 2, size: 2});
    cappod = collection será limitada
    max = quer só dois documentos
    tamanho = 2
  Inserir um dado dentro da collection
    db.test.insertOne({"nome": "Teste 1"});
  Consultar a collection
    db.clientes.find({});
  Comando save, atualiza um registro ou insere um novo caso não exista
    db.clientes.save()
  Atualizar registro de apenas um dado
    db.clientes.update({"nome": "Bob esponja"},{$set: {"age": 40}})
  Consultar uma lista de possíveis valores
    db.clientes.find({"age": {$set [30, 41]}})
  Usando consulta OR
    db.clientes.find({$or: [{"nome": "Lula molusco"}, {"age": 41}]})
  Comando DELETE
    db.clientes.deleteOne({"age": 55}) = Deleta o primeiro regsitro que encontrar com 55 anos
  Comando DELETE Many
    db.clientes.deleteMany({"age": 55}) = Deleta todos os registros com 55 anos

Performance e indices
  Criar index
    db.getCollection('clientes').createIndex({"name": 1}, {"name": "idx_name"})


*/
}
