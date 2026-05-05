package com.example.RPG_Manager20.Service;

import com.example.RPG_Manager20.Model.DTO.MagiaDTO;
import com.example.RPG_Manager20.Model.Entities.Magia;
import com.example.RPG_Manager20.Model.Enums.ErrorMessageUtils;
import com.example.RPG_Manager20.Repository.MagiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagiaService {
    @Autowired
    MagiaRepository magiaRepository;

    public MagiaService(MagiaRepository magiaRepository){
        this.magiaRepository = magiaRepository;
    }
    public Magia save(Magia magia){
        return magiaRepository.save(magia);
    }
    public List<Magia> list(){
        return magiaRepository.findAll();
    }
    public void delete(Long idMagia){
        magiaRepository.deleteById(idMagia);
    }

    public Magia update(MagiaDTO magiaDTO, Long idMagia){
        Magia magiaAntiga = findById(idMagia);
        return magiaRepository.save(magiaAntiga);
    }

    public Magia findById(Long idMagia){
        Magia magia = magiaRepository.getById(idMagia);
        if (magia == null){
            throw new BusinessException(HttpStatus.NOT_FOUND, ErrorMessageUtils.ERROR_NOT_FOUND.getMessage("Magia"));
        }
        return magia;
    }
}

