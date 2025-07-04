package com.example.datajpa.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "ATLETAS")
public class Atleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String posicao;

    @ManyToOne
    @JoinColumn(name = "time_id", nullable = false)
    private Times time;

    public Atleta(String nome, String posicao, Times time) {
        this.nome = nome;
        this.posicao = posicao;
        this.time = time;
    }

    public Atleta() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Times getTime() {
        return time;
    }

    public void setTime(Times time) {
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
