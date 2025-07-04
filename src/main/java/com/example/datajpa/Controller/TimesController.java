package com.example.datajpa.Controller;

import com.example.datajpa.Service.TimesService;
import com.example.datajpa.entities.Times;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimesController {

    @Autowired
    private TimesService timesService;

    public ResponseEntity<Times> criarTime(@RequestBody Times novoTime) {
        Times timeSalvo = timesService.createTimes(novoTime);
        return ResponseEntity.ok(timeSalvo);
    }
}
