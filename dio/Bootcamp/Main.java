package dio.Bootcamp;

import java.time.LocalDate;

//import dio.Bootcamp.Dominio.Conteudo;
import dio.Bootcamp.Dominio.*;

public class Main {
  public static void main(String[] args) {
    Curso c = new Curso();
    c.setTitulo("Curso1");
    c.setDescricao("Curso de x");
    c.setCargaHoraria(4);

    System.out.println(c);

    Mentoria m = new Mentoria();
    m.setTitulo("Mentoria1");
    m.setDescricao("Mentoria de x");
    m.setData(LocalDate.now());

    System.out.println(m);

    //polimorfismo
    //Criar um curso a partir da classe conteudo
    //Conteudo conteudo = new Curso();
    //não posso dar um new em conteudo por que é uma classe abstrata
    
    //Criando bootcamp
    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp java");
    bootcamp.setDescricao("Bootcamp java");
    
    bootcamp.getConteudos().add(c);
    bootcamp.getConteudos().add(m);

    //Criando devs
    Dev Sandroh = new Dev();
    Sandroh.setNome("Sandroh");
    Sandroh.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos " + Sandroh.getConteudosInscritos());
    
    Sandroh.progredir();
    System.out.println("Conteudos concluidos " + Sandroh.getConteudosConcluidos());
    System.out.println("XP " + Sandroh.calcularTotalXp());

    Dev Camila = new Dev();
    Camila.setNome("Camila");
    Camila.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos " + Camila.getConteudosInscritos());
    Camila.progredir();
    System.out.println("Conteudos concluidos " + Camila.getConteudosConcluidos());



  }
}
