package com.example.RPG_Manager20.Model.DTO;

import com.example.RPG_Manager20.Model.Entities.Components;

import java.util.List;

public record MagiaDTO(
        String casting_time,
        List<String> classes,
        ComponentsDTO components,  // ← Certo, usando ComponentsDTO
        String description,
        String duration,
        String level,
        String name,
        String range,
        boolean ritual,
        String school,
        List<String> tags,
        String type
) {}

