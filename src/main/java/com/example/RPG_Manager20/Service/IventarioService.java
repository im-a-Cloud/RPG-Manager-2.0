package com.example.RPG_Manager20.Service;

import com.example.RPG_Manager20.Model.DTO.Request.ItemRequestDTO;
import com.example.RPG_Manager20.Model.DTO.Response.ItemResponseDTO;
import com.example.RPG_Manager20.Model.Entities.Item;
import com.example.RPG_Manager20.Model.Mapper.ItemMapper;
import com.example.RPG_Manager20.Repository.ItemRepository;
import com.example.RPG_Manager20.Repository.PersonagemRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IventarioService {
    @Autowired
    private PersonagemRepository personagemRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private PersonagemService personagemService;

    @Autowired
    private ItemMapper itemMapper;

    @Transactional
    public ItemResponseDTO criarItem(ItemRequestDTO requestDTO) {
        Item item = itemMapper.toEntity(requestDTO);
        item = itemRepository.save(item);
        return itemMapper.toDto(item);
    }
}
