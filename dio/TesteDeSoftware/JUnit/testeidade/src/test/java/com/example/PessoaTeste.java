package com.example.*;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class PessoaTeste {
    
    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa sandroh = new Pessoa('sandroh', LocalDate.of(1988, 3, 31));
        Assertions.assertEquals(36, sandroh.getIdade());
    }

    @Test
    void deveSerMaiorDeIdade(){
        Pessoa sandroh = new Pessoa('sandroh', LocalDate.of(1988, 3, 31));
        Assertions.assertTrue(sandroh.ehMaiorDeIdade());
    }
}
