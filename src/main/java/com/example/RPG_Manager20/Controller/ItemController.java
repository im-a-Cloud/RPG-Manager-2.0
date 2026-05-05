package com.example.RPG_Manager20.Controller;

import com.example.RPG_Manager20.Model.DTO.ItemDTO;
import com.example.RPG_Manager20.Model.Entities.Item;
import com.example.RPG_Manager20.Model.Mapper.ItemMapper;
import com.example.RPG_Manager20.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private ItemMapper itemMapper;

    public ItemController(ItemService itemService) {

    }
    @PostMapping("/criar")
    public ResponseEntity<ItemDTO> crate(@RequestBody ItemDTO itemDTO){
        Item item = itemMapper.toEntity(itemDTO);
        itemService.save(item);
        return new ResponseEntity<>(itemMapper.toDto(item), HttpStatus.CREATED);
    }
    @GetMapping("/listarTodos")
    public List<ItemDTO> listarTodos(){
        return itemService.list().stream().map(u->itemMapper.toDto(u)).collect(Collectors.toList());
    }
    @GetMapping("/listar/{idItem}")
    public ResponseEntity<ItemDTO> getItem(@PathVariable("idItem") Long idItem){
        return new ResponseEntity<>(itemMapper.toDto(itemService.findById(idItem)), HttpStatus.CREATED);
    }
}
