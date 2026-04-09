package com.example.demo.models;

import com.example.demo.enums.ProdutoEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class ProdutoModel{

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String descricao;
    private Long preco;
    private ProdutoEnum produtoEnum;

    public ProdutoModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = this.nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getPreco() {
        return preco;
    }

    public void setPreco(Long preco) {
        this.preco = preco;
    }

    public ProdutoEnum getProdutoEnum() {
        return produtoEnum;
    }

    public void setProdutoEnum(ProdutoEnum produtoEnum) {
        this.produtoEnum = this.produtoEnum;
    }
}