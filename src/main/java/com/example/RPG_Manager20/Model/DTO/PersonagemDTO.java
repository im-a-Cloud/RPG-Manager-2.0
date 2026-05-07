package com.example.RPG_Manager20.Model.DTO;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public record PersonagemDTO(
        String nomePersonagem,
        @Min(value = 1, message = "Nível deve ser entre 1 e 20")
        @Max(value = 20, message = "Nível deve ser entre 1 e 20")
        int nivelPersonagem) {
}
