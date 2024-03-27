package com.fatec.sigvs.model;

public record ProdutoDTO(
        String descricao,
        String categoria,
        double custo,
        int quantidadeNoEstoque
)
{
}
