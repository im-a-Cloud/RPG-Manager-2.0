package com.example.RPG_Manager20.Model.Mapper;

import com.example.RPG_Manager20.Model.DTO.PersonagemDTO;
import com.example.RPG_Manager20.Model.Entities.Personagem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonagemMapper {
    Personagem toEntity(PersonagemDTO personagemDTO);
    PersonagemDTO toDto(Personagem entity);
}
