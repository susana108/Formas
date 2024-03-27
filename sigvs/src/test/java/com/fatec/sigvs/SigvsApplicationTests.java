package com.fatec.sigvs;

import com.fatec.sigvs.model.IProdutoRepository;
import com.fatec.sigvs.model.Produto;
import com.fatec.sigvs.model.ProdutoDTO;
import com.fatec.sigvs.servico.IProdutoServico;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

@SpringBootTest
class SigvsApplicationTests {

    @Autowired
    IProdutoServico produtoServico;

    @Autowired
    IProdutoRepository repository;

    @Test
    void contextLoads() {
    }

    @Test
    void validarPersistencia(){
        repository.deleteAll();
        Produto produto1 = new Produto("Eletrobomba 110v para Maquina de Lavar e Lava Louças", "Maquina de lavar", 51.66, 12);
        repository.saveAll(Arrays.asList(produto1));
        assertEquals(1, repository.count());
    }

    @Test
    void validarServico(){
        repository.deleteAll();
        ProdutoDTO produto1 = new ProdutoDTO("Eletrobomba 110v para Maquina de Lavar e Lava Louças", "Maquina de lavar", 51.66, 12);
        produtoServico.cadastrar(produto1);
        assertEquals(1, repository.count());
    }



    @Test
    void validaDB() {
        Produto produto1 = new Produto("Eletrobomba 110v para Maquina de Lavar e Lava Louças", "Maquina de lavar", 51.66, 12);
        repository.saveAll(Arrays.asList(produto1));
    }

    @Test
    void validaServico() {
        ProdutoDTO produto1 = new ProdutoDTO("Eletrobomba 110v para Maquina de Lavar e Lava Louças", "Maquina de lavar", 51.66, 12);
        produtoServico.cadastrar(produto1);
    }


}
