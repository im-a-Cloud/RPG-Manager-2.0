package com.example.RPG_Manager20.Model.Mapper;

import com.example.RPG_Manager20.Model.DTO.HabilidadeDTO;
import com.example.RPG_Manager20.Model.Entities.Habilidade;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface HabilidadeMapper {
    Habilidade toEntity(HabilidadeDTO habilidadeDTO);
    HabilidadeDTO toDto(Habilidade entity);
}
