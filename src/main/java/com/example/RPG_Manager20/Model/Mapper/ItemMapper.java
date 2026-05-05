package com.example.RPG_Manager20.Model.Mapper;

import com.example.RPG_Manager20.Model.DTO.ItemDTO;
import com.example.RPG_Manager20.Model.Entities.Item;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    Item toEntity(ItemDTO itemDTO);
    ItemDTO toDto(Item entity);
}
