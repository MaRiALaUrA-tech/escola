package com.senai.infoa.escola.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="unidade_curricular")
public class UnidadeCurricular {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="unidade_curricular_id")
    private Integer unidadeCurricularId;

    @Column(name="inicio")
    private LocalDate inicio;

    @Column(name="nome")
    private String nome;

    @Column(name="termino")
    private LocalDate termino;

    @ManyToOne         //Muitos para um: muitas unidades curriculares para um professor
    @JoinColumn(name = "professor_id", nullable = false)  //Une professor_id da tabela UC com a tabela professor
    private Professor professor;

    public UnidadeCurricular() {}

    public UnidadeCurricular(LocalDate inicio, String nome, LocalDate termino){
        this.inicio = inicio;
        this.nome = nome;
        this.termino = termino;
    }

    public Integer getUnidadeCurricularId() {
        return unidadeCurricularId;
    }

    public void setUnidadeCurricularId(Integer unidadeCurricularId) {
        this.unidadeCurricularId = unidadeCurricularId;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getTermino() {
        return termino;
    }

    public void setTermino(LocalDate termino) {
        this.termino = termino;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    

    
    
}
