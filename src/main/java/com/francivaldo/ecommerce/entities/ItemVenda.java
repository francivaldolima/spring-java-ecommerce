package com.francivaldo.ecommerce.entities;

import jakarta.persistence.*;

@Entity
public class ItemVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double quantidade;

    @OneToOne
    private Produto produto;


    public ItemVenda(){

    }

    public ItemVenda(Long id, Double quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double total(){
        return produto.getValor() * quantidade;
    }
}
