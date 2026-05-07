package com.example.RPG_Manager20.Service;


import com.example.RPG_Manager20.Model.DTO.PersonagemDTO;
import com.example.RPG_Manager20.Model.Entities.Personagem;
import com.example.RPG_Manager20.Model.Enums.ErrorMessageUtils;
import com.example.RPG_Manager20.Repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagemService {

    @Autowired
    private PersonagemRepository personagemRepository;

    public PersonagemService(PersonagemRepository personagemRepository) {
        this.personagemRepository = personagemRepository;
    }
    public Personagem save(Personagem personagem){
        /*if (personagem.getNivelPersonagem() < 1 || personagem.getNivelPersonagem() > 20) {
            throw new RuntimeException("Nível deve ser entre 1 e 20");
        }

         */
        return personagemRepository.save(personagem);
    }
    public List<Personagem> list(){
        return personagemRepository.findAll();
    }
    public void delete(Long idPersonagem){
        personagemRepository.delete(idPersonagem);
    }
    public Personagem update(PersonagemDTO personagemAtualizado, Long idPersonagem){
        Personagem personagemDesatualizado = findById(idPersonagem);
        return personagemRepository.save(personagemDesatualizado);
    }

    public Personagem findById(Long idPersonagem) {
        Personagem personagem = personagemRepository.getById(idPersonagem);
        if (personagem == null) {
            throw new BusinessException(HttpStatus.NOT_FOUND, ErrorMessageUtils.ERROR_NOT_FOUND.getMessage("Personagem"));
        }
        return personagem;
    }
}
