public class SetInterface {
/*
Set Interface
  É uma coleção que não pode ter elementos duplicados
  Java possui três implementações principais
    HashSet
    TreeSet
    LinkedHashSet
  A interface Set não permite acesso aleatório a um elemento da coleção

Operações Básicas
  Crie uma classe chamada "ConjuntoConvidados" que possui um conjunto 
    de objetos do tipo "Convidado" como atributo. Cada convidado possui 
    atributos como nome e código do convite.
    Implemente os seguintes métodos:
    adicionarConvidado(String nome, int codigoConvite): 
      Adiciona um convidado ao conjunto.
    removerConvidadoPorCodigoConvite(int codigoConvite): 
      Remove um convidado do conjunto com base no código do convite.
    contarConvidados(): 
      Conta o número total de convidados no Set.
    exibirConvidados(): 
      Exibe todos os convidados do conjunto.

  2. Conjunto de Palavras Únicas
    Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto 
      de palavras únicas como atributo.
    Implemente os seguintes métodos:
    adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.
    removerPalavra(String palavra): Remove uma palavra do conjunto.
    verificarPalavra(String palavra): Verifica se uma palavra está presente no conjunto.
    exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto.

Pesquisa em Set
1. Agenda de Contatos
  Crie uma classe chamada "AgendaContatos" que possui um conjunto de objetos 
    do tipo "Contato" como atributo. Cada contato possui atributos 
    como nome e número de telefone.
  
  Implemente os seguintes métodos:
    adicionarContato(String nome, int numero): Adiciona um contato à agenda.
    exibirContatos(): Exibe todos os contatos da agenda.
    pesquisarPorNome(String nome): Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.
    atualizarNumeroContato(String nome, int novoNumero): Atualiza o número de telefone de um contato específico.

2. Lista de Tarefas
  Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos 
    do tipo "Tarefa" como atributo. Cada tarefa possui um atributo de 
    descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. 
    
  Implemente os seguintes métodos:
    adicionarTarefa(String descricao): Adiciona uma nova tarefa ao Set.
    removerTarefa(String descricao): Remove uma tarefa do Set de acordo com a descrição, se estiver presente.
    exibirTarefas(): Exibe todas as tarefas da lista de tarefas.
    contarTarefas(): Conta o número total de tarefas na lista de tarefas.
    obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
    obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
    marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de acordo com a descrição.
    marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de acordo com a descrição.
    limparListaTarefas(): Remove todas as tarefas da lista de tarefas.


*/
}
