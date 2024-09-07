package dio.CollectionsJava.Introducao;

public class Introducao {
/*
Um collection é uma estrutura de dados que serve para agrupar muitos elementos
em uma única unidade, estes elementos precisam ser objetos
Quatro tipos de coleções
  List, Queue, Set e Map
  Todas estão dentro do pacote java.util

Entenden o generics Type
  public class Box{
    private Object object;

    public void set(Object object){
      this.object = object;
    }
    public Object get(){
      return object;
    }
  }
  <> diamond operator
  Você cria uma declaração do tipo genérico, alterando o código
  "public class Box" para "public class Box<T>"
  public class Box<T>{ //T representa o tipo
    private T t;

    public void set(T t){
      this.t = t;
    }
    public T get(){
      return t;
    }
  }
  Todas ocorrências de object foram substituidas por t
  Uma variável de tipo pode ser qualquer tipo não primitivo que você quiser.
  Qualquer tipo de classe, interface, array ou até mesmo outra variável de tipo.
  Nomes mais usados:
    E = elemento
    K = Chave
    N = número
    T = Tipo
    V = valor
    S, U, etc

Conhecendo as interfaces comparable e comparator
  Comparable
    Usada para ser comparações, colocar uma lista em ordem alfabética...
    Comparable está dentro do pacote java.lang
    Fornece o método compareto()
    Colocar os elementos de uma lista em ordem usando collections.sort(lista)
  Comparator
    Oferece o método compare()
    Fornece multiplas sequências de ordenação. Pode ordenar por varios itens
    Comparator está no pacote java.util
    Colocar elementos em ordem em uma lista Collections.sort(Lista, Comparator)
  Collections
    É uma classe utilitária do java para operações comuns em coleções
    Ela fornece métodos para ordenação, busca, manipulação e sincronização de coleções
    O método sort() é usado para ordenar uma lista em ordem ascendente

    */
}
