package com.example.datajpa.Controller;

import com.example.datajpa.Service.AtletasService;
import com.example.datajpa.entities.Atleta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AtletasController {
    @Autowired
    private AtletasService atletasService;

    public ResponseEntity<Atleta> createAtleta(@RequestBody Atleta novoAtleta) {
        Atleta atletaSalvo = atletasService.createAtleta(novoAtleta);
        return ResponseEntity.ok(atletaSalvo);
    }
}
