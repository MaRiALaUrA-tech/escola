package com.senai.infoa.escola.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.infoa.escola.models.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer>{  
    
}
