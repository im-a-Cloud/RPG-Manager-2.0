package com.example.RPG_Manager20.Model.Entities;

import com.example.RPG_Manager20.Model.Enums.Atributos;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_personagem")
public class Personagem extends AbstractModel {

    private String nomePersonagem;
    private int nivelPersonagem;

    // Atributos

    private int valorForca;
    private int valorDestreza;
    private int valorConstituicao;
    private int valorInteligencia;
    private int valorSabedoria;
    private int valorCarisma;

    //Ligacção com classe, permitindo que um personagem tenha classe

    @ManyToOne
    @JoinColumn(name = "classe_id")
    private Classe classePersonagem;

    @ManyToMany
    @JoinTable(
            name = "personagem_magia",
            joinColumns = @JoinColumn(name = "personagem_id"),
            inverseJoinColumns = @JoinColumn(name = "magia_id")
    )
    private List<Magia> magias = new ArrayList<>();


    public Personagem() {
    }

    public Personagem(String nomePersonagem, int nivelPersonagem, int valorForca, int valorDestreza, int valorConstituicao, int valorInteligencia, int valorSabedoria, int valorCarisma) {
        this.nomePersonagem = nomePersonagem;
        this.nivelPersonagem = nivelPersonagem;
        this.valorForca = valorForca;
        this.valorDestreza = valorDestreza;
        this.valorConstituicao = valorConstituicao;
        this.valorInteligencia = valorInteligencia;
        this.valorSabedoria = valorSabedoria;
        this.valorCarisma = valorCarisma;
    }

    public List<Magia> getMagias() {
        return magias;
    }

    public void setMagias(List<Magia> magias) {
        this.magias = magias;
    }

    public void adicionarMagia(Magia magia) {
        this.magias.add(magia);
    }

    public void removerMagia(Magia magia) {
        this.magias.remove(magia);
    }

    public Classe getClassePersonagem() {
        return classePersonagem;
    }

    public void setClassePersonagem(Classe classePersonagem) {
        this.classePersonagem = classePersonagem;
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

    public int getValorForca() {
        return valorForca;
    }

    public void setValorForca(int valorForca) {
        this.valorForca = valorForca;
    }

    public int getValorDestreza() {
        return valorDestreza;
    }

    public void setValorDestreza(int valorDestreza) {
        this.valorDestreza = valorDestreza;
    }

    public int getValorConstituicao() {
        return valorConstituicao;
    }

    public void setValorConstituicao(int valorConstituicao) {
        this.valorConstituicao = valorConstituicao;
    }

    public int getValorInteligencia() {
        return valorInteligencia;
    }

    public void setValorInteligencia(int valorInteligencia) {
        this.valorInteligencia = valorInteligencia;
    }

    public int getValorSabedoria() {
        return valorSabedoria;
    }

    public void setValorSabedoria(int valorSabedoria) {
        this.valorSabedoria = valorSabedoria;
    }

    public int getValorCarisma() {
        return valorCarisma;
    }

    public void setValorCarisma(int valorCarisma) {
        this.valorCarisma = valorCarisma;
    }
}