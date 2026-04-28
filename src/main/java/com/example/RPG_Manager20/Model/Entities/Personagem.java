package com.example.RPG_Manager20.Model.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_personagem")
public class Personagem extends AbstractModel {

    private String nomePersonagem;
    private int nivelPersonagem;

    // 🔥 OBRIGATÓRIO para o JPA
    public Personagem() {
    }

    // (opcional) construtor útil pra você
    public Personagem(String nomePersonagem, int nivelPersonagem) {
        this.nomePersonagem = nomePersonagem;
        this.nivelPersonagem = nivelPersonagem;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public int getNivelPersonagem() {
        return nivelPersonagem;
    }

    public void setNivelPersonagem(int nivelPersonagem) {
        this.nivelPersonagem = nivelPersonagem;
    }
}