package com.example.RPG_Manager20.Model.DTO;

import com.example.RPG_Manager20.Model.Enums.Atributos;
import com.example.RPG_Manager20.Model.Enums.Classes;
import com.example.RPG_Manager20.Model.Enums.TipoConjuracao;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record ClasseDTO(
        @NotNull(message = "Nome da classe é obrigatório")
        Classes nomeClasse,

        @Min(value = 6, message = "Dado de vida deve ser no mínimo 6")
        int dadoDeVida,

        List<String> proficienciasArmas,
        List<String> proficienciasArmaduras,
        List<Atributos> proficienciaSalvaguarda,
        List<String> proficienciaFerramentas,

        // Novos campos
        boolean isConjurador,

        Atributos atributoConjuracao,

        TipoConjuracao tipoConjuracao
) {
    // Método auxiliar para verificar se é conjurador
    public boolean isConjurador() {
        return isConjurador;
    }

    // Método auxiliar para verificar se é conjurador completo
    public boolean isConjuradorCompleto() {
        return tipoConjuracao == TipoConjuracao.COMPLETO;
    }

    // Método auxiliar para verificar se é meio conjurador
    public boolean isMeioConjurador() {
        return tipoConjuracao == TipoConjuracao.MEIO;
    }

    // Método auxiliar para verificar se é terciário
    public boolean isTerciarioConjurador() {
        return tipoConjuracao == TipoConjuracao.TERCIARIO;
    }
}