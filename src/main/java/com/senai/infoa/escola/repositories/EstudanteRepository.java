package com.senai.infoa.escola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infoa.escola.models.Estudante;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Integer>{  /*Comunicação com o banco de dados */ /*Integer é do id */
    
}
