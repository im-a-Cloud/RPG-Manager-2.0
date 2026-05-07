package com.example.RPG_Manager20.Model.DTO;

import com.example.RPG_Manager20.Model.Enums.Atributos;
import com.example.RPG_Manager20.Model.Enums.Classes;

import java.util.List;

public record ClasseDTO(
        Classes nomeClasse,
        int dadoDeVida,
        List<String>proficienciasArmas,
        List<String> proficienciasArmaduras,
        List<Atributos> proficienciaSalvaguarda,
        List<String> proficienciaFerramentas
){
}
