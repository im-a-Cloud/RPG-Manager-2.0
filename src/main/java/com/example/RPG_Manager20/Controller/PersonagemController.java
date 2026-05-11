package com.example.RPG_Manager20.Controller;

import com.example.RPG_Manager20.Model.DTO.Request.PersonagemRequestDTO;
import com.example.RPG_Manager20.Model.DTO.Response.PersonagemResponseDTO;
import com.example.RPG_Manager20.Model.DTO.Summary.PersonagemSummaryDTO;
import com.example.RPG_Manager20.Service.PersonagemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personagem")
public class PersonagemController {

    @Autowired
    private PersonagemService personagemService;

    @PostMapping("/criar")
    public ResponseEntity<PersonagemResponseDTO> criar(@Valid @RequestBody PersonagemRequestDTO requestDTO) {
        PersonagemResponseDTO response = personagemService.criarPersonagem(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonagemResponseDTO> buscarPorId(@PathVariable Long id) {
        PersonagemResponseDTO response = personagemService.buscarPersonagemPorId(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<PersonagemSummaryDTO>> listarTodos() {
        List<PersonagemSummaryDTO> lista = personagemService.listarPersonagens();
        return ResponseEntity.ok(lista);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonagemResponseDTO> atualizar(
            @PathVariable Long id,
            @Valid @RequestBody PersonagemRequestDTO requestDTO) {
        PersonagemResponseDTO response = personagemService.atualizarPersonagem(id, requestDTO);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        personagemService.deletarPersonagem(id);
        return ResponseEntity.noContent().build();
    }
}