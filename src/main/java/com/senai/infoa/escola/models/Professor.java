package com.senai.infoa.escola.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="estudante")
public class Professor {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="professor_id")
    private Integer professorId;

    @Column(name="nome")
    private String nome;

    public Professor() {}

    public Professor(String nome){
        this.nome = nome;    
    }

    public Integer getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Integer professorId) {
        this.professorId = professorId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
