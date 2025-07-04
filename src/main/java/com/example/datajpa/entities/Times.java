package com.example.datajpa.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "TIMES")
public class Times {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private LocalDateTime fundacao;
    private String pais;

    @OneToMany(mappedBy = "time", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Atleta> atletas;

    public Times(String nome, LocalDateTime fundacao, String pais) {
        this.nome = nome;
        this.fundacao = fundacao;
        this.pais = pais;
    }

    public Times() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getFundacao() {
        return fundacao;
    }

    public void setFundacao(LocalDateTime fundacao) {
        this.fundacao = fundacao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(List<Atleta> atletas) {
        this.atletas = atletas;
    }
}
