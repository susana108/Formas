package com.fatec.sigvs.servico;

import com.fatec.sigvs.model.IProdutoRepository;
import com.fatec.sigvs.model.Produto;
import com.fatec.sigvs.model.ProdutoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Service
public class ProdutoServico  implements  IProdutoServico{
    Logger logger = LogManager.getLogger(this.getClass());
    @Autowired
    IProdutoRepository produtoRepository;
    @Override
    public Optional<Produto> cadastrar(ProdutoDTO p) {
        logger.info(">>>>>> servico cadastrar produto iniciado");
        Produto produto = dtoParaProduto(p);
        return Optional.ofNullable(produtoRepository.save(produto));
    }

    @Override
    public Optional<ProdutoDTO> consultaPorId(Long id) {

        return Optional.empty();
    }

    @Override
    public List<Produto> consultaCatalago() {
        return null;
    }

    @Override
    public ProdutoDTO atualizar(Long id, ProdutoDTO produto) {
        return null;
    }

    @Override
    public void excluir(Long id) {

    }

    public  Produto dtoParaProduto(ProdutoDTO p){
        return  new Produto(p.descricao(), p.categoria(),p.custo(),p.quantidadeNoEstoque());
    }
}
