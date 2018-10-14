/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.senac.gerenciadordeprodutos.model;

import java.math.BigDecimal;

/**
 * @author: Ezaú de Matos Brito  <ezau.mbrito@gmail.com>
 * @version:
 * Main Class File:
 * File: Produto.java
 * Date: Oct 13, 2018
 */
public class Produto {

    private int id;
    private int quantidade;
    private String nome;
    private String descricao;
    private int[] categorias;
    private BigDecimal precoCompra;
    private BigDecimal precoVenda;
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int[] getCategorias() {
        return categorias;
    }

    public void setCategorias(int[] categorias) {
        this.categorias = categorias;
    }

    public BigDecimal getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(BigDecimal precoCompra) {
        this.precoCompra = precoCompra;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    
}