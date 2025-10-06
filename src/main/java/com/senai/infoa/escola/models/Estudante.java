package com.senai.infoa.escola.models;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="estudante")
public class Estudante {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="estudante_id")
    private Integer estudanteId;

    @Column(name="nome")
    private String nome;

    @Column(name="matricula")
    private String matricula;

    @Column(name="data_nascimento")
    private LocalDate dataNascimento;

    public Estudante() {}

    public Estudante(String nome, String matricula, LocalDate dataNascimento){
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getEstudanteId() {
        return estudanteId;
    }

    public void setEstudanteId(Integer estudanteId) {
        this.estudanteId = estudanteId;
    }
    
    
}


