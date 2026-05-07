package com.example.RPG_Manager20.Model.Entities;

import com.example.RPG_Manager20.Model.Enums.Atributos;
import com.example.RPG_Manager20.Model.Enums.Classes;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name= "tb_classes")
public class Classe extends AbstractModel{
    private Classes nomeClasse;
    private int dadoDeVida;
    private List<String> proficienciasArmas;
    private List<String> proficienciasArmaduras;
    private List<Atributos> proficienciaSalvaguarda;
    private List<String> proficienciaFerramentas;

    public Classe() {
    }

    public Classe(Classes nomeClasse, int dadoDeVida, List<String> proficienciasArmas, List<String> proficienciasArmaduras, List<Atributos> proficienciaSalvaguarda, List<String> proficienciaFerramentas) {
        this.nomeClasse = nomeClasse;
        this.dadoDeVida = dadoDeVida;
        this.proficienciasArmas = proficienciasArmas;
        this.proficienciasArmaduras = proficienciasArmaduras;
        this.proficienciaSalvaguarda = proficienciaSalvaguarda;
        this.proficienciaFerramentas = proficienciaFerramentas;
    }

    public Classes getNomeClasse() {
        return nomeClasse;
    }

    public void setNomeClasse(Classes nomeClasse) {
        this.nomeClasse = nomeClasse;
    }

    public int getDadoDeVida() {
        return dadoDeVida;
    }

    public void setDadoDeVida(int dadoDeVida) {
        this.dadoDeVida = dadoDeVida;
    }

    public List<String> getProficienciasArmas() {
        return proficienciasArmas;
    }

    public void setProficienciasArmas(List<String> proficienciasArmas) {
        this.proficienciasArmas = proficienciasArmas;
    }

    public List<String> getProficienciasArmaduras() {
        return proficienciasArmaduras;
    }

    public void setProficienciasArmaduras(List<String> proficienciasArmaduras) {
        this.proficienciasArmaduras = proficienciasArmaduras;
    }

    public List<Atributos> getProficienciaSalvaguarda() {
        return proficienciaSalvaguarda;
    }

    public void setProficienciaSalvaguarda(List<Atributos> proficienciaSalvaguarda) {
        this.proficienciaSalvaguarda = proficienciaSalvaguarda;
    }

    public List<String> getProficienciaFerramentas() {
        return proficienciaFerramentas;
    }

    public void setProficienciaFerramentas(List<String> proficienciaFerramentas) {
        this.proficienciaFerramentas = proficienciaFerramentas;
    }
}
