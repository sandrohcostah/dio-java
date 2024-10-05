package dio.Maven;

public class Maven {
/*
O que é o Apache Maven?
  Ferramenta para gerenciar build e dependências de um projeto.
  Auxilia em empacotar o app

Compilar as classes
  mvn compile
  mvn test = testa a aplicação
  mvn package = empacota o arquivo em .jar
  mvn clean = apaga a pasta

Criando projetos diferentes
  Maven archetype
  Pesquisar "maven archetype list"

POM
  É um arquivo xml (pom.xml)
  Detalha o projeto

Repositórios
  Podemos encontrar plugins e bibiliotecas que o maven provê
  É configurado para referenciar o maven central como padrão
  Maven entral é um site com todas as dependÊncias
  Repositório remoto
    Podemos configurar o maven para usar um repositório remoto especifico
    via settings.xml
    fica em: pasta_maven\conf\settings.xml
  Repositório local
    é semelhante ao remoto mas fica na máquina
    fica em: %userprofile%\.m2\repository
    é usado como estratégia de caching

Como adicionar dependências
  ir até o pom.xml
  procurar pela tag <dependenies>

Gerenciando dependências
  Tipos de dependências
    mvn install = publica localmente o componente
    Dependência direta = declaradas no pom.xml
    DependÊncia transitiva = Obrigatória das dependências declaradas no pom.xml

3 ciclos de vida do maven
  Default Lifecycle
    Ciclo principal
    Responsável pelo deploy lolcal
    Composto por 23 fases (comandos)
  Clean Lifecycle
    Limpeza do projeto
    pre-clean, clean, post-clean
  Site Lifecycle
    Publicação do projeto
    pre-site, site, post-site, site-deploy


*/
}
