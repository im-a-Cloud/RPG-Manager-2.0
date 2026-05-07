package com.example.RPG_Manager20.Model.Mapper;

import com.example.RPG_Manager20.Model.DTO.ClasseDTO;
import com.example.RPG_Manager20.Model.Entities.Classe;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface ClasseMapper {
    Classe toEntity(ClasseDTO classesDTO);
    ClasseDTO toDto(Classe entity);
}
