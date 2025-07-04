package com.example.datajpa.Service;

import com.example.datajpa.Repository.AtletasRepository;
import com.example.datajpa.entities.Atleta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtletasService {
    @Autowired
    private AtletasRepository atletasRepository;

    public Atleta createAtleta(Atleta atleta){
        return atletasRepository.save(atleta);
    }
}
