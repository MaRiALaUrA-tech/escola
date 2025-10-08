package com.senai.infoa.escola.models;
import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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

    @Column(name="email")
    private String email;

    @ManyToMany //Muitos para muitos: muitos estudantes têm muitas unidades curriculares
    @JoinTable(
        name = "estudante_unidade_curricular",   //Cria uma tabela intermediária
        joinColumns = @JoinColumn(name = "estudante_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "unidade_curricular_id", referencedColumnName = "id")
    )
    private Set<UnidadeCurricular> unidadesCurriculares;          //As UCs estão sendo colocados em uma lista set, ou seja, as UC's não duplicam.

    public Estudante() {}

    public Estudante(String nome, String matricula, LocalDate dataNascimento, String email){
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<UnidadeCurricular> getUnidadesCurriculares() {
        return unidadesCurriculares;
    }

    public void setUnidadesCurriculares(Set<UnidadeCurricular> unidadesCurriculares) {
        this.unidadesCurriculares = unidadesCurriculares;
    }

    

}


