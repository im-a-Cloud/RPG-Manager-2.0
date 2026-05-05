package com.example.RPG_Manager20.Model.Mapper;

import com.example.RPG_Manager20.Model.DTO.MagiaDTO;
import com.example.RPG_Manager20.Model.DTO.MagiaListDTO;
import com.example.RPG_Manager20.Model.Entities.Magia;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MagiaMapper {
    Magia toEntity(MagiaDTO dto);
    MagiaDTO toDto(Magia magia);
    MagiaListDTO toListDTO(Magia magia);
    List<MagiaListDTO> toListDTOList(List<Magia> magias);
    void updateEntity(@MappingTarget Magia target, MagiaDTO source);
}
