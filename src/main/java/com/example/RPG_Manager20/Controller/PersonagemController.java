package com.example.RPG_Manager20.Controller;

import com.example.RPG_Manager20.Model.DTO.PersonagemDTO;
import com.example.RPG_Manager20.Model.Entities.Personagem;
import com.example.RPG_Manager20.Model.Mapper.PersonagemMapper;
import com.example.RPG_Manager20.Service.PersonagemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/personagem")
public class PersonagemController {

    @Autowired
    private PersonagemService personagemService;

    @Autowired
    private PersonagemMapper personagemMapper;

    public PersonagemController(PersonagemService personagemService) {

    }
    @PostMapping("/criar")
    public ResponseEntity<PersonagemDTO> create(@Valid @RequestBody PersonagemDTO personagemDTO) {
        Personagem personagem = personagemMapper.toEntity(personagemDTO);
        personagem = personagemService.save(personagem);
        return new ResponseEntity<>(personagemMapper.toDto(personagem), HttpStatus.CREATED);
    }
    @GetMapping("/listarTodos")
        public List<PersonagemDTO> listar() {
        return personagemService.list().stream().map(u-> personagemMapper.toDto(u)).collect(Collectors.toList());
    }
    @GetMapping("/listar/{idPersonagem}")
    public ResponseEntity<PersonagemDTO> getPersonagem(@PathVariable("idPersonagem") Long idPersonagem){
        return new ResponseEntity<>(personagemMapper.toDto(personagemService.findById(idPersonagem)), HttpStatus.CREATED);
    }
}
