package com.example.RPG_Manager20.Model.Entities;

import com.example.RPG_Manager20.Model.Enums.Atributos;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_personagem")
public class Personagem extends AbstractModel {

    private String nomePersonagem;
    private int nivelPersonagem;
    private int valorForca;
    private int valorDestreza;
    private int valorConstituicao;
    private int valorInteligencia;
    private int valorSabedoria;
    private int valorCarisma;

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

    /*
    public int getBonusPorAtributo(Atributos atributo) {
        int valor = switch (atributo) {
            case FORCA -> valorForca;
            case DESTREZA -> valorDestreza;
            case CONSTITUICAO -> valorConstituicao;
            case INTELIGENCIA -> valorInteligencia;
            case SABEDORIA -> valorSabedoria;
            case CARISMA -> valorCarisma;
        };
        return (valor - 10) / 2;
    }

 */
}