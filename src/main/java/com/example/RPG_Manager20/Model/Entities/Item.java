package com.example.RPG_Manager20.Model.Entities;

import com.example.RPG_Manager20.Model.Enums.RaridadeItem;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_item")
public class Item extends AbstractModel{
    private String nomeItem;
    private String descricaoItem;
    private double precoItem;
    private RaridadeItem raridadeItem;

    public Item(){

    }

    public Item(String nomeItem, String descricaoItem, double precoItem, RaridadeItem raridadeItem) {
        this.nomeItem = nomeItem;
        this.descricaoItem = descricaoItem;
        this.precoItem = precoItem;
        this.raridadeItem = raridadeItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public RaridadeItem getRaridadeItem() {
        return raridadeItem;
    }

    public void setRaridadeItem(RaridadeItem raridadeItem) {
        this.raridadeItem = raridadeItem;
    }
}
