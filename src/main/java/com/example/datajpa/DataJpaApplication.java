package com.example.datajpa;

import com.example.datajpa.Repository.AtletasRepository;
import com.example.datajpa.Repository.TimesRepository;
import com.example.datajpa.entities.Atleta;
import com.example.datajpa.entities.Times;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class DataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataJpaApplication.class, args);
        System.out.println("Hi");
    }

    @Component
    public class DataInitializer implements CommandLineRunner {

        @Autowired
        private TimesRepository timesRepository;

        @Autowired
        private AtletasRepository atletasRepository;

        @Override
        public void run(String... args) throws Exception {
            Times time = new Times();
            time.setNome("XV de Piracicaba");
            time.setFundacao(LocalDate.of(1913, 11,15).atStartOfDay());
            time.setPais("Brasil");

            timesRepository.save(time);

            Atleta atleta1 = new Atleta();
            atleta1.setNome("Matheus Carvalho");
            atleta1.setPosicao("Atacante");
            atleta1.setTime(time);

            atletasRepository.save(atleta1);
        }
    }
}